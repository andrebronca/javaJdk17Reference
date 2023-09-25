package com.capitulo03;

/**
 * 005
 * @author andre
 */
public class CharDemo2 {
  public static void main(String[] args) {
    char ch1;
    ch1 = 'X';
    
    System.out.println("ch1 contains "+ ch1);
    
    ch1++;
    System.out.println("ch1 is now "+ ch1);
    
    System.out.println(Character.valueOf('A'));
    System.out.println(Character.toChars(88));
    
    char octal = '\141';
    System.out.println(octal);
    
    char hexadecimal = '\u0061';
    System.out.println(hexadecimal);
    
    char japan = '\ua432';
    System.out.println(japan);
    
    System.out.println("teste\scom\sespaço");
  }
}
