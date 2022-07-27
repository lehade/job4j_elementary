package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void whenP120K3Square675() {
        int expected = 675;
        int p = 120;
        double k = 3;
        double out = SqArea.square(p, k);
        assertThat(out).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void whenP90K9Square182dot25() {
        double expected = 182.25;
        int p = 90;
        double k = 9;
        double out = SqArea.square(p, k);
        assertThat(out).isCloseTo(expected, offset(0.01));
    }
}