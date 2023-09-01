package ml.pevgen.algo.leetcode.n74;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Search2DMatrixTest {

    private Search2DMatrix solution;

    @BeforeEach
    void setUp() {
        solution = new Search2DMatrix();
    }

    @Test
    void should_return_true() {
        assertTrue(solution.searchMatrix(
                new int[][]{
                        {1, 3, 5, 7},
                        {10, 11, 16, 20},
                        {23, 30, 34, 60}}, 3));
        assertTrue(solution.searchMatrix(
                new int[][]{
                        {1, 3, 5, 7, 8},
                        {10, 11, 16, 20, 21},
                        {23, 30, 34, 60, 87}}, 11));
    }

    @Test
    void should_return_false() {

        assertFalse(solution.searchMatrix(
                new int[][]{{1}}, 0));

        assertFalse(solution.searchMatrix(
                new int[][]{
                        {1, 3, 5, 7},
                        {10, 11, 16, 20},
                        {23, 30, 34, 60}}, 13));
    }
}