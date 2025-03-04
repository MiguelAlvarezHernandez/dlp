package ast.type;

import ast.errorhandler.ErrorHandler;
import ast.program.VariableDefinition;

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
                ErrorHandler.getInstance().addError(new ErrorType(field.getLine(), field.getColumn(),
                        "Duplicate field '" + field.getName() + "' in struct."));
            }
        }
    }

    @Override
    public String toString() {
        return "StructType{" +
                "recordFields=" + recordFields +
                '}';
    }
}
