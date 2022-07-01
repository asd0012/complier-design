//The grammer for Cactus language
grammar Cactus;

//Parser rules
program : MAIN LP RP LB declarations statements RB;
declarations:INT ID SEMI declarations|;
statements:statement statements|;

statement: ID ASSIGN arith_expression SEMI
| IF LP bool_expression RP LB statements RB else_statement
| WHILE LP bool_expression RP LB statements RB
| READ ID SEMI
| WRITE arith_expression SEMI
| RETURN SEMI;
else_statement: ELSE LB statements RB FI|FI;

bool_expression: bool_term bool_expression1;
bool_expression1: OR bool_term bool_expression1|;
bool_term: bool_factor bool_term1;
bool_term1: AND bool_factor bool_term1|;
bool_factor:NOT bool_factor|rel_expression;
rel_expression: arith_expression relation_op arith_expression;
relation_op: EQU| NE|GT | GE| LT| LE;
arith_expression: arith_term arith_expression1;
arith_expression1: ADD arith_term arith_expression1|SUB arith_term arith_expression1|;
arith_term: arith_factor arith_term1;
arith_term1: MUL arith_factor arith_term1| DIV arith_factor arith_term1| MOD arith_factor arith_term1|;
arith_factor: SUB arith_factor| primary_expression;
primary_expression: CONST| ID| LP arith_expression RP;



//lexer rules
ELSE:'else';
INT:'int';
MAIN:'main';
RETURN:'return';
WHILE:'while';
READ:'read';
WRITE:'write';
FI:'fi';
IF:'if';
ID:[a-z_][a-z_0-9]*;
UID:[A-Z_][A-Z_0-9]*;
CONST:([0])|([1-9][0-9]*);
//CONST:([0])|([-]?[1-9][0-9]*);
ADD:'+';
SUB:'-';
MUL:'*';
DIV:'/';
MOD:'%';
ASSIGN:'=';
EQU:'==';
NE:'!=';
GE:'>=';
GT:'>';
LE:'<=';
LT:'<';
AND:'&&';
OR:'||';
NOT:'!';
LP:'(';
RP:')';
LB:'{';
RB:'}';
SEMI:';';
WS:([ \t\n\r]+) ->skip;
COMMENT:([\u002F\u002A][\u002A\u002F](~[\n])*[\n]) ->skip;
