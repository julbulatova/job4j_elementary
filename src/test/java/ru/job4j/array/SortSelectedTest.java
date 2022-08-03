package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SortSelectedTest {

    @Test
    void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSort1() {
        int[] data = new int[] {7, 5, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {5, 6, 7};
        assertThat(result).containsExactly(expected);
    }
}
