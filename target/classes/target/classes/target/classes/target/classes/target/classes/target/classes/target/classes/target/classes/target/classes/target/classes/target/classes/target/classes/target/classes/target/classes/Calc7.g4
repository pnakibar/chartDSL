grammar Calc7;

@header {
import java.util.List;
import java.util.LinkedList;
}

prog returns [BlockExpr result]
@init {
       List<Expr> exprList = new LinkedList<Expr>();
      }
    : s1=sttmt      {if ($s1.result != null) exprList.add($s1.result);}
      (NL s1=sttmt  {if ($s1.result != null) exprList.add($s1.result);})*
      {$result = new BlockExpr(exprList);}
    ;

sttmt returns [Expr result]
    : /* empty */   {$result = null;}
    | e=expr        {$result = $e.result;}
    | a=assign      {$result = $a.result;}
    | i=ifSttmt     {$result = $i.result;}
    | w=whileSttmt  {$result = $w.result;}
    | f=funcDef     {$result = $f.result;}
    ;

expr returns [Expr result]
    : e1=expr1  {$result = $e1.result;}
      (
        (PLUS e2=expr1      {$result = new ApplyExpr(Operator.PLUS, $result, $e2.result);})
        | (MINUS e2=expr1   {$result = new ApplyExpr(Operator.MINUS, $result, $e2.result);})
      )*
    ;

expr1 returns [Expr result]
    : e1=expr2  {$result = $e1.result;}
      (
        (TIMES e2=expr2     {$result = new ApplyExpr(Operator.TIMES, $result, $e2.result);} )
        | (DIV e2=expr2     {$result = new ApplyExpr(Operator.DIV, $result, $e2.result);} )
      )*
    ;

expr2 returns [Expr result]
    : NUM               {$result = new Numeric($NUM.text);}
    | ID                {$result = new Variable($ID.text);}
    | f=funCall         {$result = $f.result;}
    | MINUS e2=expr2    {$result = new ApplyExpr(Operator.UMINUS, $e2.result);}
    | NOT e2=expr2      {$result = new ApplyExpr(Operator.NOT, $e2.result);}
    | LPAR e=expr RPAR  {$result = $e.result;}
    ;

funCall returns [FunCall result]
    : ID LPAR a=argList RPAR    {$result = new FunCall($ID.text, $a.args);}
    ;

argList returns [List<Expr> args]
@init {
    $args = new LinkedList<Expr>();
}
    : /* empty */
    | e=expr        {$args.add($e.result);}
      (COMMA e=expr {$args.add($e.result);})*
    ;

assign returns [AssignExpr result]
    : ID GETS e=expr     {$result = new AssignExpr($ID.text, $e.result);}
    ;

ifSttmt returns [IfExpr result]
    : IF c=bexpr THEN NL? t=sttmtSeq NL? ELSE NL? e=sttmtSeq NL? END
      {$result = new IfExpr($c.result, $t.result, $e.result);}
    ;

whileSttmt returns [WhileExpr result]
    : WHILE c=bexpr DO NL? d=sttmtSeq NL? END
      {$result = new WhileExpr($c.result, $d.result);}
    ;

sttmtSeq returns [BlockExpr result]
@init {
       List<Expr> exprList = new LinkedList<>();
      }
    : s1=sttmt      {if ($s1.result != null) exprList.add($s1.result);}
      (NL s1=sttmt  {if ($s1.result != null) exprList.add($s1.result);})*
      {$result = new BlockExpr(exprList);}
    ;

bexpr returns [Expr result]
    : b1=bexpr1         {$result = $b1.result;}
      (OR b2=bexpr1     {$result = new ApplyExpr(Operator.OR, $result, $b2.result);})*
    ;

bexpr1 returns [Expr result]
    : b1=bexpr2         {$result = $b1.result;}
      (AND b2=bexpr2    {$result = new ApplyExpr(Operator.AND, $result, $b2.result);})*
    ;

bexpr2 returns [Expr result]
    : b1=bexpr3             {$result = $b1.result;}
      (o=relOp b2=bexpr3    {$result = new ApplyExpr($o.op, $result, $b2.result);})?
    ;

bexpr3 returns [Expr result]
    : e=expr                {$result = $e.result;}
    | LPAR b=bexpr RPAR     {$result = $b.result;}
    ;

relOp returns [Operator op]
    : EQ    {$op = Operator.EQ;}
    | LT    {$op = Operator.LT;}
    | GT    {$op = Operator.GT;}
    | NEQ   {$op = Operator.NEQ;}
    | LEQ   {$op = Operator.LEQ;}
    | GEQ   {$op = Operator.GEQ;}
    ;

funcDef returns [FunctionDef result]
    : DEF ID LPAR p=paramList RPAR NL? b=sttmtSeq NL? END
      {
       UserFunction f = new UserFunction($p.params, $b.result);
       $result = new FunctionDef($ID.text, f);
      }
    ;

paramList returns [List<String> params]
@init {
    $params = new LinkedList<>();
}
    : p1=ID         {$params.add($p1.text);}
      (COMMA p2=ID  {$params.add($p2.text);})*
    ;

PLUS    : '+' ;
MINUS   : '-' ;
TIMES   : '*' ;
DIV     : '/' ;
GETS    : '=' ;
LPAR    : '(' ;
RPAR    : ')' ;
COMMA   : ',' ;
DEF     : 'def' ;
IF      : 'if' ;
THEN    : 'then' ;
ELSE    : 'else' ;
WHILE   : 'while' ;
DO      : 'do' ;
END     : 'end' ;
NOT     : 'not' ;
AND     : 'and' ;
OR      : 'or' ;
EQ      : '==' ;
LT      : '<' ;
GT      : '>' ;
NEQ     : '!=' ;
LEQ     : '<=' ;
GEQ     : '>=' ;

NUM     : DIGIT+ ;

fragment DIGIT : [0-9] ;

ID      : ALPHA (ALPHA | DIGIT)* ;

fragment ALPHA : [_a-zA-Z] ;

NL  : '\r'? '\n' ;

WS  : [ \t]+ -> skip;