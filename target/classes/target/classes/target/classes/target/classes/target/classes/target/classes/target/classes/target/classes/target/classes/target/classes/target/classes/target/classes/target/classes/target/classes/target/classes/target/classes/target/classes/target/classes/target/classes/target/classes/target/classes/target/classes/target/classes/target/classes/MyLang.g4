grammar MyLang;

@header {
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFactory;
}
expr returns [Data result]
        :r = adddata {$result = $r.result;}
        ;


adddata returns [Data result]
        : PIE piedata {$result = $piedata.result;}
        | CHART chartdata {$result = $chartdata.result;}
        ;

piedata returns [Data result]
@init   {
        Data data = DataFactory.fabricate("pie");
        }
    :
        LBR
            column=VARNAME TWP value=NUM {data.add($column.text, $value.text);}
            (COMMA column=VARNAME TWP value=NUM {data.add($column.text, $value.text);})*
        RBR {$result = data;}
    ;

chartdata returns [Data result]
@init   {
        Data data = DataFactory.fabricate("chart");
        }
    :
        LBR
            column=VARNAME TWP line=ID TWP value=NUM {data.add($column.text, $line.text, $value.text);}
            (COMMA column=ID TWP line=ID TWP value=NUM {data.add($column.text, $line.text, $value.text);})*
        RBR {$result = data;}
    ;


PIE : 'pie';
CHART : 'chart';
COMMA   : ',';
DOTCOMMA : ';';
END : 'end';
LPAR    : '(' ;
RPAR    : ')' ;
LBR     : '{';
RBR     : '}';
TWP     : ':';


fragment DIGIT : [0-9] ;
fragment ALPHA : [_a-zA-Z] ;
NUM     : DIGIT+ ;
VARNAME : ALPHA+;
ID      : ALPHA (ALPHA | DIGIT)* ;

ASSIGNMENT : ':=';

WS      : [ \n]+ -> skip ;