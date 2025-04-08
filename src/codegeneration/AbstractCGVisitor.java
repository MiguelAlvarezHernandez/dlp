package codegeneration;

import ast.expressions.*;
import ast.program.FunctionDefinition;
import ast.program.Program;
import ast.program.VariableDefinition;
import ast.statements.*;
import ast.type.*;
import semantic.Visitor;

public abstract class AbstractCGVisitor<TR, TP> implements Visitor<TR, TP>{
    @Override
    public TR visit(Program program, TP param) {
        return null;
    }

    @Override
    public TR visit(FunctionDefinition functionDefinition, TP param) {
        return null;
    }

    @Override
    public TR visit(VariableDefinition variableDefinition, TP param) {
        return null;
    }

    @Override
    public TR visit(AssignmentStatement assignment, TP param) {
        return null;
    }

    @Override
    public TR visit(FunctionInvocation functionInvocation, TP param) {
        return null;
    }

    @Override
    public TR visit(IfElseStatement ifElseStatement, TP param) {
        return null;
    }

    @Override
    public TR visit(ReadStatement readStatement, TP param) {
        return null;
    }

    @Override
    public TR visit(ReturnStatement returnStatement, TP param) {
        return null;
    }

    @Override
    public TR visit(WhileStatement whileStatement, TP param) {
        return null;
    }

    @Override
    public TR visit(WriteStatement writeStatement, TP param) {
        return null;
    }

    @Override
    public TR visit(ArithmeticExpression arithmeticExpression, TP param) {
        return null;
    }

    @Override
    public TR visit(Cast castExpression, TP param) {
        return null;
    }

    @Override
    public TR visit(CharLiteralExpression charLiteralExpression, TP param) {
        return null;
    }

    @Override
    public TR visit(IndexExpression indexExpression, TP param) {
        return null;
    }

    @Override
    public TR visit(FieldAccessExpression fieldAccessExpression, TP param) {
        return null;
    }

    @Override
    public TR visit(IntLiteralExpression intLiteralExpression, TP param) {
        return null;
    }

    @Override
    public TR visit(LogicalExpression logicalExpression, TP param) {
        return null;
    }

    @Override
    public TR visit(ModuleExpression moduleExpression, TP param) {
        return null;
    }

    @Override
    public TR visit(NegationExpression negationExpression, TP param) {
        return null;
    }

    @Override
    public TR visit(RealLiteralExpression realLiteralExpression, TP param) {
        return null;
    }

    @Override
    public TR visit(RelationalExpression relationalExpression, TP param) {
        return null;
    }

    @Override
    public TR visit(UnaryMinusExpression unaryMinusExpression, TP param) {
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
        return null;
    }

    @Override
    public TR visit(IntType intType, TP param) {
        return null;
    }

    @Override
    public TR visit(RecordField recordField, TP param) {
        return null;
    }

    @Override
    public TR visit(StructType structType, TP param) {
        return null;
    }

    @Override
    public TR visit(VoidType voidType, TP param) {
        return null;
    }
}
