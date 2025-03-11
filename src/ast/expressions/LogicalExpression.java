package ast.expressions;

import semantic.Visitor;

public class LogicalExpression extends AbstractExpression{
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

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "LogicalExpression{" +
                "left=" + left +
                ", right=" + right +
                ", operator='" + operator + '\'' +
                '}';
    }
}
