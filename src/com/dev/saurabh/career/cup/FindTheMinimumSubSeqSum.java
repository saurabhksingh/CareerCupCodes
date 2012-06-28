package com.dev.saurabh.career.cup;

/**
 * Copyright (c)
 * User: saurabh
 * Date: 6/28/12
 * Time: 10:13 AM
 * This file is created and owned by Saurabh Kr Singh (saurabh.nsit@gmail.com).
 * The code written here is being released under Apache 2.0 License
 */

public class FindTheMinimumSubSeqSum {

    public static void main(String [] args){

        int [] input = new int[] {2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4,
                                 -1, -5, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5,
                                 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34,
                                 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10,
                                 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,
                                2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4,
                                -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5,
                                87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34,
                                5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10,
                                30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,
                                2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4,
                                -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5,
                                87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34,
                                5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10,
                                30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,
                                2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4,
                                -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5,
                                87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34,
                                5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10,
                                30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,
                                2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4,
                                -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5,
                                87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34,
                                5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10,
                                30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,
                                2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4,
                                -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5,
                                87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34,
                                5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10,
                                30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,
                                2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4,
                                -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5,
                                87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34,
                                5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10,
                                30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,
                                2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4,
                                -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5,
                                87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34,
                                5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10,
                                30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56,2, 4, -1, -5, 87, -34, 5, -10, 30, -56};

        long startTime = System.currentTimeMillis();
        int sum = getMinSubSeqSumBF(input);
        long endTime = System.currentTimeMillis();
        System.out.println("BruteForce : The minimum sub-seq sum is : "+ sum +" (Total Time : "+(endTime-startTime)+")");

        startTime = System.currentTimeMillis();
        sum = getMinSubSeqSum(input);
        endTime = System.currentTimeMillis();
        System.out.println("Optimized : The minimum sub-seq sum is : "+ sum +" (Total Time : "+(endTime-startTime)+")");
    }

    private static int getMinSubSeqSumBF(int[] input) {
        int result = Integer.MAX_VALUE;

        if(input != null && input.length != 0){

            int length = input.length;

            for(int i=0; i<length; i++){
                int sum = 0;
                for(int j=i; j<length; j++){
                    sum += input[j];
                    if(sum < result)
                        result = sum;
                }
            }
        }

        return result;
    }

    private static int getMinSubSeqSum(int[] input) {
        int result;
        int minimum = Integer.MAX_VALUE;
        int overAllMin = 0;
        int minTillNow = 0;
        //idea is to keep track of minimum number encountered till now as well the minimum sum till now
        //if sum > 0 then discard it and start tracking from the next term. So the minimum will be
        //on of the two : [minimum till now] and [minimum sum]
        if(input != null && input.length != 0){

            int length = input.length;
            for(int i=0; i<length; i++){

                if(input[i] < minimum){
                    minimum = input[i];
                }
                minTillNow += input[i];
                if(minTillNow < 0){
                    if(minTillNow < overAllMin ){
                        overAllMin = minTillNow;
                    }
                }
                else
                {
                    minTillNow = 0;
                }
            }
        }
        result = minimum<overAllMin ? minimum:overAllMin;

        return result;
    }
}
