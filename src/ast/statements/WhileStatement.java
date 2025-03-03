package ast.statements;

import ast.AbstractLocatable;
import ast.expressions.Expression;

import java.util.List;

public class WhileStatement extends AbstractLocatable implements Statement {
    private Expression condition;
    private List<Statement> body;

    public WhileStatement(Expression condition, List<Statement> body, int line, int column) {
        super(line, column);
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String toString() {
        return "WhileStatement{" +
                "condition=" + condition +
                ", body=" + body +
                '}';
    }
}
