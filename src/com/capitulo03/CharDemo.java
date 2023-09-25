package com.capitulo03;

/**
 * 004
 * @author andre
 */
public class CharDemo {
  public static void main(String[] args) {
    char ch1, ch2;
    ch1 = 88; //code for X
    ch2 = 'Y';
    
    System.out.print("ch1 and ch2: ");
    System.out.println(ch1 +" "+ ch2);
    
    int count = 1;
    String ascii = "";
    for(char i = 33; i < 127; i++){
      ascii += i +" ";
      count++;
      if(count == 31){ 
        count = 1;
        System.out.println(ascii);
        ascii = "";
      }
    }
    
    char A = 65;
    char a = 97;
    boolean charA = A > a;
    System.out.println("A > a = "+ charA);
    
    char B = 'B';
    char b = 'b';
    boolean charB = B > b;
    System.out.println("B > b = "+ charB);
    
  }
}
