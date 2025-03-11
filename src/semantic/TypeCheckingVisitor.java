package semantic;

import ast.expressions.*;
import ast.program.Definition;
import ast.program.FunctionDefinition;
import ast.program.Program;
import ast.program.VariableDefinition;
import ast.statements.*;
import ast.type.*;

public class TypeCheckingVisitor implements Visitor<Void,Void>{

    @Override
    public Void visit(Program program, Void param) {
        for(Definition def: program.getDefinitions()){
            def.accept(this, param);
        }
        return null;
    }

    @Override
    public Void visit(FunctionDefinition functionDefinition, Void param) {
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
    public Void visit(VariableDefinition variableDefinition, Void param) {
        variableDefinition.getType().accept(this, param);
        return null;
    }

    @Override
    public Void visit(AssignmentStatement assignment, Void param) {
        assignment.getLeft().accept(this, param);
        assignment.getRight().accept(this, param);
        if(!assignment.getLeft().getLValue())
            new ErrorType(assignment.getLine(),assignment.getColumn(),
                    "L-Value is wrong");
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param) {
        functionInvocation.getVariable().accept(this, param);
        for(Expression expr: functionInvocation.getArguments()){
            expr.accept(this, param);
        }
        functionInvocation.setLValue(false);
        return null;
    }

    @Override
    public Void visit(IfElseStatement ifElseStatement, Void param) {
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
    public Void visit(ReadStatement readStatement, Void param) {
        readStatement.getValueToRead().accept(this, param);
        if(!readStatement.getValueToRead().getLValue()){
            new ErrorType(readStatement.getLine(), readStatement.getColumn(), "L-Value is wrong");
        }
        return null;
    }

    @Override
    public Void visit(ReturnStatement returnStatement, Void param) {
        returnStatement.getReturnValue().accept(this, param);
        return null;
    }

    @Override
    public Void visit(WhileStatement whileStatement, Void param) {
        whileStatement.getCondition().accept(this, param);
        for (Statement statement : whileStatement.getBody()){
            statement.accept(this, param);
        }
        return null;
    }

    @Override
    public Void visit(WriteStatement writeStatement, Void param) {
        writeStatement.getValueToWrite().accept(this, param);
        return null;
    }









    @Override
    public Void visit(ArithmeticExpression arithmeticExpression, Void param) {
        arithmeticExpression.getLeft().accept(this, param);
        arithmeticExpression.getRight().accept(this, param);
        arithmeticExpression.setLValue(false);

        return null;
    }

    @Override
    public Void visit(Cast castExpression, Void param) {
        castExpression.getExpression().accept(this, param);
        castExpression.setLValue(false);
        return null;
    }

    @Override
    public Void visit(CharLiteralExpression charLiteralExpression, Void param) {
        charLiteralExpression.setLValue(false);
        return null;
    }


    @Override
    public Void visit(IndexExpression indexExpression, Void param) {
        indexExpression.getIndex().accept(this, param);
        indexExpression.getArray().accept(this, param);
        indexExpression.setLValue(true);
        return null;
    }

    @Override
    public Void visit(FieldAccessExpression fieldAccessExpression, Void param) {
        fieldAccessExpression.getRecord().accept(this, param);
        fieldAccessExpression.setLValue(true);
        return null;
    }

    @Override
    public Void visit(IntLiteralExpression intLiteralExpression, Void param) {
        intLiteralExpression.setLValue(false);
        return null;
    }

    @Override
    public Void visit(LogicalExpression logicalExpression, Void param) {
        logicalExpression.getLeft().accept(this, param);
        logicalExpression.getRight().accept(this, param);
        logicalExpression.setLValue(false);
        return null;
    }

    @Override
    public Void visit(ModuleExpression moduleExpression, Void param) {
        moduleExpression.getLeft().accept(this, param);
        moduleExpression.getRight().accept(this, param);
        moduleExpression.setLValue(false);
        return null;
    }

    @Override
    public Void visit(NegationExpression negationExpression, Void param) {
        negationExpression.getExpression().accept(this, param);
        negationExpression.setLValue(false);
        return null;
    }

    @Override
    public Void visit(RealLiteralExpression realLiteralExpression, Void param) {
        realLiteralExpression.setLValue(false);
        return null;
    }

    @Override
    public Void visit(RelationalExpression relationalExpression, Void param) {
        relationalExpression.getLeft().accept(this, param);
        relationalExpression.getRight().accept(this, param);
        relationalExpression.setLValue(false);
        return null;
    }

    @Override
    public Void visit(UnaryMinusExpression unaryMinusExpression, Void param) {
        unaryMinusExpression.getExpression().accept(this, param);
        unaryMinusExpression.setLValue(false);
        return null;
    }

    @Override
    public Void visit(VariableExpression variableExpression, Void param) {
        variableExpression.setLValue(true);
        return null;
    }






    @Override
    public Void visit(ErrorType errorType, Void param) {
        return null;
    }

    @Override
    public Void visit(ArrayType arrayType, Void param) {
        return null;
    }

    @Override
    public Void visit(CharType charType, Void param) {
        return null;
    }

    @Override
    public Void visit(DoubleType doubleType, Void param) {
        return null;
    }

    @Override
    public Void visit(FunctionType functionType, Void param) {
        return null;
    }

    @Override
    public Void visit(IntType intType, Void param) {
        return null;
    }

    @Override
    public Void visit(RecordField recordField, Void param) {
        return null;
    }

    @Override
    public Void visit(StructType structType, Void param) {
        return null;
    }

    @Override
    public Void visit(VoidType voidType, Void param) {
        return null;
    }
}
