package com.capitulo05;

/**
 * 009
 * @author andre
 */
public class Menu {
  public static void main(String[] args) throws java.io.IOException {
    char choice;
    
    do {
      System.out.println("Help on: ");
      System.out.println("\t 1) if");
      System.out.println("\t 2) switch");
      System.out.println("\t 3) while");
      System.out.println("\t 4) do-while");
      System.out.println("\t 5) for\n");
      System.out.print("Choose one: ");
      choice = (char) System.in.read();
    } while(choice < '1' || choice > '5');
    
    System.out.println();
    
    switch (choice) {
      case '1':
        System.out.println("The if:\n");
        System.out.println("if(condition) statement;");
        System.out.println("else statement;");
        break;
      case '2':
        System.out.println("The switch:\n");
        System.out.println("switch(expression){");
        System.out.println("\t case constant:");
        System.out.println("\t\t statement sequence;");
        System.out.println("\t\t break;");
        System.out.println("\t\t //...");
        System.out.println("}");
        break;
      case '3':
        System.out.println("The while:\n");
        System.out.println("while(condition) statement;");
        break;
      case '4':
        System.out.println("The do-while:\n");
        System.out.println("do {");
        System.out.println("\t statement;");
        System.out.println("} while(condition);");
        break;
      case '5':
        System.out.println("The for:\n");
        System.out.println("for(init; condition; iteration)");
        System.out.println("\t statement;");
        break;
      default:
        throw new AssertionError();
    }
    
    System.out.println();
  }
}
