package ast.expressions;

import semantic.Visitor;

public class RealLiteralExpression extends AbstractExpression {
    private double value;

    public RealLiteralExpression(double value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "RealLiteralExpression{" +
                "value=" + value +
                '}';
    }
}
