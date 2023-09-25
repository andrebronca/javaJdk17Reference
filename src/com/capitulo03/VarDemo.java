package com.capitulo03;

/**
 * 018
 *
 * @author userAdm a simple demonstration of local variable type inference.
 */
public class VarDemo {

    public static void main(String[] args) {

        //variable name avg, in this case, double is infered
        var avg = 10.0;
        System.out.println("Value of avg: " + avg);

        //It is simply a user-defined variable name.
        int var = 1;
        System.out.println("Value of var: " + var);

        //var is used as both the type of the declaration and as
        //a variable name in the initializer
        var k = -var;
        System.out.println("Value of k: " + k);

        var myArray = new int[10];  //this is valid
//        var[] myArray2 = new int[10];   //errado
//        var myArray[] = new int[10];    //errado
//        var myArray3 = {1, 2, 3};   //errado, não pode inicializar array com elementos
//        var n = null;   //errado, não aceita null
//        var a, b = 1;   //errado, somente uma por vez

//        var counter;    //errado, requer inicialização
    }
}
