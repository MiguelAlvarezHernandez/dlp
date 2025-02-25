grammar Cmm;

@header{
    import ast.*;
    import ast.expressions.*;
    import ast.statements.*;
    import ast.type.*;
}
program: definition* main_function;

main_function: 'void' 'main' '(' ')' '{' var_definition* function_definition*'}';

expression returns [Expression ast]:
           ID {$ast = new VariableExpression($ID.getText(), $ID.getLine(), $ID.getCharPositionInLine()+1);}
          | ic=INT_CONSTANT {$ast = new IntLiteralExpression($ic.getLine(),
                                    $ic.getCharPositionInLine()+1 , LexerHelper.lexemeToInt($ic.getText()));}
          | rc=REAL_CONSTANT {$ast = new RealLiteralExpression(LexerHelper.lexemeToReal($rc.getText()),$rc.getLine(), $rc.getCharPositionInLine()+1);}
          | cc=CHAR_CONSTANT {$ast = new CharLiteralExpression(LexerHelper.lexemeToChar($cc.getText()),$cc.getLine(), $cc.getCharPositionInLine()+1);}
          | fi=function_invocation
          {$ast = $fi.ast;}
          | '(' expression ')'
          | e1=expression '[' e2=expression ']'
          {$ast = new IndexExpression($e1.ast, $e2.ast, $p1.getLine(), $p1.getCharPositionInLine()+1);}
          | e1=expression '.' ID
           {$ast = new FieldAccessExpression($e1.ast, $ID.text, $e1.ast.getLine(), $e1.ast.getColumn());}
          | p1='(' t1=primitive_type p2=')' e1=expression
          {$ast = new Cast($t1.ast, $e1.ast, $p1.getLine(), $p1.getCharPositionInLine()+1);}
          | op='-' e1=expression
          {$ast = new UnaryMinusExpression($e1.ast, $op.getLine(), $op.getCharPositionInLine()+1);}
          | op='!' e1=expression
          {$ast = new NegationExpression($e1.ast, $op.getLine(), $op.getCharPositionInLine()+1);}
          | expression ('*'|'/'|'%') expression
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
    | t2=type '['ic=INT_CONSTANT']' {$ast = new ArrayType($t2.ast,LexerHelper.lexemeToInt($ic.getText()));}
    | st=struct_type {$ast = $st.ast;}
    ;

//struct_type:  'struct' '{'record_field+| struct_type'}' ID
//            | 'struct' '{'struct_type'}' ID ';'
//           ;
struct_type returns  [StructType ast]
            locals  [List<RecordField> fields = new ArrayList<>()]:
            'struct' '{' (rf=record_field{$fields.add($rf.ast);})+ '}'
            {$ast = new StructType($fields);};

record_field returns [RecordField ast]: t=type ID ';' {$ast = new RecordField($t.ast, $ID.text)}
            ;

primitive_type returns [Type ast]: 'int' {$ast = new IntType();}
              | 'char' {$ast = new CharType();}
              | 'double' {$ast = new DoubleType();}
              ;

statement: 'write' expression (','expression)*';'
         | 'read' expression (','expression)*';'
         | 'return' expression (','expression)*';'
         | expression '=' expression ';'
         | 'while' '(' expression ')' block
         | 'if' '(' expression ')' block ('else' block)?
       //  | ID '(' expression ')' ';'
         | function_invocation ';'
         ;

block: statement
| '{' statement* '}'
;

definition: var_definition
          | function_definition
          ;

var_definition: type ID (',' ID)* ';';

function_definition: (primitive_type | 'void') ID '(' parameter_list? ')' '{' var_definition* statement* '}';

parameter_list: primitive_type ID (',' primitive_type ID)*;//type?

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

