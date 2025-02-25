package ast.statements;

import ast.AbstractLocatable;
import ast.expressions.Expression;

public class ReturnStatement extends AbstractLocatable implements Statement {

    private Expression returnValue;

    public ReturnStatement(Expression returnValue, int line, int column) {
        super(line, column);
        this.returnValue = returnValue;
    }
    public Expression getReturnValue() {
        return returnValue;
    }
    @Override
    public String toString() {
        return "Return " + returnValue.toString();
    }
}
