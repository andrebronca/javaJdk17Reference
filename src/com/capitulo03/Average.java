package com.capitulo03;

/**
 * 013
 * @author userAdm
 */
public class Average {
    public static void main(String[] args) {
        double[] nums = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        double average = 0; //média
        for(int i = 0; i < nums.length; i++)
            result += nums[i];
        
        average = result / nums.length;
        System.out.println("Average is "+ average );
    }
}
