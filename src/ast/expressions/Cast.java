package ast.expressions;

import semantic.Visitor;
import ast.type.Type;

public class Cast extends AbstractExpression {
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
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "Cast{" +
                "targetType=" + targetType +
                ", expression=" + expression +
                '}';
    }
}
