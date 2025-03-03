package ast.type;

public class RecordField {
    private Type fieldType;
    private String name;

    public RecordField(Type fieldType, String name) {
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
