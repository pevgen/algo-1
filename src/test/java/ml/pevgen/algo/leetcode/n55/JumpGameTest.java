package ml.pevgen.algo.leetcode.n55;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JumpGameTest {

    private JumpGame solution;

    @BeforeEach
    void setUp() {
        solution = new JumpGame();
    }

    @Test
    void should_return_true() {
        assertTrue(solution.canJump(new int[]{1, 1, 2, 2, 0, 1, 1}));
        assertTrue(solution.canJump(new int[]{2, 0, 0}));
        assertTrue(solution.canJump(new int[]{0}));
        assertTrue(solution.canJump(new int[]{1}));
        assertTrue(solution.canJump(new int[]{2, 5, 0, 0}));
        assertTrue(solution.canJump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    void should_return_false() {
        assertFalse(solution.canJump(new int[]{3, 2, 1, 0, 4}));
    }
}