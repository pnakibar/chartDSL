#Grafik 
Linguagem de geração de gráficos!

#Exemplos
* Utilizando png para salvar
```
PaisesPorArea:
show as png(666x666):
pie{
   Russia:27.3,
   Canada:15,
   China:15.4,
   EUA:15.4,
   Australia:12.3,
   Brazil:13.6
}
```
![](https://github.com/pnakibar/chartDSL/blob/master/exemplos/PaisesPorArea.png?raw=true "")


* Utilizando jpeg
```
vendas:
show as jpeg(666x666):
chart{
    apple:vendas:3,
    microsoft:vendas:4
    #empresa
    #trimestre
}
```
![](https://github.com/pnakibar/chartDSL/blob/master/exemplos/vendas.jpeg?raw=true "")
* Utilizando window para exibir
```
vendas2:
show as window(666x666):
chart{
    apple:vendas:3,
    microsoft:vendas:4
    #empresa
    #trimestre
}
```
![](https://github.com/pnakibar/chartDSL/blob/master/exemplos/vendas2.png?raw=true "")

##template
```
$nomeGrafico:
show as $tipoExibição($altura x $largura):
$tipoDoGrafico{
    $informação
}
```
###Para tipo de de exibição temos:
* window: cria uma janela utilizando java awt exibindo as informações do gráfico;
* png: salva imagem como um arquivo de imagem .png no diretório raiz do projeto, com o nome da tabela;
* jpeg: mesma coisa que o png, só que para o formato jpeg

###Tipo do gráfico e como definir seus dados:
* pie: gráfico do tipo pizza
```
pie{
    nome:dado,
    nome2:dado2,
    nome3:dado3
}
```

* chart: gráfico com linhas
```
chart{
    nome:linha:dado,
    nome2:linha:dado2,
    nome3:linha:dado3,
    nome:linha2:dado4,
    nome2:linha2:dado5,
    nome3:linha2:dado6,
    #nomeDoDominio
    #nomeDaImagem
}
```
#Construindo o projeto:
1. O projeto está no Maven, e possui como dependencias o jfreechart e o próprio antlr.
```maven
<dependencies>
        <dependency>
            <groupId>jfree</groupId>
            <artifactId>jfreechart</artifactId>
            <version>1.0.13</version>
        </dependency>
        <dependency>
            <groupId>org.antlr</groupId>
            <artifactId>antlr4-maven-plugin</artifactId>
            <version>4.5</version>
        </dependency>
</dependencies>
```
2. O projeto já está pré-compilado, mas caso queira gerar os Lexers e os Parsers, é necessário utilizar o antlr4 para compilar o MyLang.g4 utilize o comando abaixo:
```bash
antlr4 MyLang.g4 -o ./gen/ -package gen
```

3. Depois compile os arquivos .java gerados e os arquivos das classes de suporte utilizando o javac:
```bash
javac nomeArquivo.java
```
4. Para ler a sua linguagem execute o programa com o argumento sendo o caminho do arquivo!
```bash
java gen.MyLang -test.gr
```

* Obs.: O Testing.java irá interpretar o arquivo test que está no raiz do projeto
