package codegeneration;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void,Void> {
    /*
    execute[[Assignment: statement -> expression1 expression2]] =
        address[[expression1]]
        value[[expression2]]
        <store> expression1.type.suffix()

    execute[[Read: statement -> expression]] =
        address[[expression]]
        <store> expression.type.suffix()

    execute[[Write: statement -> expression]] =
        value[[expression]]
        <out> expression.type.suffix()


    execute[[VariableDefinition: definition -> type ID]] =



    execute[[FunctionDefinition: type ID definition* statement*]] =
        ID <:>
        ' * Parameters:
        execute[[type]]
        ' * Local variables:
        definition*.forEach(vd -> execute[[vd]])
        int bytesLocals = definition*.isEmpty() ? 0 :
            -definition*.get(definition*.size()-1).offset;
        <enter > bytesLocals
        statements
     */
}
