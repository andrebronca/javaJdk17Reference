package com.capitulo05;

/**
 * 008
 * @author andre
 */
public class DoWhile {
  public static void main(String[] args) {
    int n = 10, m = 10;
    
    do {
      System.out.println("tick "+ n--);
    } while(n > 0);
    
    System.out.println();
    
    //outra forma de escrita
    do {
      System.out.println("tick "+ m);
    } while(--m > 0);
  }
}
