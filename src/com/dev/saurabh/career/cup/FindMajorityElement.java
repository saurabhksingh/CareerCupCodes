package com.dev.saurabh.career.cup;

/**
 * Copyright (c)
 * User: saurabh
 * Date: 6/29/12
 * Time: 10:31 PM
 * This file is created and owned by Saurabh Kr Singh (saurabh.nsit@gmail.com).
 * The code written here is being released under Apache 2.0 License
 */
public class FindMajorityElement {

    /**
     * Problem:
     * A majority element in an array, A, of size N is an element that appears more than
     N/2 times (thus, there is at most one). For example, the array
     3, 3, 4, 2, 4, 4, 2, 4, 4
     has a majority element (4), whereas the array
     3, 3, 4, 2, 4, 4, 2, 4
     does not. If there is no majority element, your program should indicate this
     */

    public static void main(String [] args){

        int [] input = new int [] {3, 3, 4, 2, 4, 4, 2, 4, 4};

        System.out.println("Number with majority is : " + getMajorityElement(input));
    }

    //This solution will work in O(n)
    private static int getMajorityElement(int[] input) {

        int result = 0;
        int counter = 0;

        for(int data : input){
            if(counter == 0){

                counter++;
                result = data;
            }
            else{
                if(counter > input.length/2)   //no need to iterate over array as we have already found our majority number :)
                    break;

                if(result != data){
                    counter--;
                }
                else{
                    counter++;
                    result = data;
                }
            }
        }

        return result;
    }
}
