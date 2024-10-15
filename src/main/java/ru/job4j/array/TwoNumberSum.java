package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 1;
        while (i < array.length - 1) {
            if (j >= array.length) {
                i++;
                j = i + 1;
            } else {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
                j++;
            }
        }
        return new int[0];
    }
}