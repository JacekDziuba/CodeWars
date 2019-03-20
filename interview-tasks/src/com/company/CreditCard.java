package com.company;

public class CreditCard {

    public static String getIssuer(String cardNumber) {

        if (cardNumber.length() == 15) {
            if (cardNumber.substring(0,2).equals("34") || cardNumber.substring(0,2).equals("37")) {
                return "AMEX";
            }
        } else if (cardNumber.length() == 13 || cardNumber.length() == 16) {
            if (cardNumber.charAt(0) == '4') {
                return "VISA";
            } else if (cardNumber.substring(0,4).equals("6011")) {
                return "Discover";
            } else if (cardNumber.substring(0,2).equals("51") || cardNumber.substring(0,2).equals("52")
            || cardNumber.substring(0,2).equals("53") || cardNumber.substring(0,2).equals("54")
            || cardNumber.substring(0,2).equals("55")) {
                return "Mastercard";
            }
        }

        return "Unknown";
    }

}