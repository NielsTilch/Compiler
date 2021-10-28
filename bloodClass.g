grammar bloodClass;

//IL RESTE LE PROBLEME DE CONDEXPR DANS EXPRESSION A REGLER
//envoie_message s'applique sur des String aussi ? Si 3.toString() existe aussi, ça veut dire qu'envoie_message s'applique sur un atom+variable

//les pb d'espaces et de commentaires sont reglé avec COMMENT et WS
//pb avec les 'is' --> pour les faire fonctionner, j'ai juste mis un espace devant (toute façon c'est obligatoire à chaque fois)
//déclaration d'attribut (this.x := 0 == fonctionne pas) --> problème résolu (expression)


options { language = Java;
backtrack=false;
output = AST;
k=1; }


tokens {
ROOT;
CLASSE; 
WHILE;
IF;
CLASS;
PARAM;
EXTENDS;
DEF_BLOC;
BLOC;
CONSTR;
SUPER_CONS;
METHODE_DEF;
NEW;
DEF_METH_CONS;
ATTRIB;
DECL_VAR;
CAST;
INSTAN;
EXP_CONST;
COND_EXP;
RESULT;
ENVOI_MESS;
ENVOI_MESS_CONS;
}

prog : classDef* progPrincipal -> ^(ROOT classDef* progPrincipal)
	; 
 
//Definition du bloc principal
progPrincipal
	:bloc
	;

//on décrit ici les définitions de classes
classDef
	:'class' className '(' (formalParam (',' formalParam)*)? ')' choixHeritage -> ^(CLASSE className formalParam* choixHeritage)
	;
 
//--> ça marche en mettant un '?' dans classDef mais si on factorise trop l'ast a du mal à se faire
choixHeritage
	:'extends' className ' is' '{'blocDeClasse'}' -> ^(EXTENDS className blocDeClasse)
	|' is' '{'blocDeClasse'}' -> blocDeClasse
	;
 
formalParam
	:('var')? name ':' choixNameClass ->  ^(PARAM name choixNameClass)
	;

	
//Construction des blocs avec constructeur (CA MARCHE TOUT BIEN ET CEST LL1)
blocDeClasse 
	:attribDef blocDeClasse 
	//--> Ajout de variables de classes
	|'def' methodeOuCons -> ^(DEF_METH_CONS methodeOuCons)
	//--> Ajout de fonciton
	;

methodeOuCons 
	:consDef blocSansCons* 
	//--> On met le constructeur 
	|methodeDef blocDeClasse
	//--> On attend de mettre le constructeur plus tard
	;

//Définition du constructeur
consDef
	:className '(' (formalParam (',' formalParam)*)? ')' consSuper -> ^(CONSTR className formalParam* consSuper)
	;

consSuper
	:' is' bloc -> bloc		
	|':' className '(' (expr1 (',' expr1)*)? ')' ' is' bloc -> ^(SUPER_CONS className expr1* bloc)
	;

blocSansCons 
	:attribDef
	//--> On met les attributs de classes
	|'def' methodeDef ->  methodeDef
	//--> On met les methodes
	;

//Définition des attributs
attribDef
	:'var' ('static')? name ':' choixNameClass (':='expression)? ';' -> ^(ATTRIB ('static')? name choixNameClass (expression)?)
	;

//Définition de méthode
methodeDef
	:('static')? ('override')? name '(' (formalParam (',' formalParam)*)? ')'  permClassNameAvecExpr -> ^(METHODE_DEF ('static')? ('override')? name formalParam* permClassNameAvecExpr)
	;

//Les deux défintions suivantes permettent d'obliger l'utilisation du ': CLASSNAME' pour une expression et permettent de laisser le choix pour ' is' bloc
permClassNameAvecExpr	
	:':' choixNameClass devPerm -> choixNameClass devPerm
	|' is' bloc -> bloc
	;

devPerm
	:':=' expression -> expression
	|' is' bloc -> bloc
	;

