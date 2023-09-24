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
    System.out.print("Exibindo \"outra\" mensagem\nno terminal com o uso de quebra de linha(\\\")\n");
  }
}


/* Detalhes gerais
Linha 1: identifica o path (caminho) do pacote da classe.
Deve ser a primira instrução java a ser executada.

Linha 3 a 7: comentário do tipo javadoc, de múltiplas linhas.

Linha 8: Inicia o código da classe e termina na linha 14.
Linha 9: Comentário de linha ou final de linha.
Linha 10: método principal, é como se fosse uma função. Todo programa Java possui pelo menos um método main() em uma classe para executar. Mas nem toda classe precisa ter um método main().
Linha 11: método println() para exibir mensagens de texto no terminal de comando (prompt)
prompt = iniciar
Linha 17: Inicia um comentário multi linha.
*/
    
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
  System.out.println() : é o método completo
  System.out.println("oi") : exibe a mensagem no terminal: oi

  Linhas de instruções, terminam com: ;
  Linha(s): 1, 11

  Início de escopo de classe ou método não possui ';' no fechamento.
*/

/* Detalhes mais técnicos
Java diferencia maiúsculo de minúsculo, então dependendo da palavra a ser digitada pode ocorrer erro na compilação uo na execução.
public: modificador de acesso, permite acesso de fora da classe.
Example: identificador, deve iniciar com letra maiúscula
main(): método de execução
private: é o oposto de public, só permite acesso de dentro da classe
static: permite chamar um método sem instanciar um objeto, para o main() é necessário, pois a JVM irá chamá-lo.
voi: avisa o compilador que main() não retorna valor.
args: parâmetros do método main()
String[] args: array de instâncias da classe String.
Arrays: são coleções de objetos similares.
String: objetos do tipo String permitem armazenar cadeia de caracteres.
args: é utilizado para permitir entrada de argumentos via linha de comando quando o método main() é executado. Essa classe não requer o uso de argumento.
{}: usado para inserir código em classes e métodos
; : termina uma instrução
() : usado em métodos para informar se há ou não parâmetros
System.out.println() : é utilizado para E/S (Entrada/Saída) de dados no console (terminal/prompt). Há situações específicas que requer esse tipo de programação. 
println : ln significa (new line), print (imprima)
Linha 12: foi adicionada para demonstrar como pode ser incluído quebra de linha, com o uso do recurso de caracteres de escape. Observe que o nome do método de println passou a ser print. E a quebra de linha foi realizada com: \n
Exibir \ : para exibir uma barra, usa-se o caractere de escape \\
Exibindo àspas dentro de àspas: faz-se o uso de caracteres de escape como: \"

palavras reservadas: são palavras utilizadas na sintaxe (regra de codificação do Java), não podem ser utilizadas como identificadores de variáveis, classes ou métodos. Exemplo de palavras reservadas nessa classe:
  public, class, package, static, void, String

String: inicia com letra maiúscula, indicando que é uma classe. A instanciação de objetos do tipo String pode ser feita litealmente ou automaticamente (esta é mais utilizada).
*/
 