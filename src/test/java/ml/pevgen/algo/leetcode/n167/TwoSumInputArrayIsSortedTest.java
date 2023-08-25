package ml.pevgen.algo.leetcode.n167;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumInputArrayIsSortedTest {

    private TwoSumInputArrayIsSorted solution;

    @BeforeEach
    void setUp() {
        solution = new TwoSumInputArrayIsSorted();
    }

    @Test
    void should_return_indexes_example_1() {
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void should_return_indexes_example_2() {
        assertArrayEquals(new int[]{1, 3}, solution.twoSum(new int[]{2, 3, 4}, 6));
    }

    @Test
    void should_return_indexes_example_3() {
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{-1, 0}, -1));
    }

}