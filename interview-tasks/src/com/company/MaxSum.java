package com.company;

import java.util.Arrays;

public class MaxSum {

//    Task
//
//    Given an array/list [] of integers, find the product of the k maximal numbers.
//
//    Notes
//
//    Array/list size is at least 3 .
//    Array/list's numbers Will be mixture of positives , negatives and zeros
//    Repeatition of numbers in the array/list could occur.
//    Input >> Output Examples
//
//    1- maxProduct ({4, 3, 5}, 2) ==>  return (20)
//    Explanation:
//
//    Since the size (k) equal 2 , then the subsequence of size 2 whose gives product of maxima is 5 * 4 = 20.
//
//    2- maxProduct ({8, 10 , 9, 7}, 3) ==>  return (720)
//    Explanation:
//
//    Since the size (k) equal 3 , then the subsequence of size 2 whose gives product of maxima is 8 * 9 * 10 = 720.

    public static long maxProduct(int[] numbers, int sub_size) {
        // sort the array
        java.util.Arrays.sort(numbers);
        // initialize result variable
        int result = numbers[numbers.length-1];
        // iterate and multiply the biggest numbers
        for (int i = 1; i < sub_size; i++) {
            result *= numbers[numbers.length-1-i];
        }
        return result;
    }

}
