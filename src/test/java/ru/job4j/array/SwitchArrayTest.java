package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SwitchArrayTest {

    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap1to4() {
        int[] input = {3, 8, 7, 5, 1, 9};
        int source = 1;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {3, 1, 7, 5, 8, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap3to7() {
        int[] input = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int source = 3;
        int dest = 7;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {10, 9, 8, 3, 6, 5, 4, 7, 2, 1};
        assertThat(result).containsExactly(expected);
    }
}
