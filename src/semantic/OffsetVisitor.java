package semantic;

import ast.program.FunctionDefinition;
import ast.program.VariableDefinition;
import ast.statements.Statement;
import ast.type.FunctionType;
import ast.type.RecordField;
import ast.type.StructType;

public class OffsetVisitor extends AbstractVisitor<Void,Void>{


    //P: StructType: type -> field*
    //R:
    //   int fieldsBytesSum = 0;
    //   for(RecordField field : field*){
    //      field.offset = fieldsBytesSum;
    //      fieldsBytesSum += field.type.numberOfBytes()
    //}



    //P:FunctionType: type1 → type2 definition*
    //R: int paramsBytes = 0
    //  for(int i = varDefinition*.size() -1; i>= 0; i--){
    //      VarDefinition vd = definition*.get(i)
    //      vd.offset = 4 + paramsBytesSum;
    //      paramsBytesSum += vd.type.numberOfBytes();
    //}

    //P:VariableDefinition: definition → type ID
    //globalBytesSum is a global variable
    //R: if(definition.scope == 0){
    //      definition.offset = globalsByteSum;
    //      globalBytesSum += type.numberOfBytes
    //}

    //P:FunctionDefinition : definition → type ID definition* statement*
    //R: int localsBytesSum = 0;
    //  for (VarDefinition vd: definition*){
    //      localsBytesSum+= vd.type.numberOfBytes();
    //      vd.offset =- localsBytesSum


    int globalsBytesSum;

    @Override
    public Void visit(FunctionDefinition funcDefinition, Void param) {
        funcDefinition.getFunctionType().accept(this, param);

        int localsBytesSum = 0;

        for (VariableDefinition varDef : funcDefinition.getVarDefinitions()) {
            varDef.accept(this, param);
            localsBytesSum+= varDef.getType().numberOfBytes();
            varDef.setOffset(- localsBytesSum);
        }

        for (Statement stmt : funcDefinition.getStatements()) {
            stmt.accept(this, param);

        }

        return null;
    }

    @Override
    public Void visit(VariableDefinition variableDefinition, Void param) {
        variableDefinition.getType().accept(this, param);
        if(variableDefinition.getScope() == 0){
            variableDefinition.setOffset( globalsBytesSum);
            globalsBytesSum += variableDefinition.getType().numberOfBytes();
        }
        return null;
    }

    @Override
    public Void visit(StructType structType, Void param) {
        int fieldsBytesSum = 0;
        for(RecordField rf: structType.getRecordFields()){
            rf.accept(this, param);
            rf.setOffset(fieldsBytesSum);
            fieldsBytesSum += rf.getFieldType().numberOfBytes();
        }
        return null;
    }

    @Override
    public Void visit(FunctionType functionType, Void param) {
        functionType.getReturnType().accept(this, param);
        int paramsBytesSum = 0;
        for(VariableDefinition vd:functionType.getParameterTypes()){
            vd.accept(this, param);
        }

        for(int i = functionType.getParameterTypes().size() -1; i>= 0; i--){
            VariableDefinition vd = functionType.getParameterTypes().get(i);
            vd.setOffset(4 + paramsBytesSum);
            paramsBytesSum += vd.getType().numberOfBytes();
        }
        return null;
    }

}
