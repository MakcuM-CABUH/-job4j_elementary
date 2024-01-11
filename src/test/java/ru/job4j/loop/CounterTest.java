package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CounterTest {

    @Test
    void from0To10sum55() {
        int start = 0;
        int finish = 10;
        int sum = Counter.sum(start, finish);
        int expected = 55;
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void from3To8sum33() {
        int start = 3;
        int finish = 8;
        int sum = Counter.sum(start, finish);
        int expected = 33;
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void from1To1sum1() {
        int start = 1;
        int finish = 1;
        int sum = Counter.sum(start, finish);
        int expected = 1;
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void fromMinus1To10sum54() {
        int start = -1;
        int finish = 10;
        int sum = Counter.sum(start, finish);
        int expected = 54;
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void from3To1sum0() {
        int start = 3;
        int finish = 1;
        int sum = Counter.sum(start, finish);
        int expected = 0;
        assertThat(sum).isEqualTo(expected);
    }
}
/*
формальная правка
 */