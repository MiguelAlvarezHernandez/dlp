package ast.statements;

import ast.AbstractLocatable;
import ast.expressions.Expression;

import java.util.List;

public class FunctionInvocation extends AbstractLocatable implements Statement, Expression  {
    private String functionName;
    private List<Expression> arguments;

    public FunctionInvocation(String functionName, List<Expression> arguments, int line, int column) {
        super(line, column);
        this.functionName = functionName;
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return "FunctionInvocation{" +
                "functionName='" + functionName + '\'' +
                ", arguments=" + arguments +
                '}';
    }
}

