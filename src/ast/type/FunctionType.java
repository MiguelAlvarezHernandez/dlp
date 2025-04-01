package ast.type;

import ast.Locatable;
import ast.program.VariableDefinition;
import semantic.Visitor;

import java.util.List;

public class FunctionType extends AbstractType {
    private Type returnType;
    private List<VariableDefinition> parameterTypes;

    public FunctionType(Type returnType, List<VariableDefinition> parameterTypes) {
        this.returnType = returnType;
        this.parameterTypes = parameterTypes;
    }

    public Type getReturnType() {
        return returnType;
    }

    public List<VariableDefinition> getParameterTypes() {

        return parameterTypes;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,  p);
    }

    @Override
    public String toString() {
        return "FunctionType{" +
                "returnType=" + returnType +
                ", parameterTypes=" + parameterTypes +
                '}';
    }

    @Override
    public Type parenthesis(List<Type> argTypes, Locatable locatable) {
        if (argTypes.size() != parameterTypes.size()) {
            return new ErrorType(locatable.getLine(), locatable.getColumn(),"Incorrect number of arguments in function call.");
        }
        for (int i = 0; i < argTypes.size(); i++) {

            if (!argTypes.get(i).equals(parameterTypes.get(i).getType())) {
                return new ErrorType(locatable.getLine(), locatable.getColumn(),"Argument type mismatch at position " + i + ".");
            }
        }
        return returnType;
    }

}
