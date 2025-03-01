grammar Cmm;

@header{
    import ast.*;
    import ast.program.*;
    import ast.expressions.*;
    import ast.statements.*;
    import ast.type.*;

}

program returns [Program ast]
           locals [List<Definition> definitions = new ArrayList<>()]:
                (df1=definition{$definitions.add($df1.ast);})* df2=main_function{$definitions.add($df2.ast);} EOF
                {$ast = new Program($definitions);}
                ;

main_function returns [Definition ast]
                    locals [List<VariableDefinition> parameters = new ArrayList<>(),
                        FunctionType fType,
                       List<VariableDefinition> varDefinitions = new ArrayList<>(),
                       List<Statement> statements = new ArrayList<>()]:
                   'void' id1='main' '(' ')' {$fType = new FunctionType(new VoidType(),$parameters);}
                    '{' (vd=var_definition{$varDefinitions.add($vd.ast);})* //(st=statement{$statements.add($st.ast);})* '}'
                   (st=statement{$statements.addAll($st.ast);})* '}'
                   {$ast = new FunctionDefinition($id1.text,$fType,$varDefinitions,$statements, $id1.getLine(),$id1.getCharPositionInLine()+1);}
                   ;

expression returns [Expression ast]:
           ID {$ast = new VariableExpression($ID.getText(), $ID.getLine(), $ID.getCharPositionInLine()+1);}
          | ic=INT_CONSTANT {$ast = new IntLiteralExpression($ic.getLine(),
                                    $ic.getCharPositionInLine()+1 , LexerHelper.lexemeToInt($ic.getText()));}
          | rc=REAL_CONSTANT {$ast = new RealLiteralExpression(LexerHelper.lexemeToReal($rc.getText()),$rc.getLine(), $rc.getCharPositionInLine()+1);}
          | cc=CHAR_CONSTANT {$ast = new CharLiteralExpression(LexerHelper.lexemeToChar($cc.getText()),$cc.getLine(), $cc.getCharPositionInLine()+1);}
          | fi=function_invocation
          {$ast = $fi.ast;}
          | '(' e1=expression ')' {$ast = $e1.ast;} //Add is for precedence
          | e1=expression '[' e2=expression ']'
          {$ast = new IndexExpression($e1.ast, $e2.ast, $e1.ast.getLine(), $e1.ast.getColumn());}
          | e1=expression '.' ID
           {$ast = new FieldAccessExpression($e1.ast, $ID.text, $e1.ast.getLine(), $e1.ast.getColumn());}
          | p1='(' t1=primitive_type p2=')' e1=expression
          {$ast = new Cast($t1.ast, $e1.ast, $p1.getLine(), $p1.getCharPositionInLine()+1);}
          | op='-' e1=expression
          {$ast = new UnaryMinusExpression($e1.ast, $op.getLine(), $op.getCharPositionInLine()+1);}
          | op='!' e1=expression
          {$ast = new NegationExpression($e1.ast, $op.getLine(), $op.getCharPositionInLine()+1);}
          | e1=expression ('*'|'/'|'%') e2=expression
          {$ast = new ArithmeticExpression($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $op.text, $e2.ast);}
          | e1=expression op=('+'|'-') e2=expression
          {$ast = new ArithmeticExpression($e1.ast.getLine(), $e1.ast.getColumn(), $e1.ast, $op.text, $e2.ast);}
          | e1=expression op=('>'|'>='|'<'|'<='|'!='|'==') e2=expression
          {$ast = new RelationalExpression($e1.ast, $op.text, $e2.ast, $e1.ast.getLine(), $e1.ast.getColumn());}
          | e1=expression op=('&&'|'||') e2=expression
          {$ast = new LogicalExpression($e1.ast, $op.text, $e2.ast, $e1.ast.getLine(), $e1.ast.getColumn());}
          ;

