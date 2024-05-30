package ml.pevgen.algo.leetcode.n73;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SetMatrixZeroesTest {

    private SetMatrixZeroes solution;

    @BeforeEach
    void setUp() {
        solution = new SetMatrixZeroes();
    }

    @Test
    void should_set_zeroes_in_place_example_1() {
        int[][] matrix = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        solution.setZeroes(matrix);
        assertArrayEquals(new int[]{1, 0, 1}, matrix[0]);
        assertArrayEquals(new int[]{0, 0, 0}, matrix[1]);
        assertArrayEquals(new int[]{1, 0, 1}, matrix[2]);
    }

    @Test
    void should_set_zeroes_in_place_example_2() {
        int[][] matrix = new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        solution.setZeroes(matrix);
        assertArrayEquals(new int[]{0, 0, 0, 0}, matrix[0]);
        assertArrayEquals(new int[]{0, 4, 5, 0}, matrix[1]);
        assertArrayEquals(new int[]{0, 3, 1, 0}, matrix[2]);
    }
}