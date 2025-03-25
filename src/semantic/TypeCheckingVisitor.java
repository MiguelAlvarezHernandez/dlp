package semantic;

import ast.expressions.*;
import ast.program.Definition;
import ast.program.FunctionDefinition;
import ast.program.Program;
import ast.program.VariableDefinition;
import ast.statements.*;
import ast.type.*;

public class TypeCheckingVisitor extends AbstractVisitor<Void,Void>{

    //Arithmetic -> expression1.type = expression2.type.arithmetic(expression3.type)

    //Indexing -> expression1.type = expression2.type.squareBraquets(expression3.type)

    //P: FunctionInvocation : expression1 -> expression2 expression*
    //R: expression1.type = expression2.type.parenthesis(
    // expression*.stream().map(exp -> exp.type).toList()))

    //P: FunctionInvocation : statement -> expression expression*
    //R: expression.type.parenthesis(expression*.stream().map(exp -> exp.type).toList()))

    //P: WhileStmt: statement1 -> expression statement2*
    //R: expression.type.mustBeCondition()
    //   statement2*.forEach(stmt -> stmt.returnType = statement1.returnType)

    //P: Cast: expression1 -> type expression2
    //R: expression1.type= type.mustBeCastFrom(expression2.type)

    //P: FieldAccessExpression: expression1 -> expression2 expression3
    //R: expression1.type = expression2.type.accessField(expression3.type)

    //P: RelationalExpression: expression1 -> expression2 expression3
    //R: expression1.type= expression2.type.relational(expression3.type)

    //P UnaryMinusExpression: expression1 -> expression2
    //R: expression1.type = expression2.type.arithmetic()

    //P: IntLiteralExpression: expression -> INT_CONSTANT
    //R: expression.type = new IntType()

    //P: CharLiteralExpression: expression -> CHAR_CONSTANT
    //R: expression.type = new CharType()

    //P: RealLiteralExpression: expression -> REAL_CONSTANT
    //R: expression.type = new RealType()

    //P: VariableExpression: expression -> ID
    //R: expression.type = expression.definition != null ? expression.type.definition :
    //        new ErrorType("Var " + ID + " is not defined")

    //P: IfElseStatement: statement1 -> expression statement2* statement3*
    //R: expression.type.mustBeCondition()
    //   statement2*.forEach(stmt -> stmt.returnType = statement1.returnType)
    //   statement3*.forEach(stmt -> stmt.returnType = statement1.returnType)

    //P: AssignmentStatement: statement1 -> expression1 expression2
    //R: expression1.type.assignment(expression2.type)

    //P: ReadStatement: statement -> expression
    //R: expression.type.mustBeReadable()

    //P: WriteStatement: statement -> expression
    //R: expression.type.mustBeWritable()

    //P: FuncDefinition: definition → type ID definition* statement*
    //R: statement*.forEach(stmt -> stmt.returnType = type.returnType)

    //P: ReturnStatement: statement -> expression
    //R: expression.type.mustReturnedAs(statement.returnType)


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
