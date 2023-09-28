package com.capitulo04;

/**
 * 004
 * @author andre
 */
public class IncDec {
  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int c;
    int d;
    System.out.println("a = "+ a);
    System.out.println("b = "+ b);
    c = ++b;
    System.out.println("c = ++b -> "+ c);
    System.out.println("++b = "+ b);
    d = a++;
    System.out.println("d = a++ -> "+ d);
    System.out.println("a++ = "+ a);
    c++;
    System.out.println("c++ = "+ c);
  }
}
