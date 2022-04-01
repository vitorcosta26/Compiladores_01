# Relatório

⠀⠀⠀⠀⠀⠀Após as informações passadas em sala de aula fomos atrás de alguns exemplos nos livros passados em aula e logo após na internet para ter uma ídeia de como seria procedido a implementação, após as devidas pesquisas pegamos o código feito em sala para analisa-lo melhor, fizemos algumas alterações nele para melhor funcionamento e consequentemente melhor entendimento do mesmo. Nesse processo chegou o dia da aula 04/03 onde a professora passou novas informações sobre essa atividade onde assim fomos esclarecidos quanto as dúvidas pendentes em como fazer um analisador genérico e não um do tipo específico, com as novas informações foi rápido de se entender o que seria feito utilizando o código feito em aula como principal fonte de ajuda e implementação, fazendo todas as alterações de  restrição.



# Pacotes e classes

|**Pacote**|**Classe**|
| :-: | :-: |
|compilador|<p>lexico.java</p><p>sintaticoBaseListener.java</p><p>sintaticoBaseVisitor.java</p><p>sintaticoLexer.java</p><p>sintaticoListener.java</p><p>sintaticoParser.java</p><p>sintaticoVisitor.java</p>|
|listener|ErrorListener.java|
|visitor|Visitor.java|
|main|Main.java|

O pacote compilador possui todas as classes referentes a gramática geradas pelo *antlr4*.

A classe *ErrorListener* no pacote listener estende *BaseErrorListener* e implementa o método *syntaxError* para apontar erros sintáticos.

A classe *Visitor*  contida no pacote visitor é a uma extensão da classe *sintaticoBaseVisitor*.

A classe *Main* é responsável por fazer a leitura do arquivo que possui o código a ser testado e também as chamadas para as análises léxica e sintática, esta classe possui o método *getTokens* que permite fazer a visualização dos tokens gerados pelo código lido.
# Gramática lexical
As regras da gramática foram definidas de acordo com as especificações do documento desta atividade.

A disposição das regras segue a lógica de que as regras são consumidas na ordem em que estão dispostas, o que pode resultar em uma má formação do token ou o reconhecimento errado do mesmo.

A gramática lexical contém algumas regras acompanhadas da palavra reservada *fragment*, essas regras não geram tokens porém elas fazem parte de algumas regras que geram.

Como a linguagem não é case sensitive, a estratégia usada foi gerar fragmentos que pudessem reconhecer qualquer letra, seja ela maiúscula ou minúscula, reconhecendo assim as palavras reservadas com qualquer configuração, totalmente maiúscula, totalmente minúscula ou ainda intercalando de forma aleatória.

## Tokens:
ESPACO: todos os espaço simples, tabulações ou ainda um pulos de linha são ignorados pelo analisador léxico;

COMENTARIO: tudo que vier depois de dupla barra é ignorado pelo analisador léxico;

CADEIA: tudo que venha entre aspas';

OPLOG: tipo dos operadores lógicos, “e” e “ou”;

OPNEG: tipo do operador de negação ;

OPAD: tipo dos operadores de soma e subtração;

OPMULT: tipo dos operadores de multiplicação e divisão;

OPREL: tipo dos operadores relacionais, menor, maior, menor ou igual, maior ou igual, igual e diferente;

PROGRAM: palavra reservada;

INTEGER: palavra reservada;;

BOOLEAN: palavra reservada;;

BEGIN: palavra reservada;;

END: palavra reservada;;

WHILE: palavra reservada;;

DO: palavra reservada;;

READ: palavra reservada;;

VAR: palavra reservada;;

FALSE: palavra reservada;;

TRUE: palavra reservada;;

WRITE: palavra reservada;;

STRING: palavra reservada;

IF: palavra reservada;;

ELSE: palavra reservada;;

THEN: palavra reservada;;

OR: operador lógico “ou”;

AND: operador lógico “e”;

NEG: operador de negação;

MAIS: símbolo de adição;

MENOS: símbolo de subtração;

VEZES: símbolo de multiplicação;

DIV: símbolo de divisão;

MAIOR: símbolo de maior;

MENOR: símbolo de menor;

MAIG: símbolo de maior ou igual;

MENIG: símbolo de menor ou igual;

IGUAL: símbolo de igual;

DIFER: símbolo de diferente;

PVIG: símbolo de dois pontos;

ABPAR: símbolo deabre parênteses;

FPAR: símbolo de fecha parênteses;

ATRIB: símbolo de atribuição;

DPONTOS: símbolo de dois pontos;

PONTO: símbolo de ponto;

VIG: símbolo de vírgula;

IDENTIFIER: sequência de letras e números que começa obrigatoriamente com uma letra;

CTE: números inteiros;

Regras léxicas que não formam token, mas fazem parte de outras regras.

NUMERO: número que vai de 0 a 9;

LETRA: letra de “a” a “z”, minúsculo ou maiúsculo;

A: “a” minúsculo ou maiúsculo;

B: “b” minúsculo ou maiúsculo;

C: “c” minúsculo ou maiúsculo;

D: “d” minúsculo ou maiúsculo;

E: “e” minúsculo ou maiúsculo;

F: “f” minúsculo ou maiúsculo;

G: “g” minúsculo ou maiúsculo;

H: “h” minúsculo ou maiúsculo;

I: “i” minúsculo ou maiúsculo;

J: “j” minúsculo ou maiúsculo;

K: “k” minúsculo ou maiúsculo;

L: “l” minúsculo ou maiúsculo;

M: “m” minúsculo ou maiúsculo;

N: “n” minúsculo ou maiúsculo;

O: “o” minúsculo ou maiúsculo;

P: “p” minúsculo ou maiúsculo;

Q: “q” minúsculo ou maiúsculo;

R: “r” minúsculo ou maiúsculo;

S: “s” minúsculo ou maiúsculo;

T: “t” minúsculo ou maiúsculo;

U: “u” minúsculo ou maiúsculo;

V: “v” minúsculo ou maiúsculo;

W: “w” minúsculo ou maiúsculo;

X: “x” minúsculo ou maiúsculo;

Y: “y” minúsculo ou maiúsculo;

Z: “z” minúsculo ou maiúsculo;
# Gramática sintática
As regras sintáticas seguem o modelo apresentado no documento da atividade.

A única alteração se deu na regra *expr*, já que a mesma apresentava ambiguidade, o que acarretaria em um erro posterior na forma como as expressões seriam resolvidas. A forma como a ambiguidade foi removida foi seguindo as regras de precedência da matemática, como o *antlr4* consome as regras em ordem, iniciamos a regra com a possibilidade da expressão possuir o sinal de positivo ou negativo, seguido pela regra que garante que o que vier entre parêntese será resolvido primeiro, seguido das operações de multiplicação ou divisão, e depois as de adição ou subtração. Por último definimos que uma expressão pode ser formada por qualquer identificador, número inteiro, expressão true ou false ou ainda um sinal de negação, tudo isso podendo ou não ser seguido de um sinal de negação.
