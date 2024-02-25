package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        Short[] ages = new Short[10];
        String[] surnames = new String[100500];
        Float[] prices = new Float[40];
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
    }
}
