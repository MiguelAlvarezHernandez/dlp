package ast.type;

import ast.AbstractLocatable;
import semantic.Visitor;

public class RecordField extends AbstractLocatable {
    private Type fieldType;
    private String name;
    int offset;

    public RecordField(Type fieldType, String name, int line, int column) {
        super(line, column);
        this.fieldType = fieldType;
        this.name = name;
    }


    public Type getFieldType() {
        return fieldType;
    }
    public String getName() {
        return name;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "RecordField{" +
                "fieldType=" + fieldType +
                ", name='" + name + '\'' +
                '}';
    }

    public int getOffset() {
        return offset;
    }
    public void setOffset(int offset) {
        this.offset = offset;
    }
}
