package ast.expressions;

public class ModuleExpression extends ArithmeticExpression {

    public ModuleExpression(int line, int column, Expression left, Expression right) {
        super(line, column, left, "%", right);
    }

    
}

