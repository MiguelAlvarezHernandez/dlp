package ast.statements;

import ast.AbstractLocatable;
import ast.expressions.Expression;

import java.util.List;

public class IfElseStatement extends AbstractLocatable implements Statement {
    private List<Expression> conditionExpressions;
    private List<Statement> ifBody;
    private List<Statement> elseBody;

    public IfElseStatement(List<Expression> conditionExpressions, List<Statement> ifBody, List<Statement> elseBody, int line, int column) {
        super(line, column);
        if (conditionExpressions == null || conditionExpressions.isEmpty()) {
            throw new IllegalArgumentException("El IfElseStatement debe tener al menos una expresión en la condición.");
        }
        this.conditionExpressions = conditionExpressions;
        this.ifBody = ifBody;
        this.elseBody = elseBody;
    }
    @Override
    public String toString() {
        return "If (" + conditionExpressions + ") { " + ifBody + " } else { " + elseBody + " }";
    }
}
