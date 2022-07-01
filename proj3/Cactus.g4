//The grammer for Cactus language
grammar Cactus;

//Parser rules
program :MAIN LP RP LB 
	{	 System.out.println("\t" + ".data");}
	declarations 
	{
		System.out.println("\t" + ".text");
		System.out.println("main:");
	}
	statements[0,1] RB;

declarations:INT ID{
	System.out.println($ID.text+":\t.word\t0");	

}SEMI declarations |;

statements [int reg,int label] returns [int nreg,int nlabel]:
	statement[$reg,$label] statements[$statement.nreg,$statement.nlabel]{
	$nreg=$statements.nreg;
	$nlabel=$statements.nlabel;
}|{
	$nreg=$reg;
	$nlabel=$label;
};

statement[int reg,int label] returns [int nreg,int nlabel] : ID ASSIGN arith_expression[$reg,$label] {
	System.out.println("\tla\t\$t"+$arith_expression.nreg+", "+$ID.text);
	System.out.println("\tsw\t\$t"+$arith_expression.place+", 0(\$t"+$arith_expression.nreg+")");
	$nreg= $arith_expression.nreg-1;
	$nlabel=$arith_expression.nlabel;
} SEMI
| IF LP{
	int b_true=$label++;
	int b_false=$label++;
	//int b_next=$label++;
}  bool_expression[$reg,$label,b_true,b_false] 
  RP LB{
	System.out.println("L"+b_true+":");
}
statements[$bool_expression.nreg,$bool_expression.nlabel] RB else_statement[$statements.nreg,$statements.nlabel,b_false] {
	$nreg=$else_statement.nreg;
	$nlabel=$else_statement.nlabel;
}|{
	int L_Begin=$label++;
	System.out.println("L"+L_Begin+":");
}
 WHILE LP {
	int b_true=$label++;
	int b_false=$label++;
} bool_expression[$reg,$label,b_true,b_false] RP LB{
	System.out.println("L"+b_true+":");
	##//$nlabel=$bool_expression.nlabel;		
}  statements[$bool_expression.nreg,$bool_expression.nlabel]{
	System.out.println("\tb\tL"+L_Begin);
}RB
{
	System.out.println("L"+b_false+":");
	$nreg=$statements.nreg;
	$nlabel=$statements.nlabel;
}
| READ ID{
	System.out.println("\tli\t\$vo, 5");
	System.out.println("\tsyscall");
	System.out.println("\tla\t\$t"+$reg+", "+$ID.text);
	System.out.println("\tsw\t\$vo, 0(\$t"+$reg+")");
	$nreg=$reg;
	$nlabel=$label;
}SEMI
| WRITE arith_expression[$reg,$label] {
	System.out.println("\tmove\t\$a0, \$t"+$arith_expression.place);
	System.out.println("\tli\t\$v0, 1");
	System.out.println("\tsyscall");
	$nreg=$arith_expression.nreg;
	$nlabel=$arith_expression.nlabel;
}SEMI
| RETURN{
	System.out.println("\tli\t\$vo, 10");
	System.out.println("\tsyscall");
	$nreg=0;
	$nlabel=$label;
}SEMI;
else_statement[int reg,int label,int b_false] returns [int nreg,int nlabel]: ELSE LB{
	int b_next=$label+1;
	System.out.println("\tb\tL"+b_next);
	System.out.println("L"+$b_false+":");
	//$label=$label+1;
	//$nlabel=label;
}statements[$reg,$label] {
	System.out.println("L"+b_next+":");
	$nreg=$statements.nreg;
	$nlabel=$statements.nlabel;
} RB{
	System.out.println("L"+$b_false+":");
	$nreg=$reg;
	$nlabel=$label;
}FI|FI{
	System.out.println("L"+$b_false+":");
};

