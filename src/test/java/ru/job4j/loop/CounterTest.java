package ru.job4j.loop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CounterTest {
    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToHundredThen2550() {
        int start = 1;
        int finish = 100;
        int result = Counter.sumByEven(start, finish);
        int expected = 2550;
        Assertions.assertThat(result).isEqualTo(expected);
    }
}