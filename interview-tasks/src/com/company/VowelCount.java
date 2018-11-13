package com.company;

public class VowelCount {

    public static int getCount(String str) {
        int vowelsCount = 0;

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (str.charAt(i) == vowels[j]) {
                    vowelsCount++;
                    break;
                }
            }
        }
        return vowelsCount;
    }
}
