package ast.expressions;

import ast.AbstractLocatable;

public class RealLiteralExpression extends AbstractLocatable implements Expression {
    private double value;

    public RealLiteralExpression(double value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    public double getValue() {
        return value;
    }
    @Override
    public String toString() {
        return "RealLiteralExpression{" +
                "value=" + value +
                '}';
    }
}
