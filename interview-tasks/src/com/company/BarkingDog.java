package com.company;

public class BarkingDog {

    public static boolean bark (boolean barking, int hourOfTheDay) {
        if (barking == true && hourOfTheDay >= 0 && hourOfTheDay < 8) {
            return true;
        } else if (barking == true && hourOfTheDay > 22 && hourOfTheDay < 24) {
            return true;
        } else {
            return false;
        }
    }

}
