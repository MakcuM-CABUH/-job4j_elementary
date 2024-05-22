package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] ints) {
        for (int row = 0; row < ints.length; row++) {
            for (int cell = 0; cell < ints[row].length; cell++) {
                if (ints[row][cell] < 0) {
                    ints[row][cell] = 0;
                }
            }
        }
        return ints;
    }
}