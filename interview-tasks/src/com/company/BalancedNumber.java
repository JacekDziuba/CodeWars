package com.company;

public class BalancedNumber {

    /*

Balanced number is the number that The sum of all digits to the left of the middle digit(s) and the sum of all digits to the right of the middle digit(s) are equal.

Given a number, Find if it is Balanced or not .

Notes

If the number has an odd number of digits then there is only one middle digit, e.g. 92645 has middle digit 6;
otherwise, there are two middle digits, e.g. 1301 has middle digits 3 and 0
The middle digit(s) should not be considered when determining whether a number is balanced or not,
e.g 413023 is a balanced number because the left sum and right sum are both 5.
Number passed is always Positive.
Return the result as String
Input >> Output Examples

1- balancedNum (7) ==> return "Balanced"   .
Explanation:

Since , The sum of all digits to the left of the middle digit (0)
and the sum of all digits to the right of the middle digit (0) are equal , then It's Balanced

2- balancedNum (295591) ==> return "Not Balanced" .
Explanation:

Since , The sum of all digits to the left of the middle digits (11)
and the sum of all digits to the right of the middle digits (10) are equal , then It's Not Balanced
Note : The middle digit(s) are 55 .
     */

    public static String balancedNum(long number) {
        String value = String.valueOf(number);
        int firstHalf = 0;

        for (int i = 0; i < value.length()/2; i++) {
            System.out.println(value.charAt(i));
            firstHalf += Integer.parseInt(String.valueOf(value.charAt(i)));
        }
        System.out.println("Final: " + firstHalf);
        return Integer.toString(firstHalf);
    }
}
