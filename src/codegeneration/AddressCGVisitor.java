package codegeneration;

public class AddressCGVisitor extends AbstractCGVisitor<Void,Void>{

    //address[[VariableExpression: expression -> ID]] =
    //      if (exp.definition.scope==0)
    //          <pusha> exp.definition.offset
    //      else {
    //          <push bp>
    //          <pushi> exp.definition.offset
    //          <addi>
    //      }

}
