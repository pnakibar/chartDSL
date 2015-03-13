/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar MyLang;


expr    :  definevar
        ;

definevar
        : VARNAME ASSIGNMENT CHARTS
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

