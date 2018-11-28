package com.company;

public class ComparingDoubles {

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        first *= 1000;
        second *= 1000;

        int firstInt = (int) first;
        int secondInt = (int) second;

        if (firstInt == secondInt) {
            return true;
        } else {
            return false;
        }
    }
}
