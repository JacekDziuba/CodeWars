package com.company;

import java.util.Arrays;

public class MinSum {

//    Task:
//
//    Given an array of integers, find the minimum sum which is obtained from multiplying each integer.
//
//    Notes:
//
//    Array/list will contain positives only.
//    Array/list will always has even size.
//
//    Input >> Output Examples:
//
//    1- minSum({5,4,2,3}) ==> return (22)
//
//    Explanation:
//
//    The minimum sum obtained from summing each two integers product , 5*2 + 3*4 = 22
//
//    2- minSum({12,6,10,26,3,24}) ==> return (342)
//
//    Explanation:
//
//    The minimum sum obtained from summing each two integers product , 26*3 + 24*6 + 12*10 = 342

    public static int minSum(int[] passed) {
        // initialized result variable
        int result = 0;
        // sorting the array
        java.util.Arrays.sort(passed);
        // multiplying the biggest and the smallest numbers
        for (int i = 0; i < passed.length/2; i++) {
            result += passed[passed.length-1-i] * passed[i];
            }
        // returning the result
        return result;
    }

}
