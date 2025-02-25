package ast.expressions;

import ast.AbstractLocatable;

public class ArithmeticExpression extends AbstractLocatable implements Expression {
    private Expression left;
    private Expression right;
    private String operator;

//    public ArithmeticExpression(Expression left, Expression right, String operator, int line, int column) {
//        super(line, column);
//        this.left = left;
//        this.right = right;
//        this.operator = operator;
//    }

    public ArithmeticExpression(int line, int column,Expression left, String operator, Expression right){
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

