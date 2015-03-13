grammar MyLang;

expr    returns [String result]
        : VARNAME {$result = (new Chart($VARNAME.text)).toString();}
        ;




CHARTS  : 'pie'
        | 'line'
        ;

VARNAME : [a-zA-z]+;

NUM     : DIGIT+ ;
fragment DIGIT : [0-9] ;

ASSIGNMENT : ':=';