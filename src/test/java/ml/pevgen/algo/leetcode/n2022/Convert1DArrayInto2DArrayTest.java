package ml.pevgen.algo.leetcode.n2022;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Convert1DArrayInto2DArrayTest {

    private Convert1DArrayInto2DArray solution;

    @BeforeEach
    void setUp() {
        solution = new Convert1DArrayInto2DArray();
    }

    @Test
    void should_return_empty_2D_array() {
        int[][] result = solution.construct2DArray(new int[]{}, 1, 1);
        assertEquals(0, result.length);

        result = solution.construct2DArray(new int[]{1, 2}, 1, 1);
        assertEquals(0, result.length);
    }

    @Test
    void should_construct_2D_array_example1() {
        int[][] result = solution.construct2DArray(new int[]{1, 2, 3}, 1, 3);
        assertEquals(1, result.length);
        assertEquals(3, result[0].length);
    }

    @Test
    void should_construct_2D_array_example2() {
        int[][] result = solution.construct2DArray(new int[]{1, 2, 3, 4}, 2, 2);
        assertEquals(2, result.length);
        assertEquals(2, result[0].length);
        assertEquals(2, result[1].length);
    }

}