package com.capitulo02;

/**
 * 003
 * @author andre
 */
public class IfExample {
  public static void main(String[] args) {
    int x, y;
    x = 10;
    y = 20;
    
    if(x < y) System.out.println("x is less than y");
    
    x = x * 2;
    if(x == y) System.out.println("x now equal to y");
    
    x *= 2;
    if(x > y)
      System.out.println("x now greater than y");
    
    //this won't display anything
    if(x == y){
      System.out.println("You won't see this!");
    }
  }
}

/*
  Linha 9: declaração de duas variáveis do tipo int
  Linha 13: uso da instrução de seleção: if
  Linha 18: é a mesma coisa que a linha 15
  Linha 16: por ter apenas uma instrução no if, pode ser na mesma linha e sem o uso de {}
  Linha 23: exemplo do if com o uso de chaves
  Linha 19: exemplo do if com a instrução na linha abaixo

  preferência pessoal: legibilidade: linha 23.

  Identificadores: utilizados para nomear classes, variáveis e métodos
    Não podem iniciar com: número
    Não podem conter caracteres especiais: - , / ; * ç 
    Não podem ser iguais a palavras reservadas
  
  Exemplo de identificadores válidos:
    AvgTemp, count, a4, $test, this_is_ok

  Exemplo de identificadores inválidos:
    2count, high-temp, Not/ok

  Literais: são valores atribuídos aos identificadores (variáveis)
    Linha 10 e 11: x = 10, y = 20. 10 e 20 são valores literais, considerados constantes.
    Apesar de ser uma constante, ocorreu a alteração do valor na linha 15 e 18.

100: literal do tipo int
98.6: literal do tipo double
'x': literal do tipo char
"This is literal": literal do tipo String

Se um literal não for alterado é como se fosse uma constante. Para especificar que é uma
constante e não pode ser alterado, faz-se o uso da palavra reservada: final
ex. 
  final int X = 10;
  final String MES_01 = "Janeiro";
É obrigatório atribuir um valor para uma variável que será uma constante. Uma recomendação é que o identificador seja escrito em maiúsculo.

Comentários: há três tipos: Como estou dentro de um comentário, não irei inserir os caracteres
  a) de linha: inicia com: barra barra
  b) multi-linha:  inicia com barra aterisco e termina com asterisco barra
  c) comentário de documentação: inicia com barra asterisco asterisco e termina com asterisco barra
*/

// a)

/*
 b)
*/

/**
 * c)
 */

/*
Separadores:
() uado em métodos, listas de valores, definir precedência em expressões, expressões de controle
    de declarações, conversão de tipos.
{} valores para automaticamente inicializar array, definir bloco de código, para classes, métodos    e escopos locais.
[] declarar tipos de arrays e também para refereciar valores de arrays.
; termina instruções.
, separa identificadores consecutivos em declaração de variáveis. Também usado para encadear instruções dentro de um loop for.
. usado para separar nomes de pacotes, e também para separar variável ou método de uma variável de instância.
:: usado para criar um método ou referência a construtor.
... indica um parâmetro variável
@ inicia uma anotação, muito usado por frameworks

Java Keywords: palavras chaves (reservadas). Há atualmente (jdk 17) 67 keywords.
  Combinadas com operadores e separadores forma a base da linguagem Java.

Biblioteca Java: class libraries
  System.out.println()
  System.out.print()
  String
  São classes e métodos automaticamente importados pelo Java para lidar com diversos recusos.
*/