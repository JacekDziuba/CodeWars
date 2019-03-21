package com.company;

public class CenturyFromYear {

// The first century spans from the year 1 up to and including the year 100,
// The second - from the year 101 up to and including the year 200, etc.
//
//Task :
//
//Given a year, return the century it is in.
//
//Input , Output Examples ::
//
//centuryFromYear(1705)  returns (18)
//centuryFromYear(1900)  returns (19)
//centuryFromYear(1601)  returns (17)
//centuryFromYear(2000)  returns (20)

    public static int century(int number) {
        int num = number / 100;

        if (number > num * 100) {
            return num + 1;
        } else {
            return num;
        }
    }

}
