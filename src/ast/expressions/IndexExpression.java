package ast.expressions;

import semantic.Visitor;

public class IndexExpression extends AbstractExpression {
    private Expression array;
    private Expression index;

    public IndexExpression(Expression array, Expression index, int line, int column) {
        super(line, column);
        this.array = array;
        this.index = index;
    }

    public Expression getArray() {
        return array;
    }

    public Expression getIndex() {
        return index;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "IndexExpression{" +
                "array=" + array +
                ", index=" + index +
                '}';
    }

}