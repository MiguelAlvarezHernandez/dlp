package semantic;

import ast.expressions.*;
import ast.program.Definition;
import ast.program.FunctionDefinition;
import ast.program.Program;
import ast.program.VariableDefinition;
import ast.statements.*;
import ast.type.*;
import semantic.symboltable.SymbolTable;

public class IdentificationVisitor extends AbstractVisitor<Void, Void> {

    SymbolTable symbolTable =  new SymbolTable();

    @Override
    public Void visit(FunctionDefinition functionDefinition, Void param) {
        if(!symbolTable.insert(functionDefinition)){
            new ErrorType(functionDefinition.getLine(), functionDefinition.getColumn(),"The variable " + functionDefinition.getName()+ " was already defined");

        }
        symbolTable.set();
        functionDefinition.getFunctionType().accept(this, param);
        for(Definition def: functionDefinition.getVarDefinitions()){
            def.accept(this, param);
        }
        for (Statement statement: functionDefinition.getStatements()){
            statement.accept(this, param);
        }
        symbolTable.reset();
        return null;
    }

    @Override
    public Void visit(VariableDefinition variableDefinition, Void param) {
        if(!symbolTable.insert(variableDefinition)){
            new ErrorType(variableDefinition.getLine(), variableDefinition.getColumn(),"The variable " + variableDefinition.getName()+ " was already defined");

        }
        symbolTable.set();
        variableDefinition.getType().accept(this, param);
        symbolTable.reset();

        return null;
    }

    @Override
    public Void visit(VariableExpression variableExpression, Void param) {
        Definition def = symbolTable.find(variableExpression.getName());
        if(def == null){
            new ErrorType(variableExpression.getLine(), variableExpression.getColumn(),"The variable " + variableExpression.getName() + " was not defined");
        }else{
            variableExpression.setDefinition(def);
        }
        return null;
    }

}
