package ast.type;

public class RecordField {
    private Type fieldType;
    private int size;

    public RecordField(Type fieldType, int size) {
        this.fieldType = fieldType;
        this.size = size;
    }


    public Type getFieldType() {
        return fieldType;
    }
    public int getSize() {
        return size;
    }




}
