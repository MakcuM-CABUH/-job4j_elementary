package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double difAndDiv(double first, double second) {
        return difference(first, second)
                + division(first, second);
    }

    public static double globalSum(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + difference(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчёта \"sum + multiply\" равен " + sumAndMultiply(10, 20));
        System.out.println("Результат расчёта \"difference + division\" равен " + difAndDiv(10, 20));
        System.out.println("Результат расчёта \"sum + multiply + difference + division\" равен " + globalSum(10, 20));
    }

}
