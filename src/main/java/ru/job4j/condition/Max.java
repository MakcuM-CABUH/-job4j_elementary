package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        String maxFromLeftToRight = String.valueOf(Max.max(2, 8));
        System.out.println(maxFromLeftToRight);
    }
}
