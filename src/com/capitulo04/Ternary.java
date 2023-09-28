package com.capitulo04;

/**
 * 012
 * @author andre
 */
public class Ternary {
  public static void main(String[] args) {
    int i, k;
    i = 10;
    k = i < 10 ? -i : i;
    System.out.print("Absolute value of ");
    System.out.println(i +" is "+ k);
    
    i = -10;
    k = i < 10 ? -i : i;
    System.out.print("Absolute value of ");
    System.out.println(i +" is "+ k);
  }
}
