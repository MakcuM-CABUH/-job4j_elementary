package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {

        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            int sum = array[i] + array[j];
            if (sum == target) {
                array = new int[]{i, j};
                break;
            }
            if (sum > target) {
                j--;
            }
            if (sum < target) {
                i++;
            }
            if (i == j) {
                return new int[0];
            }
        }
        return array;
    }
}