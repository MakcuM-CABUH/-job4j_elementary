package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num) && num != 0;
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num) && num != 0;
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || !isPositive(num) && num != 0;
    }

    public static void main(String[] args) {
        int num = 0;
        LogicNot.isEven(num);
        System.out.println(isEven(num));

        LogicNot.isPositive(num);
        System.out.println(isPositive(num));

        LogicNot.notEven(num);
        System.out.println(notEven(num));

        LogicNot.notPositive(num);
        System.out.println(notPositive(num));

        LogicNot.notEvenAndPositive(num);
        System.out.println(notEvenAndPositive(num));

        LogicNot.evenOrNotPositive(num);
        System.out.println(evenOrNotPositive(num));
    }
}
