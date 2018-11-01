package com.company;

public class AbbreviateName {

    public static String abbrevName(String name) {
        String[] strings = name.split(" ");
        String result = strings[0].charAt(0) + "." + strings[1].charAt(0);
        String big = result.toUpperCase();
        return big;
    }
}
