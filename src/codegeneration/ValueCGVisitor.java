package codegeneration;

import ast.expressions.*;
import ast.type.Type;

public class ValueCGVisitor extends AbstractCGVisitor<Void,Void>{
    //value[[Logical: expression1 ⟶
    //expression2 (&& | ||) expression3]]=
    //value[[expression2]]
    //value[[expression3]]
    //switch (expression1.operator) {
    //case "&&": <and>
    //break;
    //case "||": <or>
    //break;
    //}

    //value[[IntLiteral: expression -> INT_CONSTANT]] =
    //    <pushi > INT_CONSTANT
    //
    //value[[CharLiteral: expression -> CHAR_CONSTANT]] =
    //    <pushb > (int)CHAR_CONSTANT
    //
    //value[[RealLiteral: expression -> REAL_CONSTANT]] =
    //    <pushf > REAL_CONSTANT
    //
    //value[[VariableExpression: expression -> ID]] =
    //    address[[expression]]
    //    <loadi > expression.type.suffix()
    //
    //value[[Arithmetic: expression1 -> expression2 ('*'|'/'|'+'|'-') expression3]] =
    //    value[[expression2]]
    //    expression2.type.convertTo(expression1.type)
    //    value[[expression3]]
    //    expression3.type.convertTo(expression1.type)
    //    switch (expression1.operator) {
    //      case "+": <add> expression1.type.suffix() break;
    //      case "-": <sub> expression1.type.suffix() break;
    //      case "*": <div> expression1.type.suffix() break;
    //      case "/": <mul> expression1.type.suffix() break;
    //}

    //value[[Cast: expression1 -> type expression2]] =
    //    value[[expression2]]
    //    expression2.type.convertTo(type)

    //value[[Modulus: expression1 -> expression2 ('%') expression3]] =
    //    value[[expression2]]
    //    expression2.type.convertTo(expression1.type)
    //    value[[expression3]]
    //    expression3.type.convertTo(expression1.type)
    //    <modi> expression1.type.suffix()

    //value[[Relational: expression1 -> expression2 ('>'|'<'|'=='|'!=|'>='|'<=') expression3]] =
    //    Type superType = expression2.type.superType(expression3.type)
    //    value[[expression2]]
    //    expression2.type.convertTo(superType)
    //    value[[expression3]]
    //    expression3.type.convertTo(superType)
    //    switch (expression1.operator) {
    //      case ">": <gt> superType.suffix() break;
    //      case "<": <lt> superType.suffix() break;
    //      case "==": <eq> superType.suffix() break;
    //      case "!=": <mul> superType.suffix() break;
    //      case ">=": <ge> superType.suffix() break;
    //      case "<=": <le> superType.suffix() break;
    //}

    private final CodeGenerator cg;
    private final AddressCGVisitor addressCGVisitor;


    public ValueCGVisitor(CodeGenerator cg, AddressCGVisitor addressCGVisitor) {
        this.cg = cg;
        this.addressCGVisitor = addressCGVisitor;
    }

    @Override
    public Void visit(LogicalExpression logicalExp, Void param) {
        logicalExp.getLeft().accept(this, param);
        logicalExp.getRight().accept(this, param);

        cg.logical(logicalExp.getOperator());

        return null;
    }

    @Override
    public Void visit(CharLiteralExpression charLiteral, Void param) {
        cg.push((int) charLiteral.getValue());
        return null;
    }

    @Override
    public Void visit(RealLiteralExpression realLiteral, Void param) {
        cg.push(realLiteral.getValue());
        return null;
    }


    @Override
    public Void visit(VariableExpression var, Void param) {
        addressCGVisitor.visit(var, param);  // Usamos accept en lugar de visit
        cg.load(var.getType());
        return null;
    }

    @Override
    public Void visit(ArithmeticExpression arithmeticExp, Void param) {
        arithmeticExp.getLeft().accept(this, param);
        arithmeticExp.getRight().accept(this, param);

        cg.convert(arithmeticExp.getType(), arithmeticExp.getLeft().getType());
        cg.convert(arithmeticExp.getType(), arithmeticExp.getRight().getType());

        cg.arithmetic(arithmeticExp.getOperator(), arithmeticExp.getType().suffix());

        return null;
    }

    @Override
    public Void visit(Cast castExp, Void param) {
        castExp.getExpression().accept(this, param);
        cg.convert(castExp.getType(), castExp.getExpression().getType());
        return null;
    }

    @Override
    public Void visit(ModuleExpression modExp, Void param) {
        modExp.getLeft().accept(this, param);
        modExp.getRight().accept(this, param);

        cg.modulus(modExp.getLeft().getType().suffix());

        return null;
    }

    @Override
    public Void visit(RelationalExpression relationalExp, Void param) {
        Type superType = relationalExp.getLeft().getType().superType(relationalExp.getRight().getType());

        relationalExp.getLeft().accept(this, param);
        relationalExp.getRight().accept(this, param);

        cg.convert(superType, relationalExp.getLeft().getType());
        cg.convert(superType, relationalExp.getRight().getType());

        cg.relational(relationalExp.getOperator(), relationalExp.getType().suffix());

        return null;
    }

}
