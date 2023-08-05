package ml.pevgen.algo.leetcode.n392;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsSubsequenceTest {

    private IsSubsequence solution;

    @BeforeEach
    void setUp() {
        solution = new IsSubsequence();
    }

    @Test
    void should_check_seq_and_return_false() {
        assertFalse(solution.isSubsequence("axc", "ahbgdc"));
    }

    @Test
    void should_check_seq_and_return_tru() {

        assertTrue(solution.isSubsequence("", ""));
        assertTrue(solution.isSubsequence("abc", "ahbgdc"));
    }
}