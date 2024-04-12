package ml.pevgen.algo.leetcode.n198;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HouseRobberTest {

    private HouseRobber solution;

    @BeforeEach
    void setUp() {
        solution = new HouseRobber();
    }

    @Test
    void should_count_max_sum_of_rob() {
        assertEquals(17, solution.rob(new int[]{17}));
        assertEquals(4, solution.rob(new int[]{1, 2, 3, 1}));
        assertEquals(4, solution.rob(new int[]{2, 1, 1, 2}));
        assertEquals(12, solution.rob(new int[]{2, 7, 9, 3, 1}));
        assertEquals(103, solution.rob(new int[]{1, 3, 1, 3, 100}));
    }
}