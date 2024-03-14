package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {

        int[] coins = {10, 5, 2, 1};
        int size = 0;
        int[] result = new int[100];
        int cash = money - price;

        for (int q : coins) {
            while (q <= cash) {
                cash = cash - q;
                size += 1;
                int[] res = Arrays.copyOf(result, size);
                res[res.length - 1] = q;
                result = res;
            }
            if (cash == 0) {
                break;
            }
        }
        return Arrays.copyOf(result, size);
    }
}