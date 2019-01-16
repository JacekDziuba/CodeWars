package com.company;

public class Fibonacci {

    public static int function (int n) {

        int[] arr = new int[n+2];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }

        return arr[n];
    }

    public static int functionTwo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        int fiboOne = 1;
        int fiboTwo = 1;
        int fibonacci = 1;

        for (int i = 2; i < n; i++) {
            fibonacci = fiboOne + fiboTwo;
            fiboOne = fiboTwo;
            fiboTwo = fibonacci;
        }

        return fibonacci;
    }

}
