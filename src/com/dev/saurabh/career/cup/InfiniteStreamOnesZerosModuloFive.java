package com.dev.saurabh.career.cup;

import java.util.Scanner;

/**
 * Copyright (c)
 * User: saurabh
 * Date: 6/25/12
 * Time: 11:11 PM
 * This file is created and owned by Saurabh Kr Singh (saurabh.nsit@gmail.com).
 * The code written here is being released under Apache 2.0 License
 */
public class InfiniteStreamOnesZerosModuloFive {

    /**
     * if infinite streams of 1's and 0's are coming, give an algorithm to compute the remainder of current number
     * formed by them after dividing it by 5....you cannot store whole stream..
     */

    public static void main(String [] args) throws Exception{

        /**
         * solution : every bit will be multiplied with a 2^n. Where n is 0 or 1. Now considering the number be 1, power of 2 willl be  1,2,4,8,16,32..
         * modulo of these numbers with 5 will be 1,2,4,3,1,2,4,3....so if stor ethe pattern 1,2,4,3 in array A[] then 2^n modulo 5 will be A[n%4]
         */
        int [] remainders = new int[]{1, 2, 4, 3};
        Scanner in = new Scanner(System.in);
        int result = 0;
        int count = 0;
        while(in.hasNextInt()){
            if(in.nextInt() == 1){
                result = (result + remainders[count%4])%5;
            }

            count++;
        }

        System.out.println("Output is : "+result);

    }
}
