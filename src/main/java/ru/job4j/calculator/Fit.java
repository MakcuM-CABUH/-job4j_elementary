package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return calculateIdealWeight(height, 100);
    }

    public static double womanWeight(short height) {
        return calculateIdealWeight(height, 110);
    }

    private static double calculateIdealWeight(short height, int correction) {
        return (height - correction) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println(String.format("Man 187 is %.2f kg.", man));
        double woman = Fit.womanWeight(height);
        System.out.println(String.format("Woman 187 is %.2f kg.", woman));
    }
}