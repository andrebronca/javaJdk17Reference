package com.capitulo02;

/**
 * 004
 * @author andre
 */
public class ForTest {
  public static void main(String[] args) {
    int x;
    
    for(x = 0; x < 5; x = x + 1) System.out.println("This is x: "+ x);
    System.out.println("----------------");
    
    //outra forma
    for(int j = 1; j <= 5; j += 1)
      System.out.println("j = "+ j);
    System.out.println("----------------");
    
    for(int i = 0; i < 5; i++){
      System.out.println("i = "+ i);
    }
    System.out.println("----------------");
    
    for(int i = 5; i > 0; i--){
      System.out.println("i = "+ i);
    }
  }
}

/*
  Instrução de loop: for
  Permite realizar tarefas repetidamente.
  for(initialization; condition; iteration) statement;

  Linha 9: declara uma variável x do tipo int, mas não a inicializa
  Linha 11: loop for utiliza a variável x e a inicializa com 0 (zero)
    x é a variável de controle do loop for, se o valor for menor que 5 então a instrução
    será executada, após a execução o valor é incrementado. Verifica-se novamente se o valor
    de x < 5 retorna true, se sim, executa a instrução e incrementa o valor de x. Repete-se esse
    processo até que x < 5 seja false, passando a execução para a linha posterior ao loop for.

  Linha 15: declara e inicializa uma variável do tipo int. A instrução (statement) está declarada n   a linha de baixo da estrutura do loop for.

  Linha 19: Exemplo do uso de chaves na declaração do escopo do loop for. Chaves {} são obrigatória   s quando há mais de uma linha no corpo do loop for.

  Linha 12, 17 e 22: servem apenas para fazer uma sepração visual

  Linha 11, 15, 19: observe a forma de incremento, a mais tradicional é da linha 19. Porém, pode-se   aumentar o valor do incremento, saltando posições conforme o exemplo da linha 15.
   Exemplo, pular uma iteração: j += 2. Se j = 0, exibe: 0, 2, 4, ...
   se j = 1, exibe: 1, 3, 5, ...


  Linha 19: x++ é o mais utilizado, raramente é usado o exemplo de incremento da linha 11.
  Linha 24: i-- é a forma de fazer o decremento

*/