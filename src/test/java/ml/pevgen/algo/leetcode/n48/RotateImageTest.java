package ml.pevgen.algo.leetcode.n48;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RotateImageTest {

    private RotateImage solution;

    @BeforeEach
    void setUp() {
        solution = new RotateImage();
    }

    @Test
    void should_rotate_matrix_1x1() {
        int[][] matrix = new int[][]{{99}};
        solution.rotate(matrix);
        assertEquals(99, matrix[0][0]);
    }

    @Test
    void should_rotate_matrix_2x2() {
        int[][] matrix = new int[][]{{1, 4}, {2, 3}};
        solution.rotate(matrix);
        assertArrayEquals(new int[]{2, 1}, matrix[0]);
        assertArrayEquals(new int[]{3, 4}, matrix[1]);
    }

    @Test
    void should_rotate_matrix_3x3() {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        solution.rotate(matrix);
        assertArrayEquals(new int[]{7, 4, 1}, matrix[0]);
        assertArrayEquals(new int[]{8, 5, 2}, matrix[1]);
        assertArrayEquals(new int[]{9, 6, 3}, matrix[2]);
    }

    @Test
    void should_rotate_matrix_4x4() {
        int[][] matrix = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        solution.rotate(matrix);
        assertArrayEquals(new int[]{15, 13, 2, 5}, matrix[0]);
        assertArrayEquals(new int[]{14, 3, 4, 1}, matrix[1]);
        assertArrayEquals(new int[]{12, 6, 8, 9}, matrix[2]);
        assertArrayEquals(new int[]{16, 7, 10, 11}, matrix[3]);
    }

}