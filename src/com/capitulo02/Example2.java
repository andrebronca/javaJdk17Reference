package com.capitulo02;

/**
 * 002
 * @author andre
 */
public class Example2 {
  public static void main(String[] args) {
    int num;
    num = 100;
    System.out.println("This is num: "+ num);
    
    num = num * 2;
    System.out.print("The value of num * 2 is ");
    System.out.println(num);
  }
}

/*
  Linha 9: declaração de uma variável do tipo numérica: int
    identificador da variável: num
  Linha 9: declara uma variável chamada num do tipo int
  Linha 10: inicialização da variável
    para inicializar (atribuir valor) uma variável, utiliza-se apenas um sinal de: =
  Linha 11: concatenando uma String com a variável do tipo int
    Lembre-se: texto + número = texto
  Linha 13: reatribuindo um novo valor para a variável, o valor que já tem será
multiplicado por 2 e armazenado nessa variável (sobrescreve o valor anterior).
  Linha 14: exibe uma String (sem quebra de linha)
  Linha 15: exibe o valor da variável e depois faz uma quebra de linha no console (terminal/prompt)

  Linha 11: println() recebe uma String + int
  Linha 14: print() recebe apenas uma String
  Linha 15: println() recebe apenas um int
  Tanto print() quanto println() recebem qualquer tipo de dado como argumento e realizam a exibição no console (terminal/prompt).

  Concatenar String em Java usa-se o sinal '+', é semelhante ao Javascript, porém em java é obrigatório que a String esteja entre "

  Quando o compilador encontra uma String somando com um outro tipo de valor, esse valor, seja qual for o tipo, será convertido para String. Essa conversão é implícita, realizada pelo compilador.

forma geral da declaração de variável em Java. É obrigatório declarar o tipo da variável antes de utilizá-la.
  type var-name

int : é do tipo integer

Para declarar mais de uma variável do mesmo tipo na mesma linha, usa-se: ,
ex.
int numeroA, numeroB, numeroC;

Não é permitido caracteres especiais para identificadores.
caracteres especiais: ç, é, ã, à, etc.
Por identificadores, entende-se:
- nomes de classes e outros tipos
- nomes de variáveis
- nomes de métodos
*/
