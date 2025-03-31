package ast.statements;

import ast.AbstractLocatable;
import ast.expressions.Expression;
import semantic.Visitor;

public class ReturnStatement extends AbstractStatement {

    private Expression returnValue;

    public ReturnStatement(Expression returnValue, int line, int column) {
        super(line, column);
        this.returnValue = returnValue;
    }
    public Expression getReturnValue() {
        return returnValue;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "Return " + returnValue.toString();
    }
}
