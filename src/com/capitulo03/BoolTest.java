package com.capitulo03;

/**
 * 006
 * @author andre
 */
public class BoolTest {
  public static void main(String[] args) {
    boolean b;
    b = false;
    System.out.println("b is "+ b);
    b = true;
    System.out.println("b is "+ b);
    b = !b;
    System.out.println("b is "+ b);
    
    if(b)
      System.out.println("This is executede?!");
    else
      System.out.println("No, this is executed!");
    
    b = false;
    if(b)
      System.out.println("This is not executed.");
    
    if(!b)
      System.out.println("Now, this is executed!");
    
    b = true;
    if(b == true)
      System.out.println("This is now == true.");
    
    System.out.println("10 > 9 is "+ (10 > 9));
    
    System.out.println(Boolean.valueOf(b));
  }
}
