package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class PointTest {

    @Test
    void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2.0;
        double rsl = Point.distance(x1, y1, x2, y2);
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when20To13Then316() {
        int x1 = 2;
        int y1 = 0;
        int x2 = 1;
        int y2 = 3;
        double expected = 3.16;
        double rsl = Point.distance(x1, y1, x2, y2);
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00To13Then316() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 1;
        int y2 = 3;
        double expected = 3.16;
        double rsl = Point.distance(x1, y1, x2, y2);
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when02To27Then539() {
        int x1 = 0;
        int y1 = 2;
        int x2 = 2;
        int y2 = 7;
        double expected = 5.39;
        double rsl = Point.distance(x1, y1, x2, y2);
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }
}