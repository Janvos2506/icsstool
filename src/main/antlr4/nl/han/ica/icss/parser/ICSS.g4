grammar ICSS;

stylesheet 			: (assignment*) ((selector styleblock) | (selector optional styleblock))*;
selector 			: idselector | htmltag | classselector;
idselector 			: ('#' WORD (INT | WORD)*  );
classselector 		: ('.' WORD (INT | WORD)* );
htmltag				: WORD (INT | WORD)* | 'a' | 'b' | 'c' | 'd' | 'e' | 'f';
assignment          : variable + ':=' + statementvalue + ';';


styleblock 			: '{' stylerule* '}';
stylerule  			: statementid ':' statementvalue+ ';';
statementid  		: WORD ('-' WORD)?;
statementvalue		: hex | size | variable | operation;
hex 				: HEXCODE;
size				: INT+ 'px';
variable            : VARIABLE;
operator            : ADD | SUB | GREATER | LESS | EQUAL;
logicoperator       : OR;
optional            : (bool) | (bool + logicoperator + operation);
bool                : (BOOLEAN | variable);
operation           : (hex | size | variable) + operator + (hex | size | variable);

HEXCODE				: [#][a-fA-F0-9][a-fA-F0-9][a-fA-F0-9]([a-fA-F0-9][a-fA-F0-9][a-fA-F0-9])?;
INT					: [0-9];
BOOLEAN             : 'true' | 'false';
HEXDIGIT			: [A-Fa-f0-9];
VARIABLE            : [A-Z_]+;
WORD				: [a-z]+;
ADD                 : [+];
SUB                 : [-];
GREATER             : [>];
LESS                : [<];
EQUAL               : [=];
OR                  : '||';
WS                  : [ \t\r\n]+ -> skip;
SPACE               : ' ' -> skip;
