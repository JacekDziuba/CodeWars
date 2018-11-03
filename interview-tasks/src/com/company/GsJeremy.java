package com.company;

public class GsJeremy {

    public static String rle(String input) {

        if (input.isEmpty()) {
            return "";
        }

        int count = 1;
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < input.length()-1; i++) {

            if (input.charAt(i) == input.charAt(i+1)) {
                count++;

                if (i == input.length()-2) {
                    stringBuffer.append(input.charAt(i));
                    stringBuffer.append(count);
                }

            } else {
                stringBuffer.append(input.charAt(i));
                stringBuffer.append(count);
                count = 1;
            }
        }
        return stringBuffer.toString();
    }
}
