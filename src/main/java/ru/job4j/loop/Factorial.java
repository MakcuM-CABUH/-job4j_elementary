package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int result = 1;
        for (int index = number; index >= 1; index--) {
            result *= index;
            if (number == 0) {
                result = 1;
            }
        }
        return result;
    }
}