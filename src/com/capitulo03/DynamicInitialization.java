package com.capitulo03;

/**
 * 007
 * @author andre
 */
public class DynamicInitialization {
  public static void main(String[] args) {
    //inicialização com constante literal
    double a = 3.0, b = 4.0;
    
    //c is dynamic initialized
    double c = Math.sqrt(a * a + b * b);
    
    System.out.println("Hyponenuse is "+ c);
  }
}
