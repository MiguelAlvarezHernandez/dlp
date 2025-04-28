package codegeneration;

import ast.expressions.FieldAccessExpression;
import ast.expressions.IndexExpression;
import ast.expressions.VariableExpression;
import ast.type.IntType;

public class AddressCGVisitor extends AbstractCGVisitor<Void,Void>{

    //address[[VariableExpression: expression -> ID]] =
    //      if (exp.definition.scope==0)
    //          <pusha> exp.definition.offset
    //      else {
    //          <push bp>
    //          <pushi> exp.definition.offset
    //          <addi>
    //      }

    /*
        address[[Index: expression1 -> expression2 expression3]] =
            address[[expression2]]
            value[[expression3]]
            <pushi> expression1.type.numberOfBytes()
            <muli>
            <addi>

        address[[FieldAccessExpression expression1 -> expression2 ID]]
            address[[expression2]]
            <pushi> expression2.type.findField(ID).offset
            <addi>
     */


    private final CodeGenerator cg;
    private ValueCGVisitor valueCGVisitor;

    public AddressCGVisitor(CodeGenerator cg) {
        this.cg = cg;
    }

    @Override
    public Void visit(FieldAccessExpression fieldAccess, Void param) {
        fieldAccess.getRecord().accept(this,null);
        cg.push( fieldAccess.getRecord().getType().findField(fieldAccess.getField()).getOffset());
        //cg.add(fieldAccess.getRecord().getType());
        cg.add(new IntType());
        return null;
    }

    @Override
    public Void visit(IndexExpression var, Void param) {
        var.getArray().accept(this,null);
        var.getIndex().accept(valueCGVisitor,null);
        cg.push( var.getType().numberOfBytes());
        cg.mul(new IntType());
        cg.add(new IntType());
        return null;
    }

    @Override
    public Void visit(VariableExpression var, Void param) {
        if (var.getDefinition().getScope() == 0) {
            cg.pushAddress(var.getDefinition().getOffset());
        } else {
            cg.pushBP();
            cg.push(var.getDefinition().getOffset());
            cg.add(new IntType());
        }
        return null;
    }

    public void setValueCGVisitor(ValueCGVisitor valueCGVisitor) {
        this.valueCGVisitor = valueCGVisitor;
    }
}
