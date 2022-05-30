package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

    @Test
    public void whenA10B0C0X2Then40() {
        /* Входные параметра. Их будет 4 для данного случая*/
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 40;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rsl = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C1XThen40() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expectedTest2 = 3;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expectedTest2, rsl);
    }

    @Test
    public void whenA0B1C1X1Then40() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expectedTest3 = 2;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expectedTest3, rsl);
    }

    @Test
    public void whenA1B1C0X1Then40() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expectedTest4 = 2;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expectedTest4, rsl);
    }

    @Test
    public void whenA1B1C1X0Then40() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expectedTest5 = 1;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expectedTest5, rsl);
    }
}