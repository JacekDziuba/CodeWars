package com.company;

public class isPalindrome {

    public static boolean isPalindrome(String string) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < string.length(); i++) {
            sb.append(string.charAt(string.length()-1-i));
        }
        if (sb.toString().equals(string)) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome2(String string) {
        for (int i = 0; i < string.length()/2; i++) {
            if (string.charAt(i) != string.charAt(string.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}
