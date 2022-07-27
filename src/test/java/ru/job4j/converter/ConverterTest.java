package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isCloseTo(expected, offset(eps));
    }

    @Test
    public void whenConvert200RblThen3dot3333Dlr() {
        float in = 200;
        float expected = 3.3333f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isCloseTo(expected, offset(eps));
    }

    @Test
    public void whenConvertZeroRblThenZero() {
        float in = 0;
        float expected = 0;
        float out = Converter.rubleToDollar(in);
        float eps = 0;
        assertThat(out).isCloseTo(expected, offset(eps));
    }
}