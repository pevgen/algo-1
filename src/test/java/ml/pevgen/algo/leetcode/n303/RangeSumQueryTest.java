package ml.pevgen.algo.leetcode.n303;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RangeSumQueryTest {

    @Test
    void should_return_correct_sums_of_ranges() {
        RangeSumQuery solution = new RangeSumQuery(new int[]{-2, 0, 3, -5, 2, -1});
        assertEquals(-2, solution.sumRange(0, 0));
        assertEquals(-2, solution.sumRange(0, 1));
        assertEquals(1, solution.sumRange(0, 2));
        assertEquals(-1, solution.sumRange(2, 5));
        assertEquals(0, solution.sumRange(2, 4));
        assertEquals(2, solution.sumRange(4, 4));
        assertEquals(-3, solution.sumRange(0, 5));
    }
}