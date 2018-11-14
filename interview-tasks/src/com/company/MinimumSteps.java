package com.company;

import java.util.Arrays;

public class MinimumSteps {

//    Task
//
//    Given an array of N integers, you have to find how many times you have to add up the smallest numbers in the array until their Sum becomes greater or equal to K.
//
//    Notes:
//
//    List size is at least 3.
//    All numbers will be positive.
//    Numbers could occur more than once , (Duplications may exist).
//    Threshold K will always be reachable.

    public static int minimumSteps(int[] numbers, int k) {
        Arrays.sort(numbers);

        int temp = numbers[0];
        int count = 0;

        for (int i = 1; i < numbers.length ; i++) {
            temp += numbers[i];
            count ++;
            if (temp >= k) {
                break;
            }
        }

        return count;
    }

}
