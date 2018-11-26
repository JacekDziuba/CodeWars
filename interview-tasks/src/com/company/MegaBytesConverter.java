package com.company;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {

            int mebaBytes = kiloBytes / 1024;
            int remainderBites = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB" + " = " +
                    mebaBytes + " MB " + "and " +
                    remainderBites + " KB");
        }
    }
}
