package com.capitulo02;

/**
 * 001
 * Call this file "Example.java"
 * @author andre
 */
public class Example {
   //Your program begins with a call to main()
  public static void main(String[] args) {
    System.out.println("This is a simple Java program.");
  }

  {
/* Detalhes gerais
Linha 1: identifica o path (caminho) do pacote da classe.
Deve ser a primira instrução java a ser executada.

Linha 3 a 7: comentário do tipo javadoc, de múltiplas linhas.

Linha 8: Inicia o código da classe e termina na linha 13.
Linha 9: Comentário de linha ou final de linha.
Linha 10: método principal, é como se fosse uma função. Todo programa Java possui pelo menos um método main() em uma classe para executar. Mas nem toda classe precisa ter um método main().
Linha 11: método println() para exibir mensagens de texto no terminal de comando (prompt)
prompt = iniciar
Linha 15: Inicia um comentário multi linha.
*/
  }
    
/* Detalhes específicos
Linha 8: 
  public: significa que a classe pode ser vista por qualquer outra classe java dentro desse projeto ou até mesmo fora.
  class: Identifica o arquivo como do tipo class. Significa que poderá ser instanciado.
  Example: O nome do arquivo class, e por ser public deve ser também o nome do arquivo com a extenção .java
  {: chave. inicia o escopo da classe
  
Linha 10:
  main(): todo método main deve ser escrito como está na linha 10:
  public: pode ser acessado de fora da classe.
  static: não precisa de instanciação
  void: não retorna nada
  main: nome do método
  String[] args: array de strings, nome da variável: args
  { : inicia o escopo da classe
  
Linha 11:
  System: nome de uma classe que não precisa ser instanciada
  out: propriedade estática da classe System
  println() um método da classe out que está dentro da classe System.
  "": àspas, delimita uma string
*/
  
}