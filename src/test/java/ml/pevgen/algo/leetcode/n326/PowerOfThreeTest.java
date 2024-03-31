package ml.pevgen.algo.leetcode.n326;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PowerOfThreeTest {

    private PowerOfThree solution;

    @BeforeEach
    void setUp() {
        solution = new PowerOfThree();
    }

    @Test
    void should_return_false() {
        assertFalse(solution.isPowerOfThree(0));
        assertFalse(solution.isPowerOfThree(6));
    }

    @Test
    void should_return_true() {
        assertTrue(solution.isPowerOfThree(1));
        assertTrue(solution.isPowerOfThree(3));
        assertTrue(solution.isPowerOfThree(27));
    }

}