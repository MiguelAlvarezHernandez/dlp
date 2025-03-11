package ast.statements;

import ast.AbstractLocatable;
import ast.expressions.Expression;
import semantic.Visitor;

public class ReadStatement extends AbstractLocatable implements Statement {
    private Expression valueToRead;

    public ReadStatement(Expression valueToRead, int line, int column) {
        super(line, column);
        this.valueToRead = valueToRead;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "Read " + valueToRead.toString();
    }
}
