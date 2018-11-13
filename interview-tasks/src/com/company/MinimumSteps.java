package com.company;

import java.util.Arrays;

public class MinimumSteps {

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
