package ast.type;

import ast.program.VariableDefinition;

import java.util.List;

public class FunctionType implements Type {
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
    public String toString() {
        return "FunctionType{" +
                "returnType=" + returnType +
                ", parameterTypes=" + parameterTypes +
                '}';
    }
}
