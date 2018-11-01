package com.company;

public class Main {

    public static void main(String[] args) {


    }

    public static String rle(String input) {

        int first = 0;

        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == input.charAt(i+1)) {
                first++;
            }
            System.out.println(first);

        }
        return "";
    }



}
