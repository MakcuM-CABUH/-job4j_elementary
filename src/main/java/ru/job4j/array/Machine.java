package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {

        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;

        for (int coin : coins) {
            while (coin <= (money - price)) {
                money = money - coin;
                size += 1;
                result = Arrays.copyOf(result, size);
                result[result.length - 1] = coin;
            }
        }
        return Arrays.copyOf(result, size);
    }
}