package ast.statements;

import ast.expressions.AbstractExpression;
import ast.expressions.Expression;
import ast.expressions.VariableExpression;
import semantic.Visitor;

import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement  {
    private VariableExpression variable;
    private List<Expression> arguments;

    public FunctionInvocation(VariableExpression variable, List<Expression> arguments, int line, int column) {
        super(line, column);
        this.variable = variable;
        this.arguments = arguments;
    }

    public VariableExpression getVariable() {
        return variable;
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "FunctionInvocation{" +
                "variable=" + variable +
                ", arguments=" + arguments +
                '}';
    }
}

