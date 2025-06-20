package ast.statements;

import ast.AbstractLocatable;
import ast.expressions.Expression;
import semantic.Visitor;

public class WriteStatement extends AbstractStatement {
    private Expression valueToWrite;


    public WriteStatement(Expression valueToWrite, int line, int column) {
        super(line, column);
        this.valueToWrite = valueToWrite;
    }

    public Expression getValueToWrite() {
        return valueToWrite;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "Write " + valueToWrite.toString();
    }
}
