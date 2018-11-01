package com.company;

public class InvertArray {

    public static int[] invert(int[] array) {
        int[] temp = array;
        for (int i = 0; i < temp.length; i++) {
            temp[i] = temp[i] * (-1);
        }
        return temp;
    }
}
