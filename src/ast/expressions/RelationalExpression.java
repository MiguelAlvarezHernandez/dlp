package ast.expressions;

import ast.AbstractLocatable;

public class RelationalExpression extends AbstractLocatable implements Expression {
    private Expression left;
    private Expression right;
    private String operator;

    public RelationalExpression(Expression left, String operator, Expression right, int line, int column) {
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

    @Override
    public String toString() {
        return "RelationalExpression{" +
                "left=" + left +
                ", right=" + right +
                ", operator='" + operator + '\'' +
                '}';
    }
}

