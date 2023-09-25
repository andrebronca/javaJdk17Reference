package com.capitulo03;

/**
 * 009
 * @author andre
 */
public class LifeTime {
  public static void main(String[] args) {
    int x;
    
    for(x = 0; x < 3; x++){
      int y = -1; //y é inicializada cada vez que o bloco é executado
      System.out.println("y is: "+ y);
      y = 100;  //esse valor será perdido na inicialização do bloco
      System.out.println("y is now: "+ y);
    }
  }
}
