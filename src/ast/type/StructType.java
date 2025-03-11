package ast.type;

import semantic.Visitor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StructType implements Type {
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
}
