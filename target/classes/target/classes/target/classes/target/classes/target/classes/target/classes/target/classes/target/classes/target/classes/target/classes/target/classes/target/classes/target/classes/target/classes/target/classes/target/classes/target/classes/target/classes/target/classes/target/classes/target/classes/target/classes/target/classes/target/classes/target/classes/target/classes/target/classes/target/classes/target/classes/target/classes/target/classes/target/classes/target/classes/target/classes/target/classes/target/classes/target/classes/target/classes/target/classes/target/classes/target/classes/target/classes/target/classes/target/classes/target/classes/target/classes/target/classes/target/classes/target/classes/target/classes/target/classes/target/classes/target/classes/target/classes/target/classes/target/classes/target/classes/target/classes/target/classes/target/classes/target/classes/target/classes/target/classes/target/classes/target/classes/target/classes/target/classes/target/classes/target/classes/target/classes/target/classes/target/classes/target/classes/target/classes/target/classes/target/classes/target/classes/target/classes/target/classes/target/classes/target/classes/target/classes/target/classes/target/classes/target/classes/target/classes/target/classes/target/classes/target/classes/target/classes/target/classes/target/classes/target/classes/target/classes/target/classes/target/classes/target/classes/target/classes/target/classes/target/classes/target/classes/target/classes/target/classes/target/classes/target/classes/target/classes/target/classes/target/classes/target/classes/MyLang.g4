/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar MyLang;


expr    :  definechart
        ;


definchart returns [JFreeChart chartmodel]
        : VARNAME ASSIGNMENT CHARTS {$result = new Chart($ASSIGNMENT.text)}
        ;

CHARTS  : 'pie'
        | 'line';

VARNAME : [a-zA-z]+;
TYPE    : '[a-zA-z]+';
MULT    : '*' ;
DIV     : '/' ;
PLUS    : '+' ;
MINUS   : '-' ;
ASSIGNMENT : ':=';

DIGIT   : [0-9]
        ;

NUM     : DIGIT+
        ;


WS      : [\s\t\r\n]+ -> skip ;
