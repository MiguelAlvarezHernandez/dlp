package semantic;

import ast.expressions.*;
import ast.program.Definition;
import ast.program.FunctionDefinition;
import ast.program.Program;
import ast.program.VariableDefinition;
import ast.statements.*;
import ast.type.*;

public class AbstractVisitor<TR, TP> implements Visitor<TR, TP>{


    @Override
    public TR visit(Program program, TP param) {
        for(Definition def: program.getDefinitions()){
            def.accept(this, param);
        }
        return null;
    }

    @Override
    public TR visit(FunctionDefinition functionDefinition, TP param) {
        functionDefinition.getFunctionType().accept(this, param);
        for(Definition def: functionDefinition.getVarDefinitions()){
            def.accept(this, param);
        }
        for (Statement statement: functionDefinition.getStatements()){
            statement.accept(this, param);
        }
        return null;
    }

    @Override
    public TR visit(VariableDefinition variableDefinition, TP param) {
        variableDefinition.getType().accept(this, param);
        return null;
    }

    @Override
    public TR visit(AssignmentStatement assignment, TP param) {
        assignment.getLeft().accept(this, param);
        assignment.getRight().accept(this, param);
        return null;
    }

    @Override
    public TR visit(FunctionInvocation functionInvocation, TP param) {
        functionInvocation.getVariable().accept(this, param);
        for(Expression expr: functionInvocation.getArguments()){
            expr.accept(this, param);
        }
        return null;
    }

    @Override
    public TR visit(IfElseStatement ifElseStatement, TP param) {
        ifElseStatement.getConditionExpression().accept(this, param);
        for (Statement statement : ifElseStatement.getIfBody()){
            statement.accept(this, param);
        }
        for (Statement statement : ifElseStatement.getElseBody()){
            statement.accept(this, param);
        }
        return null;
    }

    @Override
    public TR visit(ReadStatement readStatement, TP param) {
        readStatement.getValueToRead().accept(this, param);
        return null;
    }

    @Override
    public TR visit(ReturnStatement returnStatement, TP param) {
        returnStatement.getReturnValue().accept(this, param);
        return null;
    }

    @Override
    public TR visit(WhileStatement whileStatement, TP param) {
        whileStatement.getCondition().accept(this, param);
        for (Statement statement : whileStatement.getBody()){
            statement.accept(this, param);
        }
        return null;
    }

    @Override
    public TR visit(WriteStatement writeStatement, TP param) {
        writeStatement.getValueToWrite().accept(this, param);
        return null;
    }

    @Override
    public TR visit(ArithmeticExpression arithmeticExpression, TP param) {
        arithmeticExpression.getLeft().accept(this, param);
        arithmeticExpression.getRight().accept(this, param);
        return null;
    }

    @Override
    public TR visit(Cast castExpression, TP param) {
        castExpression.getExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(CharLiteralExpression charLiteralExpression, TP param) {
        return null;
    }

    @Override
    public TR visit(IndexExpression indexExpression, TP param) {
        indexExpression.getIndex().accept(this, param);
        indexExpression.getArray().accept(this, param);
        return null;
    }

    @Override
    public TR visit(FieldAccessExpression fieldAccessExpression, TP param) {
        fieldAccessExpression.getRecord().accept(this, param);
        return null;
    }

    @Override
    public TR visit(IntLiteralExpression intLiteralExpression, TP param) {
        return null;
    }

    @Override
    public TR visit(LogicalExpression logicalExpression, TP param) {
        logicalExpression.getLeft().accept(this, param);
        logicalExpression.getRight().accept(this, param);
        return null;
    }

    @Override
    public TR visit(ModuleExpression moduleExpression, TP param) {
        moduleExpression.getLeft().accept(this, param);
        moduleExpression.getRight().accept(this, param);
        return null;
    }

    @Override
    public TR visit(NegationExpression negationExpression, TP param) {
        negationExpression.getExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(RealLiteralExpression realLiteralExpression, TP param) {
        return null;
    }

    @Override
    public TR visit(RelationalExpression relationalExpression, TP param) {
        relationalExpression.getLeft().accept(this, param);
        relationalExpression.getRight().accept(this, param);
        return null;
    }

    @Override
    public TR visit(UnaryMinusExpression unaryMinusExpression, TP param) {
        unaryMinusExpression.getExpression().accept(this, param);
        return null;
    }

    @Override
    public TR visit(VariableExpression variableExpression, TP param) {
        return null;
    }

    @Override
    public TR visit(ErrorType errorType, TP param) {
        return null;
    }

    @Override
    public TR visit(ArrayType arrayType, TP param) {
        arrayType.getElementType().accept(this,param);
        return null;
    }

    @Override
    public TR visit(CharType charType, TP param) {
        return null;
    }

    @Override
    public TR visit(DoubleType doubleType, TP param) {
        return null;
    }

    @Override
    public TR visit(FunctionType functionType, TP param) {
        functionType.getReturnType().accept(this, param);
        for(VariableDefinition vd:functionType.getParameterTypes()){
            vd.accept(this, param);
        }
        return null;
    }

    @Override
    public TR visit(IntType intType, TP param) {
        return null;
    }

    @Override
    public TR visit(RecordField recordField, TP param) {
        recordField.getFieldType().accept(this, param);
        return null;
    }

    @Override
    public TR visit(StructType structType, TP param) {
        for(RecordField rf: structType.getRecordFields()){
            rf.accept(this, param);
        }
        return null;
    }

    @Override
    public TR visit(VoidType voidType, TP param) {
        return null;
    }
}
