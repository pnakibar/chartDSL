grammar MyLang;

@header {
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFactory;
}
expr returns [Data result]
        :r = adddata {$result = $r.result;}
        ;


adddata returns [Data result]
        : piedata {$result = $piedata.result;}
        /*|CHART chartdata {$result = chartdata.result;}*/
        ;

piedata returns [Data result]
@init   {
        Data data = DataFactory.fabricate("pie");
        }
    :
        PIE LBR
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
            column=VARNAME TWP line=VARNAME TWP value=NUM {data.add($column.text, $line.text, $value.text);}
            (COMMA column=VARNAME TWP line=VARNAME TWP value=NUM {data.add($column.text, $line.text, $value.text);})*
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

VARNAME : [a-zA-z]+;

NUM     : DIGIT+ ;
fragment DIGIT : [0-9] ;

ASSIGNMENT : ':=';
WS      : [ \n]+ -> skip ;