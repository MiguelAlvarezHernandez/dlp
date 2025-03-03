package ast.statements;

import ast.AbstractLocatable;
import ast.expressions.Expression;
import ast.expressions.VariableExpression;

import java.util.List;

public class FunctionInvocation extends AbstractLocatable implements Statement, Expression  {
    private VariableExpression variable;
    private List<Expression> arguments;

    public FunctionInvocation(VariableExpression variable, List<Expression> arguments, int line, int column) {
        super(line, column);
        this.variable = variable;
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return "FunctionInvocation{" +
                "variable=" + variable +
                ", arguments=" + arguments +
                '}';
    }
}

