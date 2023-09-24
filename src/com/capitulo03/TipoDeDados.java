package com.capitulo03;

/**
 * 001
 * @author andre
 */
public class TipoDeDados {
  public static void main(String[] args) {
    /*
    Tipos inteiros primitivos: byte, short, int, long
    */
    
    //demonstrar os limites do byte
    for(int i = 126, j = 1; j < 5; i++, j++){
      System.out.println("i = "+ ((byte) i));
    }
    byte a = 126; //byte tem 8 bits de tamanho = 1 Byte
    System.out.println("Overflow do byte: "+ (byte)(a + 5));
    
    byte b;
    b = (byte)128 + 127;
    System.out.println("Overflow do byte: "+ b);
    System.out.println(Byte.MIN_VALUE +", "+ Byte.MAX_VALUE);
    System.out.println("-----------------------------");
    
    short s = -32768; //short tem 16 bits = 2 Bytes
    System.out.println("Overflow do short: "+ (short)(s - 1));
    System.out.println(Short.MIN_VALUE +", "+ Short.MAX_VALUE);
    System.out.println("-----------------------------");
    
    int i = 2147483647; //int tem 32 bits = 4 Bytes
    System.out.println("Overflow do int: "+ (i + 1));
    System.out.println(Integer.MIN_VALUE +", "+ Integer.MAX_VALUE);
    System.out.println("-----------------------------");
    
    long l = 9223372036854775807L;  //long tem 64 bits = 8 Bytes
    System.out.println("Overflow do long: "+ (long)(l + 1));
    System.out.println(Long.MIN_VALUE +", "+ Long.MAX_VALUE);
    System.out.println("-----------------------------");
  }
}
