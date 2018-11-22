package com.company;

public class ProductArray {

//    Task
//
//    Given an array/list [] of integers , Construct a product array Of same size Such That prod[i] is equal to The Product of all the elements of Arr[] except Arr[i].
//
//    Notes
//
//    Array/list size is at least 2 .
//    Array/list's numbers Will be only Postives
//    Repeatition of numbers in the array/list could occur.
//            Input >> Output Examples
//
//    1- productArray ({12,20}) ==>  return {20,12}
//    Explanation:
//
//    The first element in prod [] array 12 is the product of all array's elements except the first element
//    The second element 20 is the product of all array's elements except the second element .
//    2- productArray ({1,5,2}) ==> return {10,2,5}

    public static long[] productArray(int[] numbers) {
        // create an array to store results
        long[] resultArray = new long[numbers.length];
        // replace numbers[i] with 1
        for (int i = 0; i < numbers.length; i++) {
            long result = 1;
            int[] clone = numbers.clone();
            clone[i] = 1;
            for (int j = 0; j < numbers.length; j++) {
                result *= clone[j];
            }
            resultArray[i] = result;
        }
        return resultArray;
    }
}
