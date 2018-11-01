package com.company;

public class HighestAndLowest {

    public static String HighAndLow(String numbers) {
        String[] strings = numbers.split(" ");
        int[] integers = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].matches("-?[0-9]{0,10}")) {
                integers[i] = Integer.parseInt(strings[i]);
            }
        }
        int max = integers[0];
        int min = integers[0];

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] > max) {
                max = integers[i];
            } else if (integers[i] < min) {
                min = integers[i];
            }
        }
        return max + " " + min;
    }
}
