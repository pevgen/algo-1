package ml.pevgen.algo.leetcode.n70;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ClimbingStairsTest {


    private ClimbingStairs solution;

    @BeforeEach
    void setUp() {
        solution = new ClimbingStairs();
    }

    @Test
    void climbStairs_simple() {
        assertEquals(1, solution.calculateStepsMemoization(1));
        assertEquals(2, solution.calculateStepsMemoization(2));
        assertEquals(3, solution.calculateStepsMemoization(3));
        assertEquals(5, solution.calculateStepsMemoization(4));
    }
    @Test
    void climbStairs_time_limit() {
        assertEquals(1836311903, solution.calculateStepsMemoization(45));
    }

}