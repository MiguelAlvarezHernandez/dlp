package ast.type;

import java.util.List;

public class StructType implements Type {
    private List<RecordField> recordFields;

    public StructType( List<RecordField> recordFields) {
        this.recordFields = recordFields;
    }

    @Override
    public String toString() {
        return "StructType{" +
                "recordFields=" + recordFields +
                '}';
    }
}
