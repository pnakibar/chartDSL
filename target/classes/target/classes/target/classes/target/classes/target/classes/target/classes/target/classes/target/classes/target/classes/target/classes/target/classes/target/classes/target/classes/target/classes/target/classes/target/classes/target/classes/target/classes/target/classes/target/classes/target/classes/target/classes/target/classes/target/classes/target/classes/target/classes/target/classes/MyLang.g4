grammar MyLang;

@header {
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
}

expr returns [JFreeChart result]
        :getname getdata {$result = ($getdata.result).createChart($getname.name);}
        ;

getname returns [String name]
        :VARNAME TWP {$name = $VARNAME.text;}
        ;

getdata returns [Data result]
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

WINDOW  : 'window';
JPG     : 'jpg';
PNG     : 'png';


fragment DIGIT : [0-9] ;
fragment ALPHA : [_a-zA-Z] ;
NUM     : DIGIT+ ;
VARNAME : ALPHA+;

ASSIGNMENT : ':=';

WS      : [ \n]+ -> skip ;