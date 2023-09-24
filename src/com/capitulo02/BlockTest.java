package com.capitulo02;

/**
 * 005
 * @author andre
 */
public class BlockTest {
  public static void main(String[] args) {
    int x, y;
    y = 20;
    
    for(x = 0; x < 5; x++){
      System.out.println("This is x: "+ x);
      System.out.println("This is y: "+ y);
      y -= 2;
    }
  }
}

/*
  Linha 12: for tem a abertura de bloco (escopo) {. Terminando na linha 16 }. Tudo o que estiver
entre {} no loop for, faz parte do bloco (escopo), tornando-se uma unidade lógica. Significa que ao executar a instrução (statement) da linha 13, também será executada a statement da linha 14 e 15.

{}: Então o uso de chaves, transforma o que estiver dentro em uma unidade lógica de código inseparável. Pode ser chamada de bloco de código.

Linha 15: é o mesmo que: y = y - 2
  porém a forma abreviada significa que seu entendimento avançou.
*/