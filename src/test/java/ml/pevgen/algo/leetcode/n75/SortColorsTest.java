package ml.pevgen.algo.leetcode.n75;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortColorsTest {

    private SortColors solution;


    @BeforeEach
    void setUp() {
        solution = new SortColors();
    }

    @Test
    void should_sort_colors_example_1() {
        int[] array = new int[]{2, 0, 1};
        solution.sortColors(array);
        assertArrayEquals(new int[]{0, 1, 2}, array);
    }

    @Test
    void should_sort_colors_example_2() {
        int[] array = new int[]{2, 0, 2, 1, 1, 0};
        solution.sortColors(array);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, array);
    }
}