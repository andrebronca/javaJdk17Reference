package com.capitulo04;

/**
 * 003
 * @author andre
 */
public class OpEquals {
  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int c = 3;
    
    System.out.println("a = "+ a);
    System.out.println("b = "+ a);
    System.out.println("c = "+ a);
    
    a += 5;
    System.out.println("a += 5 -> "+ a);
    b *= 4;
    System.out.println("b *= 4 -> "+ b);
    c += a * b;
    System.out.println("c += a * b -> "+ c);
    c %= 6;
    System.out.println("c %= 6 -> "+ c);
  }
}
