package ast.statements;

import ast.AbstractLocatable;
import ast.expressions.Expression;

import java.util.List;

public class WhileStatement extends AbstractLocatable implements Statement {
    private Expression condition;  // Condición para continuar el bucle
    private List<Statement> body;        // Cuerpo del bucle (la sentencia que se repite)

    public WhileStatement(Expression condition, List<Statement> body, int line, int column) {
        super(line, column);
        this.condition = condition;
        this.body = body;
    }


}
