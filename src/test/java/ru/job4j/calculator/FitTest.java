package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FitTest {

    @Test
    public void whenManHeight187ThenWeightIs101point05() {
        short heightMan = 187;
        double expectedWeight = (heightMan - 100) * 1.15;
        double actualWeight = Fit.manWeight(heightMan);
        assertThat(actualWeight).isEqualTo(expectedWeight);
    }

    @Test
    public void whenWomanHeight170ThenWeightIs69() {
        short heightWoman = 170;
        double expectedWeight = (heightWoman - 110) * 1.15;
        double actualWeight = Fit.womanWeight(heightWoman);
        assertThat(actualWeight).isEqualTo(expectedWeight);
    }

    @Test
    public void whenManHeight180ThenWeightIs92() {
        short heightMan = 180;
        double expectedWeight = (heightMan - 100) * 1.15;
        double actualWeight = Fit.manWeight(heightMan);
        assertThat(actualWeight).isEqualTo(expectedWeight);
    }

    @Test
    public void whenWomanHeight160ThenWeightIs57point5() {
        short heightWoman = 160;
        double expectedWeight = (heightWoman - 110) * 1.15;
        double actualWeight = Fit.womanWeight(heightWoman);
        assertThat(actualWeight).isEqualTo(expectedWeight);
    }
}
