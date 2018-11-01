package com.company;

public class CountPositivesSumNegatives {

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input.length == 0 || input == null) {
            return new int[0];
        }

        int countPositive = 0;
        int sumNegative = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                countPositive++;
            } else {
                sumNegative += input[i];
            }
        }
        int[] result = {countPositive, sumNegative};
        return result;
    }
}
