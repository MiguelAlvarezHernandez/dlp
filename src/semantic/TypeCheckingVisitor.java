package semantic;

import ast.expressions.*;
import ast.program.Definition;
import ast.program.FunctionDefinition;
import ast.program.Program;
import ast.program.VariableDefinition;
import ast.statements.*;
import ast.type.*;

public class TypeCheckingVisitor extends AbstractVisitor<Void,Void>{



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
    public Void visit(ReadStatement readStatement, Void param) {
        readStatement.getValueToRead().accept(this, param);
        if(!readStatement.getValueToRead().getLValue()){
            new ErrorType(readStatement.getLine(), readStatement.getColumn(), "L-Value is wrong");
        }
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

}
