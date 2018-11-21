package com.company;

import java.util.ArrayList;
import java.util.List;

public class ArrayLeaders {

//    Definition
//
//    An element is leader if it is greater than The Sum all the elements to its right side.
//
//    Task
//
//    Given an array/list [] of integers , Find all the LEADERS in the array.
//
//    Notes
//
//    Array/list size is at least 3 .
//    Array/list's numbers Will be mixture of positives , negatives and zeros
//    Repeatition of numbers in the array/list could occur.
//    Returned Array/list should store the leading numbers in the same order in the original array/list .
//
//    Input >> Output Examples
//
//    1 - arrayLeaders ({1, 2, 3, 4, 0}) ==> return {4}
//
//    Explanation:
//
//    4 is greater than the sum all the elements to its right side
//    Note : The last element 0 is equal to right sum of its elements (abstract zero).

    public static List arrayLeaders(int[] numbers) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                sum += numbers[j];
            }
            if (numbers[i] > sum) {
                list.add(numbers[i]);
            }
        }
        return list;
    }

}