//Description et construction des blocs
bloc
	:'{'(instruction)* '}' -> ^(BLOC instruction* )
	;


//Declaration des variables locales
declaration_variable
	:':' choixNameClass (':='  expression)? -> ^(DECL_VAR choixNameClass expression?)
	;
	
//Declaration des instructions
instruction
	:expression (declaration_variable)? ';' -> expression declaration_variable?
	|bloc
	|'is'
	|'return' ';' -> 'return' //J'ai rajouté les return mais je sais pas comment ça marche encore
	|condition //|'if' expression 'then' instruction 'else' instruction
	|whileBoucle //while (condExpr) do bloc
	;

//Partie Expression

expression
	:'(' ('as'  className ':')? expression ')' ('.'?condExpr)? (':=' expression)? -> ^(CAST className? expression condExpr? expression?)
	|instanciation ('.'?condExpr)? (':=' expression)? -> instanciation condExpr? expression?
	|constante ('.'?condExpr)? (':=' expression)? -> ^(EXP_CONST constante condExpr? expression?)
	|condExpr /*(':' choixNameClass)?*/ (':=' expression)? -> ^(COND_EXP condExpr /*choixNameClass?*/ expression?)
	|'result' ('.'?condExpr)? (':=' expression)? -> ^(RESULT condExpr? expression?)
	;
	


//les identificateurs c'est plus que ça
identificateur
	:'this'
	|'super'
	//|'result'
	;

/*envoie_message
	:'.'?  envoie_message1 -> envoie_message1
	;

envoie_message1 
	:name ('(' (expr1 (','  expr1)* )? ')')? -> name expr1* 
	|className ('(' (expr1 (','  expr1)* )? ')')? -> className expr1*
	;
*/
 
constante
	:'Integer'
	|'String'
	;

instanciation
	:'new' className '(' (expr1(',' expr1)*)? ')' -> ^(NEW className expr1*)
	;


condition
	:'if' expression 'then' instruction 'else' instruction -> ^(IF expression instruction instruction)  //est ce que le else est obligatoire ?
	;

//Definition du bloc While
whileBoucle
	:'while' '(' expression ')' 'do' bloc -> ^(WHILE expression bloc)
	;

condExpr
	:expr1 ( ('=' ^| '<>' ^| '<' ^| '>'^) expr1)? 
	;

//J'ai rajouté la soustraction dans les opérateurs arithmétiques
expr1
	: expr2 (('+'^|'-'^)? expr2)*
	//|variable ('&' variable)* --> factorisation
	;
 
//Au cas où je rajoute les diviser aussi dasn les opérateurs arithmétiques (JE NE SUIS PAS SURE DE L'EXISTENCE DU DIVISER)
expr2
	: atom (('*'^|'/'^|'&'^|'.'^) atom)*
	 //--> la distinction String et INT et NAME en fct des opérateurs se fera sémentiquement
	//| identificateur
	;
 
//J'ai rajouté l'existence des nombres négatifs seuls
atom
	:NB
	|name ('(' (expr1 (','  expr1)* )? ')')? -> ENVOI_MESS name expr1* 
	|className ('(' (expr1 (','  expr1)* )? ')')? -> ENVOI_MESS_CONS className expr1*
	|identificateur
	|STRING
	;
 
 
choixNameClass 
	: className
	|constante
	;
 
className
	:CLASSNAME
	;

name
	:NAME
	;

//Pré-défini
NAME 	: ('a'..'z') ('a'..'z'|'A'..'Z'|'0'..'9')* 
	;

CLASSNAME 	
	: ('A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')* 
	;

NB 	: ('-'|'+')?('0'..'9')+
   	;
   	
//NBNeg	: '-'('0'..'9')+;
   	
STRING 	: '"' ~'"'* '"'
	;
  
//On enlèev la prise en compte des commentaires
COMMENT	:  '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    	;

WS	: ('\n' | '\r' | ' ' | '\t' )+ {$channel=HIDDEN;}
	;