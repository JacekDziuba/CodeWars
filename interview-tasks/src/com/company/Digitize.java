package com.company;

public class Digitize {

    public static int[] digitize(long n) {
        // Convert long to String and get an array
        String[] split = String.valueOf(n).split("");
        // Get an empty array of Integers with the size of the argument
        int[] array = new int[split.length];
        // reverse the strings array and fill the empty Integer array
        for (int i = 0; i < split.length; i++) {
            array[i] = Integer.parseInt(split[split.length - 1 - i]);
        }
        return array;
    }

}
