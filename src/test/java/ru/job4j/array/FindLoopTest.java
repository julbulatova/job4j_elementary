package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[]{3, 4, 7, 6};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas8Then1() {
        int[] data = new int[]{1, 8, 2, 9};
        int el = 8;
        int result = FindLoop.indexOf(data, el);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot7ThenMinus1() {
        int[] data = new int[]{8, 3, 1, 11};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}
