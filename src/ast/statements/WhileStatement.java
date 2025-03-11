package ast.statements;

import ast.AbstractLocatable;
import ast.expressions.Expression;
import semantic.Visitor;

import java.util.List;

public class WhileStatement extends AbstractLocatable implements Statement {
    private Expression condition;
    private List<Statement> body;

    public WhileStatement(Expression condition, List<Statement> body, int line, int column) {
        super(line, column);
        this.condition = condition;
        this.body = body;
    }
    public Expression getCondition() {
        return condition;
    }

    public List<Statement> getBody() {
        return body;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "WhileStatement{" +
                "condition=" + condition +
                ", body=" + body +
                '}';
    }
}
