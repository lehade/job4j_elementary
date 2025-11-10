package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To2Then3() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7to8to2Then8 () {
        int left = 7;
        int right = 8;
        int mid = 2;
        int result = Max.max(left, right, mid);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5to6to3to4Then6 () {
        int left = 5;
        int right = 6;
        int mid = 3;
        int last = 4;
        int result = Max.max(left, right, mid, last);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }
}