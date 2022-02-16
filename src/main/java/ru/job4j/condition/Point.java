package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double firstX = x2 - x1;
        double firstY = y2 - y1;
        double rsl = Math.sqrt(Math.pow(firstX, 2) + Math.pow(firstY, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
