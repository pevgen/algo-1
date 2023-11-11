package ml.pevgen.algo.leetcode.n567;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PermutationInStringTest {

    private PermutationInString solution;

    @BeforeEach
    void setUp() {
        solution = new PermutationInString();
    }

    @Test
    void should_return_false() {
        assertFalse(solution.checkInclusion("ab", "eidboaoo"));
    }

    @Test
    void should_return_true() {
        assertTrue(solution.checkInclusion("ab", "eidbaooo"));
    }
}