package com.capitulo03;

/**
 * 012
 * @author userAdm
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] month_days;
        month_days = new int[12];
        month_days[0] = 31; //janeiro
        month_days[1] = 28; //exceto para ano bissexto que tem 29 dias
        month_days[2] = 31; //março
        month_days[3] = 30; //abril
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;    //dezembro
        
        System.out.println("Abril has "+ month_days[3] +" days");
        
        //int[] month_days = new int[12];
        
        //inicialização de array
        int[] meses_dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Dezembro tem "+ meses_dias[11] +" dias.");
    }
}
