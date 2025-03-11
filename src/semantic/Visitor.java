package semantic;

import ast.expressions.*;
import ast.program.FunctionDefinition;
import ast.program.Program;
import ast.program.VariableDefinition;
import ast.statements.*;
import ast.type.*;

public interface Visitor <TR,TP>{
    public TR visit (Program program, TP param);

    public TR visit (FunctionDefinition functionDefinition, TP param);
    public TR visit (VariableDefinition variableDefinition, TP param);

    public TR visit (AssignmentStatement assignment, TP param);
    public TR visit (FunctionInvocation functionInvocation, TP param);
    public TR visit (IfElseStatement ifElseStatement, TP param);
    public TR visit (ReadStatement readStatement, TP param);
    public TR visit (ReturnStatement returnStatement, TP param);
    public TR visit (WhileStatement whileStatement, TP param);
    public TR visit (WriteStatement writeStatement, TP param);

    public TR visit (ArithmeticExpression arithmeticExpression, TP param);
    public TR visit (Cast castExpression, TP param);
    public TR visit (CharLiteralExpression charLiteralExpression, TP param);
    public TR visit (IndexExpression indexExpression, TP param);
    public TR visit (FieldAccessExpression fieldAccessExpression, TP param);
    public TR visit (IntLiteralExpression intLiteralExpression, TP param);
    public TR visit (LogicalExpression logicalExpression, TP param);
    public TR visit (ModuleExpression moduleExpression, TP param);
    public TR visit (NegationExpression negationExpression, TP param);
    public TR visit (RealLiteralExpression realLiteralExpression, TP param);
    public TR visit (RelationalExpression relationalExpression, TP param);
    public TR visit (UnaryMinusExpression unaryMinusExpression, TP param);
    public TR visit (VariableExpression variableExpression, TP param);

    public TR visit (ErrorType errorType, TP param);
    public TR visit (ArrayType arrayType, TP param);
    public TR visit (CharType charType, TP param);
    public TR visit (DoubleType doubleType, TP param);
    public TR visit (FunctionType functionType, TP param);
    public TR visit (IntType intType, TP param);
    public TR visit (RecordField recordField, TP param);
    public TR visit (StructType structType, TP param);
    public TR visit (VoidType voidType, TP param);

}
