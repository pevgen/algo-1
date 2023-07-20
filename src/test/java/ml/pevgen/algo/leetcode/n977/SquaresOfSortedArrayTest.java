package ml.pevgen.algo.leetcode.n977;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SquaresOfSortedArrayTest {

    private SquaresOfSortedArray solution;

    @BeforeEach
    void setUp() {
        solution = new SquaresOfSortedArray();
    }

    @Test
    void should_return_empty_for_empty_input() {
        assertArrayEquals(new int[]{}, solution.sortedSquares(new int[]{}));
    }

    @Test
    void should_return_squared_for_one_element() {
        assertArrayEquals(new int[]{4}, solution.sortedSquares(new int[]{2}));
    }

    @Test
    void should_return_result_example_1() {
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, solution.sortedSquares(new int[]{-4, -1, 0, 3, 10}));
    }

    @Test
    void should_return_result_example_2() {
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, solution.sortedSquares(new int[]{-7, -3, 2, 3, 11}));
    }

}