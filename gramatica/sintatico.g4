grammar sintatico;

import lexico;

prog
	: PROGRAM IDENTIFIER PVIG decls cmdComp PONTO
	;

decls
	: ESPACO
	| VAR listDecl
	;

listDecl
	: declTip
	| declTip listDecl
	;

declTip
	: listId DPONTOS tip PVIG
	;

listId
	: IDENTIFIER
	| IDENTIFIER VIG listId
	;

tip
	: INTEGER
	| BOOLEAN
	| STRING
	;

cmdComp
	: BEGIN listCmd END
	;

listCmd
	: cmd
	| cmd PVIG listCmd
	;

cmd
	: cmdIf
	| cmdWhile
	| cmdRead
	| cmdWrite
	| cmdAtrib
	| cmdComp
	;

cmdIf
	: IF expr THEN cmd
	| IF expr THEN cmd ELSE cmd
	;

cmdWhile: WHILE expr DO cmd;

cmdRead: READ ABPAR listId FPAR;

cmdWrite: WRITE ABPAR listW FPAR;

listW
	: elemW
	| elemW VIG listW
	;

elemW
	: expr
	| CADEIA
	;

cmdAtrib: IDENTIFIER ATRIB expr;

expr
	: OPAD expr
	| OPNEG? ABPAR expr FPAR
	| expr OPMULT expr
	| expr OPAD expr
	| expr OPREL expr
	| OPNEG? IDENTIFIER
	| OPNEG? CTE
	| OPNEG? TRUE
	| OPNEG? FALSE
	| OPNEG? OPNEG
	;
