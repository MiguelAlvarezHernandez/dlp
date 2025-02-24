grammar Cmm;	

program: (definition*) definition;

expression: ID
          | INT_CONSTANT
          | REAL_CONSTANT
          | CHAR_CONSTANT
          | function_invocation
          | '(' expression ')'
          | expression '[' expression ']'
          | expression '.' ID
          | '(' primitive_type ')' expression
          | '-' expression
          | '!' expression
          | expression ('*'|'/'|'%') expression
          | expression ('+'|'-') expression
          | expression ('>'|'>='|'<'|'<='|'!='|'==') expression
          | expression ('&&'|'||') expression
          ;

function_invocation: ID '(' ( expression (','expression)* )? ')'
                   ;

type: primitive_type
    | type '['INT_CONSTANT']'
    | struct_type
    ;

//struct_type:  'struct' '{'record_field+| struct_type'}' ID
//            | 'struct' '{'struct_type'}' ID ';'
//           ;
struct_type: 'struct' '{' record_field+ '}' ;

record_field: type ID ';'
            ;

primitive_type: 'int'
              | 'char'
              | 'double'
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

