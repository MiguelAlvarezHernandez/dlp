package codegeneration;

public class ValueCGVisitor {
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
    //    Type superType = expression2.superType(expression3)
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


}
