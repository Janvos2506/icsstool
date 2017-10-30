package nl.han.ica.icss.checker;

import nl.han.ica.icss.ast.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Checker {

    public enum ExpressionType {
        PIXELVALUE,
        PERCENTAGE,
        COLORVALUE,
        BOOLVALUE,
        UNDEFINED
    }

    private HashMap<String,Assignment> symboltable;

	public void check(AST ast) {
	    //Clear symbol table
        symboltable = new HashMap<>();
        evaluate(ast.root);
		//Save the symbol table.
        ast.symboltable = symboltable;
        //Save the verdict
		if(ast.getErrors().isEmpty()) {
            ast.checked = true;
        }
	}

    private void evaluate(ASTNode node) {
        if(node instanceof Stylesheet) {
            initSymbolTable(node);
            checkNodes(node);
        }
    }

    private void checkNodes(ASTNode node) {

        if(node instanceof VariableReference) {
            if(symboltable.get(((VariableReference) node).name) == null) node.setError("Unknown variable");
        }

        if(node instanceof Operation) {
            ASTNode lhs = ((Operation) node).lhs;
            ASTNode rhs = ((Operation) node).rhs;

            if(lhs instanceof VariableReference) {
                Assignment a = symboltable.get(((VariableReference) lhs).name);
                lhs = a.expression;
            }

            if(rhs instanceof VariableReference) {
                Assignment a = symboltable.get(((VariableReference) rhs).name);
                rhs = a.expression;
            }
            if(!lhs.getClass().equals(rhs.getClass())) node.setError("Can't perform operation with two different types");
        }

        if(node instanceof Declaration) {
            Expression e = ((Declaration) node).expression;
            if(((Declaration) node).property.equals("width")) {
                if (e instanceof VariableReference) {
                    Assignment a = symboltable.get(((VariableReference) e).name);
                    e = a.expression;
                }
                if(e.getClass().equals(ColorLiteral.class))
                    node.setError("Expected size, found color");
            }
        }

        if(node.getChildren().size() <= 0) return;
        node.getChildren().forEach(this::checkNodes);

    }

    private void initSymbolTable(ASTNode node) {
        ArrayList<ASTNode> children = node.getChildren();
        for (ASTNode n: children) {
            if(n instanceof Assignment) symboltable.put(((Assignment) n).name.name, (Assignment) n);
        }
    }
}
