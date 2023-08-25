package ml.pevgen.algo.leetcode.n238;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductOfArrayExceptSelfTest {

    private ProductOfArrayExceptSelf solution;

    @BeforeEach
    void setUp() {
        solution = new ProductOfArrayExceptSelf();
    }

    @Test
    void should_return_result_array_for_simple_array() {
        assertArrayEquals(new int[]{2, 1}, solution.productExceptSelf(new int[]{1, 2}));
    }

    @Test
    void should_return_result_array_for_example_1() {
        assertArrayEquals(new int[]{24, 12, 8, 6}, solution.productExceptSelf(new int[]{1, 2, 3, 4}));
    }

    @Test
    void should_return_result_array_for_example_2() {
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, solution.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
    }

}