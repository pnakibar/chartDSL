grammar MyLang;

@header {
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFactory;
}
expr returns [Data result]
        @init {
               Data data = new Data();
        }
        : VARNAME ASSIGNMENT NUM ASSIGNMENTEND {data.add($VARNAME.text, $NUM.text);System.out.printf(data.get($VARNAME.text));}
        | END {$result = data;}
        ;

CHARTS  : 'pie'
        | 'line'
        ;
ASSIGNMENTEND : ';';
END : 'end';
VARNAME : [a-zA-z]+;

NUM     : DIGIT+ ;
fragment DIGIT : [0-9] ;

ASSIGNMENT : ':=';
WS      : [ \t\r\n]+ -> skip ;