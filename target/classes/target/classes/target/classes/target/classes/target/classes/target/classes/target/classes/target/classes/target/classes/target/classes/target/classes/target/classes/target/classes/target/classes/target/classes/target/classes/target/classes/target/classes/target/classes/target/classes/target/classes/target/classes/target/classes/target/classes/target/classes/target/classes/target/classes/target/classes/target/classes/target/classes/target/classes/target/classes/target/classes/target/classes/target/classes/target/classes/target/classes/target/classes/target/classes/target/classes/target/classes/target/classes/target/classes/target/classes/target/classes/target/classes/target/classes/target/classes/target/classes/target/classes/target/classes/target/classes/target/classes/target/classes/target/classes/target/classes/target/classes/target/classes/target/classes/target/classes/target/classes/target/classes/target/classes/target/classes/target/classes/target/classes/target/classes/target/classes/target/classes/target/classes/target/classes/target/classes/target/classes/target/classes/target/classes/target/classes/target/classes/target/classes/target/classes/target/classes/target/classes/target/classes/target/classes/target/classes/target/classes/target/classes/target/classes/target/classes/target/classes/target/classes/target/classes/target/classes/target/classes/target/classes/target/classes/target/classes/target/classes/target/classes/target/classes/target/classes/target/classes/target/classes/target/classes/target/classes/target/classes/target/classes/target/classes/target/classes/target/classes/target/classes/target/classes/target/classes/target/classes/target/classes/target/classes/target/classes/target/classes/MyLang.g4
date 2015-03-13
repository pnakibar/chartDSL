grammar MyLang;

expr    returns [String result]
        : VARNAME {$result = new Chart($VARNAME.text);}
        ;




CHARTS  : 'pie'
        | 'line'
        ;

VARNAME : [a-zA-z]+;

ASSIGNMENT : ':=';