bool_expression [int reg,int label,int b_true,int b_false] returns [int nreg,int nlabel]: 
{
	int bt_f=$label++;
}
	bool_term[$reg,$label,$b_true,bt_f]
	bool_expression1[$bool_term.nreg, $bool_term.nlabel, $b_true,$b_false,bt_f]{
	//System.out.println("\tb\tL"+$b_false);
	$nreg=$bool_expression1.nreg;
	$nlabel=$bool_expression1.nlabel;
};
bool_expression1[int reg,int label,int b_true,int b_false,int bt_f] returns [int nreg,int nlabel]:
OR{
	System.out.println("L"+$bt_f+":");
	$bt_f=$label++;
}bool_term[$reg,$label,$b_true,$bt_f] bool_expression1[$bool_term.nreg,$bool_term.nlabel,$b_true,$b_false,$bt_f]{
	//System.out.println("\t\$t0"+", \$t1"+", L"+$b_true);
	$nreg=$bool_expression1.nreg;
	$nlabel=$bool_expression1.nlabel;
}|{
	System.out.println("L"+$bt_f+":");
	System.out.println("\tb L"+$b_false);
	$nreg=$reg;
	$nlabel=$label;
};
bool_term[int reg,int label,int b_true,int b_false] returns [int nreg,int nlabel] :{
	int bt_t=$label++;		
}bool_factor[$reg,$label,bt_t,$b_false] bool_term1[$bool_factor.nreg,$bool_factor.nlabel,$b_true,$b_false,bt_t]{
	$nreg=$bool_term1.nreg;
	$nlabel=$bool_term1.nlabel;
};

bool_term1[int reg,int label,int b_true,int b_false,int bt_t] returns[int nreg,int nlabel]:
AND{
	System.out.println("L"+$bt_t+":");
	$bt_t=$label++;
}bool_factor[$reg,$label,$bt_t,$b_false]  
 bool_term1[$bool_factor.nreg,$bool_factor.nlabel,$b_true,$b_false,$bt_t]{
	$nreg=$bool_term1.nreg;
	$nlabel=$bool_term1.nlabel;
}|{
	System.out.println("L"+$bt_t+":");
	System.out.println("\tb L"+$b_true);
	$nreg=$reg;
	$nlabel=$label;
};
bool_factor[int reg,int label,int b_true,int b_false] returns [int nreg,int nlabel] :NOT bool_factor[$reg,$label,$b_false,b_true]{
	$nreg=$bool_factor.nreg;		
	$nlabel=$bool_factor.nlabel;
}| rel_expression[$reg,$label,$b_true,$b_false]{
	$nreg=$rel_expression.nreg;
	$nlabel=$rel_expression.nlabel;
};
rel_expression[int reg,int label,int b_true,int b_false] returns [int nreg,int nlabel] : 
ae0=arith_expression[$reg,$label] 
relation_op ae1=arith_expression[$arith_expression.nreg,$arith_expression.nlabel]{
	System.out.println("\t"+$relation_op.op+" \$t"+$ae0.place+", \$t"+$ae1.place+", L"+b_true);
	System.out.println("\tb\tL"+b_false);
	$nreg=$arith_expression.nreg-2;
	$nlabel=$arith_expression.nlabel;
};
relation_op returns[String op] : 
EQU {$op = "beq";} |
NE {$op = "bne";}|
GT {$op = "bgt";}| 
GE {$op = "bge";}| 
LT {$op = "blt";}| 
LE {$op = "ble";};

