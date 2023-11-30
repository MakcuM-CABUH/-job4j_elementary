package ru.job4j.calculator;

public class Calculator {

    public static int plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
        return result;
    }

    public static int minus(int first, int second) {
        int result = first - second;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        plus(1, 2);
        plus(10, 11);
        minus(7, 3);
        minus(2, 6);
    }
}
/* формальное изменение для перезагрузки на GitHub */
