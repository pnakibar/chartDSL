grammar MyLang;

@header {
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
}

expr returns [String filename]
        :getname SHOWAS getShowAs TWP getdata /*invoke Save.save*/{$getShowAs.result.save($getname.result, ($getdata.result).createChart($getname.result));$filename = $getname.result+"."+$getShowAs.result.getFormat();}
        ;

getShowAs returns [Save result]
        :PNG showAsPNG {$result = $showAsPNG.result;}
        |JPEG showAsJPEG {$result = $showAsJPEG.result;}
        |WINDOW showAsWindow {$result = $showAsWindow.result;}
        ;
showAsWindow returns [Save result]
        :LPAR height=NUM X width=NUM RPAR {$result = new SaveWindow($height.text, $width.text);}
        ;
showAsPNG returns [Save result]
        :LPAR height=NUM X width=NUM RPAR {$result = new SavePNG($height.text, $width.text);}
        ;
showAsJPEG returns [Save result]
        :LPAR height=NUM X width=NUM RPAR {$result = new SaveJPEG($height.text, $width.text);}
        ;

getname returns [String result]
        :VARNAME TWP {$result = $VARNAME.text;}
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
            column=VARNAME TWP value=(DOUBLE | NUM) {data.add($column.text, $value.text);}
            (COMMA column=VARNAME TWP value=(DOUBLE | NUM) {data.add($column.text, $value.text);})*
        RBR {$result = data;}
    ;

chartdata returns [Data result]
@init   {
        Data data = DataFactory.fabricate("chart");
        }
    :
        LBR
            column=VARNAME TWP line=VARNAME TWP value=(DOUBLE | NUM) {data.add($column.text, $line.text, $value.text);}
            (COMMA column=VARNAME TWP line=VARNAME TWP value=(DOUBLE | NUM) {data.add($column.text, $line.text, $value.text);})*
            CRUNCH domainLabel=VARNAME   {data.add("domainLabel", $domainLabel.text);}
            CRUNCH rangeLabel =VARNAME   {data.add("rangeLabel", $rangeLabel.text);}
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
X : 'x';
CRUNCH : '#';
DOT : '.';

SHOWAS : 'show as';
WINDOW  : 'window';
JPEG     : 'jpeg';
PNG     : 'png';


fragment DIGIT : [0-9] ;
fragment ALPHA : [_a-zA-Z] ;
NUM     : DIGIT+ ;

DOUBLE  :NUM DOT NUM;


VARNAME : ALPHA+;

ASSIGNMENT : ':=';

WS      : [ \n]+ -> skip ;