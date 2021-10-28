grammar bloodReset;


options { language = Java;
backtrack=false;
output = AST;
k=1; }


tokens {
ROOT;
BLOCPRINCIPAL;
LISTDECLVARIABLE;
LISTINSTRUCT;
CLASSDEF;
LISTFORMALPARAM;
FORMALPARAM;
EXTENDS;
CONSDEF;
BLOCCLASSE;
LISTPARAM;
ATTRIBDEF;
METHODEDEF;
TYPERETOUR;
PARAM;
BLOC;
DECLVARIABLE;
CAST;
INST;
LISTPARAMAPPELCONSTR;
LISTOPERATEURS;
MESSAGE;
IF;
THEN;
ELSE;
WHILE;
ATOM;
SELECT;
MESSOUSELECT;
STR;
}

prog : classDef* progPrincipal -> ^(ROOT classDef* progPrincipal)
	;

//Definition du bloc principal
progPrincipal
	:'{' instruction* '}' -> ^(BLOCPRINCIPAL instruction*)
	;

//on décrit ici les définitions de classes
classDef
	:'class' CLASSNAME '(' (formalOuPas (',' formalOuPas)*)? ')' choixHeritage -> ^(CLASSDEF CLASSNAME ^(LISTFORMALPARAM formalOuPas*) choixHeritage)
	;

choixHeritage
	:'extends' CLASSNAME ' is' '{'blocDeClasse'}' -> ^(EXTENDS CLASSNAME) ^(BLOCCLASSE blocDeClasse)
	|' is' '{'blocDeClasse'}' -> ^(BLOCCLASSE blocDeClasse)
	;


//Construction des blocs avec constructeur
blocDeClasse
	:attribDef blocDeClasse
	//--> Ajout de variables de classes
	|'def' methodeOuCons -> methodeOuCons
	//--> Ajout de fonction
	;

methodeOuCons
	:consDef blocSansCons*
	//--> On met le constructeur
	|methodeDef blocDeClasse
	//--> On attend de mettre le constructeur plus tard
	;

//Définition du constructeur
consDef
	:CLASSNAME '(' (formalOuPas (',' formalOuPas)*)? ')' consSuper -> ^(CONSDEF CLASSNAME ^(LISTFORMALPARAM formalOuPas*) consSuper)
	;

consSuper
	:' is' bloc -> bloc
	|':' CLASSNAME '(' (expression (',' expression)*)? ')' ' is' bloc -> ^(EXTENDS CLASSNAME ^(LISTFORMALPARAM expression*)) bloc
	;

blocSansCons
	:attribDef
	|'def' methodeDef -> methodeDef
	;

//Définition des attributs
attribDef
	:'var' ('static')? NAME ':' choixNameClass (':='expression)? ';' -> ^(ATTRIBDEF NAME ('static')? choixNameClass (expression)?)
	;

//Définition de méthode
methodeDef
	:('static')? ('override')? NAME '(' (param (',' param)*)? ')'  permClassNameAvecExpr -> ^(METHODEDEF NAME ('static')? ('override')? ^(LISTPARAM param*) permClassNameAvecExpr)
	;

formalOuPas
	:param
	|formalParam
	;	

formalParam
	:'var' NAME ':' choixNameClass -> ^(FORMALPARAM NAME choixNameClass)
	;

param 	:NAME ':' choixNameClass -> ^(PARAM NAME choixNameClass);

//Les deux défintions suivantes permettent d'obliger l'utilisation du ': CLASSNAME' pour une expression et permettent de laisser le choix pour ' is' bloc
permClassNameAvecExpr
	:':' choixNameClass devPerm -> ^(TYPERETOUR choixNameClass) devPerm
	|' is' bloc -> bloc
	;

devPerm
	:':=' expression -> expression
	|' is' bloc -> bloc
	;

//Description et construction des blocs
bloc
	:'{' (instruction)* '}' -> ^(BLOC (instruction)*)
	;


//Declaration des variables locales
/*declaration_variable
	:formalOuPas (':='  expression)? ';' -> ^(DECLVARIABLE formalOuPas ^(':=' expression)?)
	;*/

//Declaration des instructions
instruction
	:expression (':='^ expression)? ';'! /*-> expression ^(AFFECT expression)?*/
	|bloc
	|'return' ';' -> 'return'
	|condition
	|whileBoucle
	|'is'
	;

//Partie Expression

//--> le .NAME correspond à la selection
//--> factorisation de la parenthèse
//--> J'ai déplacé dans atom, plus permissif mais ok
expression
	:
	instanciation ('.' NAME)? -> instanciation NAME?
	//|envoie_message ('.' NAME)?
	|condExpr
	;

factoParenthese
	:expression
	|'as' choixNameClass ':' expression -> ^(CAST choixNameClass expression)
	;

//les identificateurs c'est plus que ça
identificateur
	:'this'
	|'super'
	|'result'
	;

constante
	:'Integer'
	|'String'
	;

instanciation
	:'new' choixNameClass '(' (expression(',' expression)*)? ')' -> ^(INST choixNameClass ^(LISTPARAMAPPELCONSTR expression*))
	;

envoie_message
	: '(' (expression (','  expression)* )? ')' -> ^(LISTOPERATEURS expression*) 
	;


condition
	:'if' condExpr 'then' instruction 'else' instruction -> ^(IF condExpr ^(THEN instruction) ^(ELSE instruction))
	;

//Definition du bloc While
whileBoucle
	:'while' '(' condExpr ')' 'do' bloc -> ^(WHILE condExpr bloc)
	;

condExpr
	:exprOperateur (('='^| '<>'^| '<'^| '>'^) exprOperateur)?
	;

//J'ai rajouté la soustraction dans les opérateurs arithmétiques
exprOperateur
	: ('+'|'-')? expr2 (('+'^|'-'^) expr2 )*
	;

//Au cas où je rajoute les diviser aussi dans les opérateurs arithmétiques (JE NE SUIS PAS SURE DE L'EXISTENCE DU DIVISER)
expr2
	: exprFinale (('*'^|'/'^|'&'^) exprFinale )*
	;

//J'ai rajouté l'existence des nombres négatifs seuls
exprFinale
	:atom (messOuSelect -> ^(MESSOUSELECT atom messOuSelect )
	| -> atom) 
	;
	
messOuSelect
	:'.' NAME (envoie_message messOuSelect? -> ^(MESSAGE NAME envoie_message) messOuSelect?
	| messOuSelect? -> ^(SELECT NAME) messOuSelect?) 
	; 

atom
	:NB
	|STRING -> ^(STR STRING)
	|NAME (':' choixNameClass -> ^(DECLVARIABLE NAME choixNameClass)
		| -> NAME)
	|identificateur
	|constante
	|'('! factoParenthese ')'!
	|CLASSNAME 
	;

choixNameClass
	:CLASSNAME
	|constante
	;

//Pré-défini
NAME 	: ('a'..'z') ('a'..'z'|'A'..'Z'|'0'..'9')*
	;

CLASSNAME
	: ('A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
	;

NB 	: ('0'..'9')+
   	;

STRING 	: '"' ~'"'* '"'
	;

//On enlèev la prise en compte des commentaires
COMMENT	:  '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    	;

WS	: ('\n' | '\r' | ' ' | '\t' )+ {$channel=HIDDEN;}
	;
