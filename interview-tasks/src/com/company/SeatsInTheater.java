package com.company;

public class SeatsInTheater {

    public static int seatsInTheater(int nCols, int nRows, int col, int row) {
        int rowsBehindYou = nRows - row;
        int columnsToPass = nCols - col + 1;
        return rowsBehindYou*columnsToPass;
    }
}
