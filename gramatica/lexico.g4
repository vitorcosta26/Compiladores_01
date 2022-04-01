lexer grammar lexico;

ESPACO: [ \t\r\n]+ -> skip;

COMENTARIO: '//' ~[\r\n]* -> skip;

CADEIA: '"' ~[\\"\r\n]* '"';

PROGRAM: P R O G R A M;
INTEGER: I N T E G E R;
BOOLEAN: B O O L E A N;
BEGIN: B E G I N;
END: E N D;
WHILE: W H I L E;
DO: D O;
READ: R E A D;
VAR: V A R;
FALSE: F A L S E;
TRUE: T R U E;
WRITE: W R I T E;

STRING: S T R I N G;
IF: I F;
ELSE: E L S E;
THEN: T H E N;

OPLOG
	: OR
	| AND
	;

OPNEG: NEG;

OPAD
	: MAIS
	| MENOS
	;

OPMULT
	: VEZES
	| DIV
	;

OPREL
	: MENOR
	| MENIG
	| MAIOR
	| MAIG
	| IGUAL
	| DIFER
	;

OR: O R;
AND: A N D;

NEG: '~';

MAIS: '+';
MENOS: '-';
VEZES: '*';
DIV: '/';

MAIOR: '>';
MENOR: '<';
MAIG: '>=';
MENIG: '<=';
IGUAL: '==';
DIFER: '<>';

PVIG: ';';
ABPAR: '(';
FPAR: ')';
ATRIB: ':=';
DPONTOS: ':';
PONTO: '.';
VIG: ',';

ID: LETRA (LETRA | NUMERO)*;
CTE: NUMERO+;

fragment NUMERO: [0-9];
fragment LETRA: [a-zA-Z];

fragment A: ('a' | 'A');
fragment B: ('b' | 'B');
fragment C: ('c' | 'C');
fragment D: ('d' | 'D');
fragment E: ('e' | 'E');
fragment F: ('f' | 'F');
fragment G: ('g' | 'G');
fragment H: ('h' | 'H');
fragment I: ('i' | 'I');
fragment J: ('j' | 'J');
fragment K: ('k' | 'K');
fragment L: ('l' | 'L');
fragment M: ('m' | 'M');
fragment N: ('n' | 'N');
fragment O: ('o' | 'O');
fragment P: ('p' | 'P');
fragment Q: ('q' | 'Q');
fragment R: ('r' | 'R');
fragment S: ('s' | 'S');
fragment T: ('t' | 'T');
fragment U: ('u' | 'U');
fragment V: ('v' | 'V');
fragment W: ('w' | 'W');
fragment X: ('x' | 'X');
fragment Y: ('y' | 'Y');
fragment Z: ('z' | 'Z');
