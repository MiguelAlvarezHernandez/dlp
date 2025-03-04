package ast.type;

import ast.AbstractLocatable;

public class RecordField extends AbstractLocatable {
    private Type fieldType;
    private String name;

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
    public String toString() {
        return "RecordField{" +
                "fieldType=" + fieldType +
                ", name='" + name + '\'' +
                '}';
    }
}
