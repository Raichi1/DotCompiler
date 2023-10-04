grammar Dot;

program
	: graph
	;

graph
	: gd=(GRAPH|DIGRAPH) id '{' stmt_list '}' #Grafo
	;

stmt_list
	: ( stmt ';'? )* #Stc
	;
							
stmt
	: node_stmt #Nodo
	| edge_stmt #Edge
	| attr_stmt #Attr
	| id '=' id #Assing
	;
									        
attr_stmt
	: gne=(GRAPH| NODE| EDGE) attr_list #AList
	;
											    
attr_list
	: ('['a_list']')+ #Aarr
	;
												        
a_list
	: (id ('=' id)+ ','?)+ #Ass
	;

edge_stmt
	: (node_id|subgraph) edgeRHS? attr_list? #Subgrafo
	;

edgeRHS
	: EDGEOP (node_id|subgraph) edgeRHS? #NodeEdge
	;

node_stmt
	: node_id attr_list #NodeAttr
	;

node_id
	: id port? #NodeO
	;															    

port
	: ':' id (':' id)?			
	;

subgraph
	: SUBGRAPH ID '{' stmt_list '}' #Sub
	;

id
	: ID #Identify
	| STRING #String
	| NUMBER #Number
	;


GRAPH : 'graph' ;
DIGRAPH : 'digraph';
SUBGRAPH : 'subgraph';
NODE : 'node';
EDGE : 'edge';

EQUAL : '=';
POINT : ':';
LCURLY : '{' ;
RCURLY : '}' ;
LBRACKET : '[';
RBRACKET : ']';

SEMICOLON : ';' ;
ENDC : ',' ;

EDGEOP: '->'|'--';


ID: [a-zA-Z_][a-zA-Z_0-9]*;
STRING: '"' ('\\"'|.)*? '"';
NUMBER: '-'? ('.' [0-9]+|[0-9]+ ('.' [0-9]*)? );
WS: [ \t\n\r\f]+ -> skip ;

