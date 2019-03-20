package com.company;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {

    public static int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                integers.add(numbers[i]);
            }
        }
        int[] ints = new int[integers.size()];
        for (int i = 0; i < integers.size(); i++) {
            ints[i] = integers.get(i).intValue();
        }
        return ints;
    }
}
