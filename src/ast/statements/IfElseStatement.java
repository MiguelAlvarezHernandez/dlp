package ast.statements;

import ast.AbstractLocatable;
import ast.expressions.Expression;
import semantic.Visitor;

import java.util.List;

public class IfElseStatement extends AbstractStatement {
//    public IfElseStatement(List<Statement> ifBody, Expression conditionExpression, int line, int column) {
//        super(line, column);
//        this.ifBody = ifBody;
//        this.conditionExpression = conditionExpression;
//    }

    private Expression conditionExpression;
    private List<Statement> ifBody;
    private List<Statement> elseBody;

    public IfElseStatement(Expression conditionExpression, List<Statement> ifBody, List<Statement> elseBody, int line, int column) {
        super(line, column);
//        if (conditionExpression == null || conditionExpression.isEmpty()) {
//            throw new IllegalArgumentException("El IfElseStatement debe tener al menos una expresión en la condición.");
//        }
        this.conditionExpression = conditionExpression;
        this.ifBody = ifBody;
        this.elseBody = elseBody;
    }

    public List<Statement> getElseBody() {
        return elseBody;
    }
    public List<Statement> getIfBody() {
        return ifBody;
    }
    public Expression getConditionExpression() {
        return conditionExpression;
    }


    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "If (" + conditionExpression + ") { " + ifBody + " } else { " + elseBody + " }";
    }
}
