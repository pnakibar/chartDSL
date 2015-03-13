/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar MyLang;


expr    :   expr1 ((PLUS | MINUS) expr1)*
        ;

expr1   :   expr2 ((MULT | DIV) expr2)*
        ;

expr2   : NUM
        | '-' expr2
        | '(' expr ')'
        ;

MULT    : '*' ;
DIV     : '/' ;
PLUS    : '+' ;
MINUS   : '-' ;

DIGIT   : [0-9]
        ;

NUM     : DIGIT+
        ;

