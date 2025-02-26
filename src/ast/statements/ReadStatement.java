package ast.statements;

import ast.AbstractLocatable;
import ast.expressions.Expression;

import java.util.List;

public class ReadStatement extends AbstractLocatable implements Statement {
    private List<Expression> valuesToRead;

    public ReadStatement(List<Expression> valuesToRead, int line, int column) {
        super(line, column);
        this.valuesToRead = valuesToRead;
    }
    @Override
    public String toString() {
        return "Read " + valuesToRead.toString();
    }
}
