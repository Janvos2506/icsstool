package nl.han.ica.icss.parser;

import nl.han.ica.icss.ast.*;
import nl.han.ica.icss.gen.ICSSBaseListener;
import nl.han.ica.icss.gen.ICSSParser;

import java.util.ArrayList;
import java.util.Stack;

/**
 * This class extracts the ICSS Abstract Syntax Tree from the Antlr Parse tree.
 */
public class ASTListener extends ICSSBaseListener {
	
	//Accumulator attributes:
	private AST ast;
	private Stack<ASTNode> currentContainer; //Yes, this is a hint...

	public ASTListener() {
		ast = new AST();
		currentContainer = new Stack<>();
	}

	@Override public void enterSelector(ICSSParser.SelectorContext ctx) {
		if(ctx.classselector() != null) currentContainer.push(new ClassSelector(ctx.getText()));
		if(ctx.htmltag() != null) currentContainer.push(new TagSelector(ctx.getText()));
		if(ctx.idselector() != null) currentContainer.push(new IdSelector(ctx.getText()));
	}
	
	@Override
	public void enterStyleblock(ICSSParser.StyleblockContext ctx) {
		currentContainer.push(new Stylerule());
	}

	@Override public void enterVariable(ICSSParser.VariableContext ctx) {
		if(!currentContainer.isEmpty()) {
			if(!(currentContainer.peek() instanceof VariableReference))
				currentContainer.push(new VariableReference(ctx.getText()));
		} else {
				currentContainer.push(new VariableReference(ctx.getText()));
		}
	}

	@Override
	public void enterStatementid(ICSSParser.StatementidContext ctx) {
		Declaration declaration = new Declaration();
		declaration.property = ctx.getText();
		currentContainer.push(declaration);
	}

	@Override public void enterHex(ICSSParser.HexContext ctx) { currentContainer.push(new ColorLiteral(ctx.getText())); }

	@Override public void enterSize(ICSSParser.SizeContext ctx) { currentContainer.push(new PixelLiteral(ctx.getText())); }

	@Override
	public void enterOperator(ICSSParser.OperatorContext ctx) {
		Operation operation = new Operation();
		switch(ctx.getText()) {
			case("+"): operation.operator = Operation.Operator.PLUS;
				break;
			case("-"): operation.operator = Operation.Operator.MIN;
				break;
		}
		currentContainer.push(operation);
	}

    public AST getAST() {
        generateTee();
		return ast;
    }

	private void generateTee() {
		while(!currentContainer.empty()) {
			if(currentContainer.peek() instanceof Expression) {
				Expression expression = (Expression) currentContainer.pop();

				if(currentContainer.peek() instanceof Operation) {
					Operation operation = (Operation) currentContainer.pop();
					operation.addChild(expression);
					operation.addChild(currentContainer.pop());
					expression = operation;
				}

				if(currentContainer.peek() instanceof Declaration) {
					ArrayList<Declaration> declarations = new ArrayList<>();
					while(!(currentContainer.peek() instanceof Stylerule)) {

						if(currentContainer.peek() instanceof Operation) {
							Operation operation = (Operation) currentContainer.pop();
							operation.addChild(expression);
							operation.addChild(currentContainer.pop());
							expression = operation;
						}

						Declaration declaration = (Declaration) currentContainer.pop();
						declaration.expression = expression;
						if(currentContainer.peek() instanceof Expression) expression = (Expression) currentContainer.pop();
						declarations.add(declaration);
					}
					Stylerule stylerule = (Stylerule) currentContainer.pop();
					for (Declaration d: declarations) {
						stylerule.addChild(d);
					}
					stylerule.selector = (Selector) currentContainer.pop();
					ast.root.addChild(stylerule);
				}


				else if(currentContainer.peek() instanceof VariableReference) {
					VariableReference var = (VariableReference) currentContainer.pop();
					Assignment assignment = new Assignment();
					assignment.name = var;
					assignment.addChild(expression);
					ast.root.addChild(assignment);
				}
			}
		}
	}
}
