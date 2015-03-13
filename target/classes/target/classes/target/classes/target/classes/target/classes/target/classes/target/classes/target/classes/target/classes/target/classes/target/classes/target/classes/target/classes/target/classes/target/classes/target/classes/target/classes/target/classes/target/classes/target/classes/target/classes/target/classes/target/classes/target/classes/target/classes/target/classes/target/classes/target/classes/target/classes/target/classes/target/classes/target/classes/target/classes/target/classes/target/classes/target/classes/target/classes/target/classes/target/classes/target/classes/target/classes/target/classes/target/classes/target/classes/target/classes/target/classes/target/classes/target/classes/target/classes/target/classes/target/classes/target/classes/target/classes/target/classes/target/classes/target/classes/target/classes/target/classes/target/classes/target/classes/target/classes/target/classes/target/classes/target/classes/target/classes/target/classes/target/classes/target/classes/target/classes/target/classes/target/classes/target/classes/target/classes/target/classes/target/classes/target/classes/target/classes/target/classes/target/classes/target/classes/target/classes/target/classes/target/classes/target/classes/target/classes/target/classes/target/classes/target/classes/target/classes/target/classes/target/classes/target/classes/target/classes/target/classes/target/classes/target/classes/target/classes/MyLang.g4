grammar MyLang;

@header {
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFactory;
}
sttmnt returns [Chart result]
        : CHARTS {$result = new Chart;}
        ;
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