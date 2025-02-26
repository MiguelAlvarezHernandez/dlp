package ast.statements;

import ast.AbstractLocatable;
import ast.expressions.Expression;

import java.util.List;

public class WriteStatement extends AbstractLocatable implements Statement {
    private List<Expression> valueToWrite;


    public WriteStatement(List<Expression> valueToWrite, int line, int column) {
        super(line, column);
        this.valueToWrite = valueToWrite;
    }

    @Override
    public String toString() {
        return "Write " + valueToWrite.toString();
    }
}
