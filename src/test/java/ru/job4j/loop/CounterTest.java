package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CounterTest {

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToOneThenZero() {
        int start = 1;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusOneToFiveThenSix() {
        int start = -1;
        int finish = 5;
        int result = Counter.sumByEven(start, finish);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromSixToOneThenZero() {
        int start = 6;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusSixToOneThenMinusTwelve() {
        int start = -6;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = -12;
        assertThat(result).isEqualTo(expected);
    }
}
