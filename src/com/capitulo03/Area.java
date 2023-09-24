package com.capitulo03;

/**
 * 003
 * @author andre
 */
public class Area {
  public static void main(String[] args) {
    double pi, r, a;
    r = 10.8;
    pi = Math.PI;
    a = pi * r * r;
    
    System.out.print("PI = "+ Math.PI);
    System.out.println("\nArea of circle is: "+ a);
    
    a = 3.14 * r * r;
    System.out.println("pi = 3.14\nArea of circle is: "+ a);
    
    a = 3.1415 * r * r;
    System.out.println("pi = 3.1415\nArea of circle is: "+ a);
  }
}
