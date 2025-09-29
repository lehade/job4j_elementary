package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point firstPoint = new Point(0, 0);
        Point secondPoint = new Point(2, 0);
        double out = firstPoint.distance(secondPoint);
        assertThat(out).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void whenM11to22then3dot16() {
        double expected = 3.16;
        Point firstPoint = new Point(-1, 1);
        Point secondPoint = new Point(2, 2);
        double out = firstPoint.distance(secondPoint);
        assertThat(out).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void when0M2to44then7dot21() {
        double expected = 7.21;
        Point firstPoint = new Point(0, -2);
        Point secondPoint = new Point(4, 4);
        double out = firstPoint.distance(secondPoint);
        assertThat(out).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void when1010toM10M10then28dot28() {
        double expected = 28.28;
        Point firstPoint = new Point(10, 10);
        Point secondPoint = new Point(-10, -10);
        double out = firstPoint.distance(secondPoint);
        assertThat(out).isCloseTo(expected, offset(0.01));
    }
}