package com.capitulo03;

/**
 * 008
 * @author andre
 */
public class Scope {
  public static void main(String[] args) {
    int x;  //conhecido para todo o código dentro de main()
    
    x = 10;
    if(x == 10){  //inicia um novo escopo
      int y = 20; //conhecido somente dentro desse bloco
      
      //x and y são conhecidos aqui
      System.out.println("x and y: "+ x +" "+ y);
      x = y * 2;
    }
    
    //y = 100;  //Error! y não é conhecido aqui
    
    //x é ainda conhecido aqui
    System.out.println("x is "+ x);
  }
}
