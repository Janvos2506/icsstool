package nl.han.ica.icss.transforms;

import nl.han.ica.icss.ast.*;

import java.util.ArrayList;
import java.util.HashMap;

public class EvalExpressions implements Transform {

    private HashMap<String,Assignment> symboltable; //Another hint...

    @Override
    public void apply(AST ast) {
        symboltable = ast.symboltable;
        evalExpression(ast.root);
        removeVars(ast.root);
    }

    private void removeVars(ASTNode root) {
        ArrayList<Assignment> assignments = new ArrayList<>();
        for (ASTNode node: root.getChildren()) {
            if(node instanceof Assignment) {
                assignments.add((Assignment) node);
            }
        }

        for(Assignment assignment: assignments) {
            root.removeChild(assignment);
        }
    }

    private void evalExpression(ASTNode node) {
        if(node instanceof Declaration) {
            if(((Declaration) node).expression instanceof Operation) {
                ((Declaration) node).expression = calculateExpression((Operation) ((Declaration) node).expression);
            }
            if(((Declaration) node).expression instanceof VariableReference) {
                VariableReference var = (VariableReference) ((Declaration) node).expression;
                ((Declaration) node).expression = symboltable.get(var.name).expression;
            }
        }
        if(node.getChildren().size() <= 0) return;
        node.getChildren().forEach(this::evalExpression);
    }

    private Literal calculateExpression(Operation operation) {
        ASTNode lhs = operation.lhs;
        ASTNode rhs = operation.rhs;

        if(lhs instanceof VariableReference) {
            Assignment a = symboltable.get(((VariableReference) lhs).name);
            lhs = a.expression;
        }

        if(rhs instanceof VariableReference) {
            Assignment a = symboltable.get(((VariableReference) rhs).name);
            rhs = a.expression;
        }

        if(operation.operator.equals(Operation.Operator.PLUS)) {
            if(lhs instanceof PixelLiteral) return new PixelLiteral(((PixelLiteral) rhs).value + ((PixelLiteral) lhs).value);
            if(lhs instanceof PercentageLiteral) return new PixelLiteral(((PercentageLiteral) rhs).value + ((PercentageLiteral) lhs).value);
        }

        if(operation.operator.equals(Operation.Operator.MIN)) {
            if(lhs instanceof PixelLiteral) return new PixelLiteral(((PixelLiteral) rhs).value - ((PixelLiteral) lhs).value);
            if(lhs instanceof PercentageLiteral) return new PixelLiteral(((PercentageLiteral) rhs).value - ((PercentageLiteral) lhs).value);
        }

        return new PixelLiteral(-1);
    }
}
