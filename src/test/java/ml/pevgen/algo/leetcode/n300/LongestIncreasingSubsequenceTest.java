package ml.pevgen.algo.leetcode.n300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestIncreasingSubsequenceTest {

    private LongestIncreasingSubsequence solution;

    @BeforeEach
    void setUp() {
        solution = new LongestIncreasingSubsequence();
    }

    @Test
    void should_return_1_for_the_same_elements() {
        assertEquals(1, solution.lengthOfLIS(new int[]{7, 7, 7, 7, 7}));
    }

    @Test
    void should_return_result_example_1() {
        assertEquals(4, solution.lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}));
    }

    @Test
    void should_return_result_example_2() {
        assertEquals(4, solution.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }

}