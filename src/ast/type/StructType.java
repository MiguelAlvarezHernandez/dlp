package ast.type;

import ast.Locatable;
import semantic.Visitor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StructType extends AbstractType {
    private List<RecordField> recordFields;

    public StructType( List<RecordField> recordFields) {

        this.recordFields = recordFields;
        checkVariableNames();
    }

    public void checkVariableNames(){
        Set<String> fieldNames = new HashSet<>();

        for (RecordField field : recordFields) {
            if (!fieldNames.add(field.getName())) {
                new ErrorType(field.getLine(), field.getColumn(),
                        "Duplicate field '" + field.getName() + "' in struct.");
//                ErrorHandler.getInstance().addError(new ErrorType(field.getLine(), field.getColumn(),
//                        "Duplicate field '" + field.getName() + "' in struct."));
            }
        }
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "StructType{" +
                "recordFields=" + recordFields +
                '}';
    }
    public List<RecordField> getRecordFields() {
        return recordFields;
    }

    public Type accessField(String fieldName, Locatable locatable) {
        for (RecordField recordField : recordFields) {
            if (recordField.getName().equals(fieldName)) {
                return recordField.getFieldType();
            }
        }
        return new ErrorType(locatable.getLine(), locatable.getColumn(),"Field '" + fieldName + "' not found in struct.");
    }




    @Override
    public int numberOfBytes() {
        return this.getRecordFields().stream().mapToInt(rf-> rf.getFieldType().numberOfBytes()).sum();
    }
}
