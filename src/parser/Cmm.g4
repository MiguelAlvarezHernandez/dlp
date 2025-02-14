grammar Cmm;	

program: (WS | INT_CONSTANT | REAL_CONSTANT | CHAR_CONSTANT | ID | ONE_LINE_COMMENT | ML_COMMENT)+;

  		 
INT_CONSTANT: [1-9] [0-9]*
            | '0'
            ;
ID: ( [a-zA-Z] | '_') ([a-zA-Z]|[0-9]|'_')*
  ;
CHAR_CONSTANT: '\'' . '\''
             | '\'' '\\' INT_CONSTANT '\''
             | '\'' '\\' [nt] '\''
             ;

ONE_LINE_COMMENT: '//' (~[\n])*
                ;
REAL_CONSTANT: INT_CONSTANT+ '.' INT_CONSTANT*
             | INT_CONSTANT* '.' INT_CONSTANT+
             | INT_CONSTANT+ [eE] [-+]? INT_CONSTANT+ // Ejemplo: 3e3, 2E+5
             | INT_CONSTANT+ '.' INT_CONSTANT* [eE] [-+]? INT_CONSTANT+ // Ejemplo: 34.12E-3, 2.e23
             | INT_CONSTANT* '.' INT_CONSTANT+ [eE] [-+]? INT_CONSTANT+ // Ejemplo: .3E+3, 3e3
             ;
ML_COMMENT: '/*' .*? '*/'
          ;
WS: [ \t\n\r]+ -> skip ;