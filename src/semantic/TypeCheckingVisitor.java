package semantic;

import ast.expressions.*;
import ast.program.Definition;
import ast.program.FunctionDefinition;
import ast.program.Program;
import ast.program.VariableDefinition;
import ast.statements.*;
import ast.type.*;

import javax.management.relation.RelationType;
import java.util.List;
import java.util.stream.Collectors;

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

    //P: LogicalExpression: expression1 -> expression2 expression3
    //R: expression1.type= expression2.type.logical(expression3.type)

    //P: ModuleExpression: expression1 -> expression2 expression3
    //R: expression1.type= expression2.type.module(expression3.type)

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
    public Void visit(FunctionDefinition funcDefinition, Void param) {
        funcDefinition.getFunctionType().accept(this, param);
        funcDefinition.setType(funcDefinition.getFunctionType());

        for (VariableDefinition varDef : funcDefinition.getVarDefinitions()) {
            varDef.accept(this, param);
        }

        for (Statement stmt : funcDefinition.getStatements()) {
            // Rule: statement*.forEach(stmt -> stmt.returnType = type.returnType)
            stmt.setReturnType(funcDefinition.getFunctionType().getReturnType());
            stmt.accept(this, param);

        }

        return null;
    }




    @Override
    public Void visit(ReturnStatement returnStatement, Void param) {
        returnStatement.getReturnValue().accept(this, param);

        // Regla: expression.type.mustReturnedAs(statement.returnType)
        Type returnType = returnStatement.getReturnValue().getType();
        returnType.mustReturnedAs(returnStatement.getReturnType(), returnStatement);

        return null;
    }

    @Override
    public Void visit(AssignmentStatement assignmentStatement, Void param) {
        assignmentStatement.getLeft().accept(this, param);
        assignmentStatement.getRight().accept(this, param);
        if(!assignmentStatement.getLeft().getLValue())
            new ErrorType(assignmentStatement.getLine(),assignmentStatement.getColumn(),
                    "L-Value is wrong");

        Type resultType = assignmentStatement.getLeft().getType().assignment(
                assignmentStatement.getRight().getType(), assignmentStatement
        );
        assignmentStatement.setReturnType(resultType);
        return null;
    }

    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param) {
        functionInvocation.getVariable().accept(this, param);
        for(Expression expr: functionInvocation.getArguments()){
            expr.accept(this, param);
        }
        functionInvocation.setLValue(true);

        Type functionType = functionInvocation.getVariable().getType();
        List<Type> argTypes = functionInvocation.getArguments().stream()
                .map(arg -> arg.getType())
                .collect(Collectors.toList());

        Type resultType = functionType.parenthesis(argTypes, functionInvocation);
        functionInvocation.setType(resultType);
        return null;
    }


    @Override
    public Void visit(ReadStatement readStatement, Void param) {
        readStatement.getValueToRead().accept(this, param);
        if(!readStatement.getValueToRead().getLValue()){
            new ErrorType(readStatement.getLine(), readStatement.getColumn(), "L-Value is wrong");
        }

        Type exprType = readStatement.getValueToRead().getType();
        exprType.mustBeReadable(readStatement);
        return null;
    }

    @Override
    public Void visit(IfElseStatement ifElseStatement, Void param) {
        ifElseStatement.getConditionExpression().accept(this, param);

        Type conditionType = ifElseStatement.getConditionExpression().getType();
        conditionType.mustBeCondition(ifElseStatement);

        for (Statement stmt : ifElseStatement.getIfBody()) {
            stmt.accept(this, param);
            stmt.setReturnType(ifElseStatement.getReturnType());
        }

        for (Statement stmt : ifElseStatement.getElseBody()) {
            stmt.accept(this, param);
            stmt.setReturnType(ifElseStatement.getReturnType());
        }
        return null;
    }

    @Override
    public Void visit(WriteStatement writeStatement, Void param) {
        writeStatement.getValueToWrite().accept(this, param);



        Type exprType = writeStatement.getValueToWrite().getType();
        exprType.mustBeWritable(writeStatement);
        return null;
    }

    @Override
    public Void visit(WhileStatement whileStatement, Void param) {
        whileStatement.getCondition().accept(this, param);

        Type conditionType = whileStatement.getCondition().getType();
        conditionType.mustBeCondition(whileStatement);

        for (Statement stmt : whileStatement.getBody()) {
            stmt.accept(this, param);
            stmt.setReturnType(whileStatement.getReturnType());
        }

        return null;
    }








    @Override
    public Void visit(ArithmeticExpression arithmeticExpression, Void param) {
        arithmeticExpression.getLeft().accept(this, param);
        arithmeticExpression.getRight().accept(this, param);
        arithmeticExpression.setLValue(false);

        Type resultType = arithmeticExpression.getLeft().getType().arithmetic(
                arithmeticExpression.getRight().getType(), arithmeticExpression);
        arithmeticExpression.setType(resultType);

        return null;
    }

    @Override
    public Void visit(Cast castExpression, Void param) {
        castExpression.getExpression().accept(this, param);
        castExpression.setLValue(false);

        Type resultType = castExpression.getTargetType().mustBeCastFrom(
                castExpression.getExpression().getType(), castExpression
        );
        castExpression.setType(resultType);
        return null;
    }

    @Override
    public Void visit(CharLiteralExpression charLiteralExpression, Void param) {
        charLiteralExpression.setLValue(false);
        charLiteralExpression.setType(new CharType());
        return null;
    }


    @Override
    public Void visit(IndexExpression indexExpression, Void param) {
        indexExpression.getIndex().accept(this, param);
        indexExpression.getArray().accept(this, param);
        indexExpression.setLValue(true);
        Type resultType = indexExpression.getArray().getType().squareBrackets(indexExpression.getIndex().getType(), indexExpression);
        indexExpression.setType(resultType);
        return null;
    }

    @Override
    public Void visit(FieldAccessExpression fieldAccessExpression, Void param) {
        fieldAccessExpression.getRecord().accept(this, param);
        fieldAccessExpression.setLValue(true);

        Type resultType = fieldAccessExpression.getRecord().getType().accessField(
                fieldAccessExpression.getField(), fieldAccessExpression
        );
        fieldAccessExpression.setType(resultType);
        return null;
    }

    @Override
    public Void visit(IntLiteralExpression intLiteralExpression, Void param) {
        intLiteralExpression.setLValue(false);
        intLiteralExpression.setType(new IntType());
        return null;
    }

    @Override
    public Void visit(LogicalExpression logicalExpression, Void param) {
        logicalExpression.getLeft().accept(this, param);
        logicalExpression.getRight().accept(this, param);
        logicalExpression.setLValue(false);

        Type resultType = logicalExpression.getLeft().getType().relational(
                logicalExpression.getRight().getType(), logicalExpression);
        logicalExpression.setType(resultType);
        return null;
    }

    @Override
    public Void visit(ModuleExpression moduleExpression, Void param) {
        moduleExpression.getLeft().accept(this, param);
        moduleExpression.getRight().accept(this, param);
        moduleExpression.setLValue(false);

        Type resultType = moduleExpression.getLeft().getType().relational(
                moduleExpression.getRight().getType(), moduleExpression);
        moduleExpression.setType(resultType);

        return null;
    }

    @Override
    public Void visit(NegationExpression negationExpression, Void param) {
        negationExpression.getExpression().accept(this, param);
        negationExpression.setLValue(false);
        Type resultType = negationExpression.getExpression().getType();
        resultType.mustBeCondition(negationExpression);

        negationExpression.setType(resultType);
        return null;
    }

    @Override
    public Void visit(RealLiteralExpression realLiteralExpression, Void param) {
        realLiteralExpression.setLValue(false);
        realLiteralExpression.setType(new DoubleType());
        return null;
    }

    @Override
    public Void visit(RelationalExpression relationalExpression, Void param) {
        relationalExpression.getLeft().accept(this, param);
        relationalExpression.getRight().accept(this, param);
        relationalExpression.setLValue(false);

        Type resultType = relationalExpression.getLeft().getType().relational(
                relationalExpression.getRight().getType(), relationalExpression);
        relationalExpression.setType(resultType);
        return null;
    }

    @Override
    public Void visit(UnaryMinusExpression unaryMinusExpression, Void param) {
        unaryMinusExpression.getExpression().accept(this, param);
        unaryMinusExpression.setLValue(false);

        Type resultType = unaryMinusExpression.getExpression().getType().arithmetic(unaryMinusExpression);
        unaryMinusExpression.setType(resultType);
        return null;
    }

    @Override
    public Void visit(VariableExpression variableExpression, Void param) {
        variableExpression.setLValue(true);

        if (variableExpression.getDefinition() == null) {
            // Regla: expression.type = expression.definition != null ? expression.type.definition : new ErrorType("Var " + ID + " is not defined")
            new ErrorType(variableExpression.getLine(), variableExpression.getColumn(),
                    "Variable " + variableExpression.getName() + " is not defined.");
        } else {
            variableExpression.setType(variableExpression.getDefinition().getType());
        }
        return null;
    }



}
