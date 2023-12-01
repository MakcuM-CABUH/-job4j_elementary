package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class SqAreaTest {

    @Test
    void whenP6K2ThenSqArea2() {
        double p = 6;
        double k = 2;
        double expected = 2.0;
        double rsl = SqArea.square(p, k);
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP8K15ThenSqArea384() {
        double p = 8;
        double k = 1.5;
        double expected = 3.84;
        double rsl = SqArea.square(p, k);
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP07K3ThenSqArea384() {
        double p = 0.7;
        double k = 3;
        double expected = 0.02;
        double rsl = SqArea.square(p, k);
        assertThat(rsl).isEqualTo(expected, withPrecision(0.01));
    }
}