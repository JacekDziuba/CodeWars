package com.company;

public class MiddleChar {

//    You are going to be given a word. Your job is to return the middle character of the word.
//    If the word's length is odd, return the middle character.
//    If the word's length is even, return the middle 2 characters.

    public static String getMiddle(String word) {

        // check if string is empty
        if (word.isEmpty()) {
            return "";
        }

        // create a stringBuilder to join chars
        StringBuilder result = new StringBuilder();

        char middle = word.charAt(word.length()/2-1);

        // validate if odd or even
        if (word.length() % 2 == 0) {
           char middlePlus = word.charAt(word.length()/2);
           return result.append(middle).append(middlePlus).toString();
       }

       return result.append(middle).toString();
    }


}
