package com.capitulo03;

/**
 * 011
 * @author userAdm
 */
public class Promote {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50_000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        
        System.out.println("promoção de tipos:");
        System.out.println("\sfloat\t\tint\t\tdouble\t=\sdouble");
        System.out.print("("+f +" * "+ b +") + ");
        System.out.print("("+ i +" / "+ c +") - ");
        System.out.println("("+ d +" * "+ s +")");
        System.out.println((f * b) +" + "+ (i / c) +" - "+ (d * s));
        System.out.println("result = "+ result);
    }
}
