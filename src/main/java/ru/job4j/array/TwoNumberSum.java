package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        while (i < array.length) {
            int j = i + 1;
            while (j < array.length) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
                j++;
            }
            i++;
        }
        return new int[0];
    }
}