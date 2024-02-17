package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[]{8, 4, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{4, 6, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[]{12, 0, 1, 3, 33};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{0, 1, 3, 12, 33};
        assertThat(result).containsExactly(expected);
    }
}