package com.capitulo04;

/**
 * 001
 * @author userAdm
 */
public class BasicMath {
    public static void main(String[] args) {
        System.out.println("Integer Arithmetic");
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.println("a:(1 + 1) = "+ a);
        System.out.println("b:(a * 3) = "+ b);
        System.out.println("c:(b / 4) = "+ c);
        System.out.println("d:(c - a) = "+ d);
        System.out.println("e:(-d) = "+ e);
        
        //arithmetic using doubles
        System.out.println("\nFloating Point Arithmetic");
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;
        System.out.println("da:(1 + 1) = "+ da);
        System.out.println("db:(da * 3) = "+ db);
        System.out.println("dc:(db / 4) = "+ dc);
        System.out.println("dd:(dc - a) = "+ dd);
        System.out.println("de:(-dd) = "+ de);
    }
}
