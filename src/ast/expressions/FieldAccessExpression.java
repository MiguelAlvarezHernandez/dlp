package ast.expressions;

import semantic.Visitor;

public class FieldAccessExpression extends AbstractExpression {
    private Expression record;
    private String field;

    public FieldAccessExpression(Expression record, String field, int line, int column) {
        super(line, column);
        this.record = record;
        this.field = field;
    }

    public Expression getRecord() {
        return record;
    }

    public String getField() {
        return field;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "FieldAccessExpression{" +
                "record=" + record +
                ", field='" + field + '\'' +
                '}';
    }

}