arith_expression [int reg,int label] returns [int nreg,int nlabel,int place] : arith_term[$reg,$label] 
arith_expression1[$arith_term.nreg,$arith_term.nlabel, $arith_term.place] {
	$nreg=$arith_expression1.nreg;
	$nlabel=$arith_expression1.nlabel;
	$place=$arith_expression1.place;
};
arith_expression1[int reg,int label,int s_place] returns [int nreg,int nlabel,int place]: 
ADD
arith_term[$reg,$label]{
	System.out.println("\tadd\t\$t"+$s_place+", \$t"+$s_place+", \$t"+$arith_term.place);
} arith_expression1[$arith_term.nreg,$arith_term.nlabel,$s_place] {
	$place=$arith_expression1.place;
	$nlabel=$arith_expression1.nlabel;
	$nreg=$arith_expression1.nreg-1;
}|SUB arith_term[$reg,$label]{
	System.out.println("\tsub\t\$t"+$s_place+", \$t"+$s_place+", \$t"+$arith_term.place);
} arith_expression1[$arith_term.nreg,$arith_term.nlabel, $s_place]{
	$place=$arith_expression1.place;
	$nlabel=$arith_expression1.nlabel;
	$nreg=$arith_expression1.nreg-1;
}
| {
	$nlabel=$label;
	$nreg=$reg;
	$place=$s_place;
};
arith_term [int reg,int label] returns [int nreg,int nlabel,int place] :
	arith_factor[$reg,$label] arith_term1[$arith_factor.nreg,$arith_factor.nlabel,$arith_factor.place] {
		$nreg=$arith_term1.nreg;
		$nlabel=$arith_term1.nlabel;
		$place=$arith_term1.place;
	};

arith_term1 [int reg,int label,int s_place] returns [int nreg,int nlabel,int place] : 
MUL arith_factor[$reg,$label]{
	System.out.println("\tmul\t\$t"+$s_place+", \$t"+$s_place+", \$t"+$arith_factor.place);} 
	arith_term1[$arith_factor.nreg,$arith_factor.nlabel,$s_place] {
	$place=$arith_term1.place;
	$nlabel=$arith_term1.nlabel;
	$nreg=$arith_term1.nreg-1;
}| DIV arith_factor[$reg,$label]{
	System.out.println("\tdiv\t\$t"+$s_place+", \$t"+$s_place+", \$t"+$arith_factor.place);}
	arith_term1[$arith_factor.nreg,$arith_factor.nlabel,$s_place] {
	$place=$arith_term1.place;
	$nlabel=$arith_term1.nlabel;
	$nreg=$arith_term1.nreg -1;
}| MOD arith_factor[$reg,$label]{
   	System.out.println("\trem\t\$t"+$s_place+", \$t"+$s_place+", \$t"+$arith_factor.place);
} arith_term1[$arith_factor.nreg,$arith_factor.nlabel,$s_place] {
	$place=$arith_term1.place;
	$nlabel=$arith_term1.nlabel;
	$nreg=$arith_term1.nreg-1;
}| {
	$nlabel=$label;
	$nreg=$reg;
	$place=$s_place;
};
arith_factor[int reg,int label] returns [int nreg,int nlabel,int place] :
SUB arith_factor[$reg,$label] {
	System.out.println("\tneg\t\$t"+$arith_factor.place+", \$t"+$arith_factor.place);
	$nreg=$arith_factor.nreg;
	$nlabel=$arith_factor.nlabel;
	$place=$arith_factor.place;
}| primary_expression[$reg,$label]{
	$nreg= $primary_expression.nreg;
	$nlabel=$primary_expression.nlabel;
	$place=$primary_expression.place;
};
primary_expression[int reg,int label] returns [int nreg,int nlabel,int place] : CONST{
	System.out.println("\tli\t\$t"+$reg+", "+$CONST.text);		
	$nreg=$reg+1;
	$nlabel=$label;
	$place=$reg;
}| ID{
	System.out.println("\tla\t\$t"+$reg+", "+$ID.text);
	System.out.println("\tlw\t\$t"+$reg+", 0(\$t"+$reg+")");
	$nreg=$reg+1;
	$nlabel=$label;
	$place=$reg; 
}
| LP arith_expression[$reg,$label] RP{
	$nreg=$arith_expression.nreg;
	$nlabel=$arith_expression.nlabel;
	$place=$arith_expression.place;
};



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