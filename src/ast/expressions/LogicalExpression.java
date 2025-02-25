package ast.expressions;

import ast.AbstractLocatable;

public class LogicalExpression extends AbstractLocatable implements Expression {
    private Expression left;
    private Expression right;
    private String operator;

    public LogicalExpression(Expression left, String operator, Expression right, int line, int column) {
        super(line, column);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    public String getOperator() {
        return operator;
    }
}
