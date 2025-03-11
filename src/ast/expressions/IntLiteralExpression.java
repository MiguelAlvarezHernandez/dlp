package ast.expressions;

import semantic.Visitor;

public class IntLiteralExpression extends AbstractExpression {
    private int value;

    public IntLiteralExpression(int value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "IntLiteralExpression{" +
                "value=" + value +
                '}';
    }
}