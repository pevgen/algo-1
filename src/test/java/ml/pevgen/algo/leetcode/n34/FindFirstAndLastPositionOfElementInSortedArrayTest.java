package ml.pevgen.algo.leetcode.n34;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindFirstAndLastPositionOfElementInSortedArrayTest {

    private FindFirstAndLastPositionOfElementInSortedArray solution;

    @BeforeEach
    void setUp() {
        solution = new FindFirstAndLastPositionOfElementInSortedArray();
    }

    @Test
    void should_return_minus_one_if_target_not_exists() {
        assertArrayEquals(new int[]{-1, -1}, solution.searchRange(new int[]{}, 0));
        assertArrayEquals(new int[]{-1, -1}, solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6));
    }


    @Test
    void should_return_edge_cases() {
        assertArrayEquals(new int[]{0, 0}, solution.searchRange(new int[]{1}, 1));
        assertArrayEquals(new int[]{0, 1}, solution.searchRange(new int[]{1, 1}, 1));
    }
    @Test
    void should_return_range_example_2() {
        assertArrayEquals(new int[]{2, 4}, solution.searchRange(new int[]{5, 7, 8, 8, 8, 10, 11, 12}, 8));
    }

}