function_invocation returns  [FunctionInvocation ast]
                    locals  [List<Expression> expressions = new ArrayList<>()]:
                    ID '(' ( e2=expression{$expressions.add($e2.ast);} (','e3=expression{$expressions.add($e3.ast);})* )? ')'
                    {$ast = new FunctionInvocation($ID.text, $expressions, $ID.getLine(), $ID.getCharPositionInLine()+1);}
                   ;

type returns [Type ast]: t1=primitive_type {$ast = $t1.ast;}
    | t2=type '['ic=INT_CONSTANT']' {$ast = new ArrayType($t2.ast,LexerHelper.lexemeToInt($ic.getText()));}//Factory
    | st=struct_type {$ast = $st.ast;}
    ;

//struct_type:  'struct' '{'record_field+| struct_type'}' ID
//            | 'struct' '{'struct_type'}' ID ';'
//           ;
struct_type returns  [StructType ast]
            locals  [List<RecordField> fields = new ArrayList<>()]:
            'struct' '{' (rf=record_field{$fields.add($rf.ast);})+ '}'
            {$ast = new StructType($fields);};

record_field returns [RecordField ast]: t=type ID ';' {$ast = new RecordField($t.ast, $ID.text);}
            ;

primitive_type returns [Type ast]: 'int' {$ast = new IntType();}
              | 'char' {$ast = new CharType();}
              | 'double' {$ast = new DoubleType();}
              ;

statement returns [List<Statement> ast = new ArrayList<>()]
    locals  [List<Expression> expressions = new ArrayList<>(),List<Statement> elseBody = new ArrayList<>()]:
         //wo='write' e1=expression {$expressions.add($e1.ast);}(','e2=expression{$expressions.add($e2.ast);})*';'//List: 1 statement of each write
         //{$ast = new WriteStatement($expressions,$wo.getLine(),$wo.getCharPositionInLine()+1);}
         wo='write' e1=expression {$ast.add(new WriteStatement($e1.ast,$wo.getLine(),$wo.getCharPositionInLine()+1));}
         (','e2=expression{$ast.add(new WriteStatement($e2.ast,$wo.getLine(),$wo.getCharPositionInLine()+1));})*';'//List: 1 statement of each write
         //| wo='read' e1=expression {$expressions.add($e1.ast);} (',' e2=expression {$expressions.add($e2.ast);})* ';'//List
         //{ $ast = new ReadStatement($expressions, $wo.getLine(), $wo.getCharPositionInLine() + 1); }
         | wo='read' e1=expression {$ast.add(new ReadStatement($e1.ast,$wo.getLine(),$wo.getCharPositionInLine()+1));}
         (','e2=expression{$ast.add(new ReadStatement($e2.ast,$wo.getLine(),$wo.getCharPositionInLine()+1));})*';'
         | 'return' e1=expression ';'//(','expression)*';'//Una o varias?
         //{$ast = new ReturnStatement($e1.ast, $e1.ast.getLine(), $e1.ast.getColumn());}
         {$ast.add(new ReturnStatement($e1.ast, $e1.ast.getLine(), $e1.ast.getColumn()));}

         | e1=expression '=' e2=expression ';'
          //{ $ast = new AssignmentStatement($e1.ast, $e2.ast, $e1.ast.getLine(), $e1.ast.getColumn()); }
         { $ast.add(new AssignmentStatement($e1.ast, $e2.ast, $e1.ast.getLine(), $e1.ast.getColumn())); }

         | wo='while' '(' e1=expression ')' b1=block
         //{$ast = new WhileStatement($e1.ast, $b1.ast, $wo.getLine(), $wo.getCharPositionInLine()+1);}
         { $ast.add(new WhileStatement($e1.ast, $b1.ast, $wo.getLine(), $wo.getCharPositionInLine()+1));}

         | wo='if' '(' e1=expression ')' b1=block
         ('else' b2=block {$elseBody.addAll($b2.ast);})?
         //{$ast = new IfElseStatement($e1.ast,$b1.ast, $elseBody ,$wo.getLine(), $wo.getCharPositionInLine() + 1);}
         {$ast.add(new IfElseStatement($e1.ast,$b1.ast, $elseBody ,$wo.getLine(), $wo.getCharPositionInLine() + 1));}

          //Pregunta
         | fi=function_invocation ';'
         //{ $ast = $fi.ast;}
         {$ast.add($fi.ast);}

         ;


