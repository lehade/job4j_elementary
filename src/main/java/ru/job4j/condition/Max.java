package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int mid) {
        return max(
                left,
                max(right, mid)
        );
    }

    public static int max(int left, int right, int mid, int last) {
        return max(
                max(left, right),
                max(mid, last)
        );
    }

}