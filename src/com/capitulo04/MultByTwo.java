package com.capitulo04;

/**
 * 007
 * @author andre
 */
public class MultByTwo {
  public static void main(String[] args) {
    int i;
    int num = 0xffffffe;
    
    for(i = 0; i < 4; i++){
      num = num << 1;
      System.out.println(num);
    }
  }
}