block returns [List<Statement> ast = new ArrayList<>()]:
        //st=statement {$ast.add($st.ast);}
        st=statement {$ast.addAll($st.ast);}

        //| '{' (st=statement{$ast.add($st.ast);})* '}'
        | '{' (st=statement{$ast.addAll($st.ast);})* '}'

;

definition returns [Definition ast]:
            vd=var_definition {$ast = $vd.ast;}
          | fd=function_definition {$ast = $fd.ast;}
          ;

var_definition returns [VariableDefinition ast]: //List
                t2=type id1=ID
                {$ast = new VariableDefinition($t2.ast, $id1.getText(), $id1.getLine(), $id1.getCharPositionInLine()+1);}
                (',' id2=ID{$ast.addName($id2.text);})* ';'

                ;//cambiar


function_definition returns [FunctionDefinition ast]
                    locals [Type returnType,
                       List<VariableDefinition> parameters = new ArrayList<>(),
                       FunctionType fType,
                       List<VariableDefinition> varDefinitions = new ArrayList<>(),
                       List<Statement> statements = new ArrayList<>()]:
                    ft=function_type{$returnType = $ft.ast;} id1=ID '(' (pa=parameter_list{$parameters = $pa.ast;})? ')' {$fType = new FunctionType($returnType, $parameters);}
                     '{' (vd=var_definition{$varDefinitions.add($vd.ast);})* //(st=statement{$statements.add($st.ast);})* '}'
                     (st=statement{$statements.addAll($st.ast);})* '}'
                     {$ast = new FunctionDefinition($id1.text,$fType ,$varDefinitions,$statements, $id1.getLine(),$id1.getCharPositionInLine()+1);}
                     ;

function_type returns [Type ast]: pt=primitive_type{$ast = $pt.ast;} | 'void' {$ast = new VoidType();};

parameter_list returns [List<VariableDefinition> ast = new ArrayList<>()]:
                p1=primitive_type id1=ID {$ast.add(new VariableDefinition($p1.ast, $id1.getText(), $id1.getLine(), $id1.getCharPositionInLine()+1));}
                (',' p2=primitive_type id2=ID {$ast.add(new VariableDefinition($p2.ast, $id2.getText(), $id2.getLine(), $id2.getCharPositionInLine()+1));})*
                ;

INT_CONSTANT: [1-9] [0-9]*
            | '0'
            ;
ID: ( [a-zA-Z] | '_') ([a-zA-Z]|[0-9]|'_')*
  ;
CHAR_CONSTANT: '\'' . '\''
             | '\'' '\\' INT_CONSTANT '\''
             | '\'' '\\' [nt] '\''
             ;

ONE_LINE_COMMENT: '//' (~[\n])* -> skip
                ;
REAL_CONSTANT: INT_CONSTANT+ '.' INT_CONSTANT*
             | INT_CONSTANT* '.' INT_CONSTANT+
             | INT_CONSTANT+ [eE] [-+]? INT_CONSTANT+ // 3e3, 2E+5
             | INT_CONSTANT+ '.' INT_CONSTANT* [eE] [-+]? INT_CONSTANT+ // 34.12E-3, 2.e23
             | INT_CONSTANT* '.' INT_CONSTANT+ [eE] [-+]? INT_CONSTANT+ // .3E+3, 3e3
             ;
ML_COMMENT: '/*' .*? '*/' -> skip
          ;
WS: [ \t\n\r]+ -> skip ;

