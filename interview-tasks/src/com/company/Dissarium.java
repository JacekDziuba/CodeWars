package com.company;

public class Dissarium {

    /*

Definition

Disarium number is the number that The sum of its digits powered with their respective positions
is equal to the number itself.

Task

Given a number, Find if it is Disarium or not .

     */

    public static String disariumNumber(int number) {
        char[] arr = String.valueOf(number).toCharArray();
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(Integer.parseInt(String.valueOf(arr[i])), (i+1));
        }

        if (sum == number) {
            return "Disarium !!";
        } else {
            return "Not !!";
        }
    }

}
