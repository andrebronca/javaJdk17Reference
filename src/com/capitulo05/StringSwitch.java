package com.capitulo05;

/**
 * 005
 * @author andre
 */
public class StringSwitch {
  public static void main(String[] args) {
    String str = "two";
    switch (str) {
      case "one":
        System.out.println("um");
        break;
      case "two":
        System.out.println("dois");
        break;
      case "three":
        System.out.println("três");
        break;
      default:
        System.out.println("no match");
        break;
    }
  }
}
