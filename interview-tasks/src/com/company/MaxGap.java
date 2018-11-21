package com.company;

public class MaxGap {

//    Task
//
//    Given an array/list [] of integers , Find The maximum difference between the successive elements in its sorted form.
//
//    Notes
//
//    Array/list size is at least 3 .
//    Array/list's numbers Will be mixture of positives and negatives also zeros_
//    Repeatition of numbers in the array/list could occur.
//    The Maximum Gap is computed Regardless the sign.
//    Input >> Output Examples
//
//    1- maxGap ({13,10,5,2,9}) ==> return (4)
//    Explanation:
//
//    The Maximum Gap after sorting the array is 4 , The difference between 9 - 5 = 4 .
//
//    2- maxGap ({-3,-27,-4,-2}) ==> return (23)
//    Explanation:
//
//    The Maximum Gap after sorting the array is 23 , The difference between |-3- (-27) | = 23 .
//    Note : Regardless the sign of negativity.

    public static int maxGap(int[] numbers) {
        // initialize Integer value
        int maxGap = 0;
        // sort the array
        java.util.Arrays.sort(numbers);
        // iterate through the sorted array
        for (int i = 0; i < numbers.length - 1; i++) {
            int result = numbers[i+1] - numbers[i];
            if (result > maxGap) {
                maxGap = result;
            }
        }
        return maxGap;
    }
}
