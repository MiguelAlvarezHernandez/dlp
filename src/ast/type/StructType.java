package ast.type;

import java.util.List;

public class StructType implements Type {
    private List<RecordField> recordFields;

    public StructType( List<RecordField> recordFields) {
        this.recordFields = recordFields;
    }


    public int getSize() {
        int size = 0;
        for (RecordField field : recordFields) {
            size += field.getSize();  // Sumar el tamaño de cada campo
        }
        return size;
    }
}
