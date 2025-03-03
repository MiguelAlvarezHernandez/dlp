package ast.expressions;

import ast.AbstractLocatable;
import ast.type.Type;

public class Cast extends AbstractLocatable implements Expression {
    private Type targetType;
    private Expression expression;

    public Cast(Type targetType, Expression expression, int line, int column) {
        super(line, column);
        this.targetType = targetType;
        this.expression = expression;
    }

    public Type getTargetType() {
        return targetType;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "Cast{" +
                "targetType=" + targetType +
                ", expression=" + expression +
                '}';
    }
}
