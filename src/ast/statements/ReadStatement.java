package ast.statements;

import ast.AbstractLocatable;
import ast.expressions.Expression;

import java.util.List;

public class ReadStatement extends AbstractLocatable implements Statement {
    private Expression valueToRead;

    public ReadStatement(Expression valueToRead, int line, int column) {
        super(line, column);
        this.valueToRead = valueToRead;
    }
    @Override
    public String toString() {
        return "Read " + valueToRead.toString();
    }
}
