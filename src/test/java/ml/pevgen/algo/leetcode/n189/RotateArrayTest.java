package ml.pevgen.algo.leetcode.n189;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateArrayTest {

    private RotateArray solution;

    @BeforeEach
    void setUp() {
        solution = new RotateArray();
    }

    @Test
    void should_rotate_array_by_k_example_1() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        solution.rotate(arr, 3);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, arr);
    }

    @Test
    void should_rotate_array_by_k_example_2() {
        int[] arr = new int[]{-1, -100, 3, 99};
        solution.rotate(arr, 2);
        assertArrayEquals(new int[]{3, 99, -1, -100}, arr);
    }

    @Test
    void should_rotate_array_by_k_example_3() {
        int[] arr = new int[]{-1};
        solution.rotate(arr, 2);
        assertArrayEquals(new int[]{-1}, arr);
    }

}