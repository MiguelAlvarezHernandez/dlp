package ast.expressions;

import ast.AbstractLocatable;

public class ArithmeticExpression extends AbstractLocatable implements Expression {
    private Expression left;

    private Expression right;
    private String operator;


    public ArithmeticExpression(int line, int column,Expression left, String operator, Expression right){
        super(line, column);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public static Expression create(int line, int column,Expression left, String operator, Expression right) {
        if (operator.equals("%")) {

            return new ModuleExpression(line, column, left, right);
        }
        return new ArithmeticExpression(line, column, left, operator, right);
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
        return "ArithmeticExpression{" +
                "left=" + left +
                ", right=" + right +
                ", operator='" + operator + '\'' +
                '}';
    }
}

