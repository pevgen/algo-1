package ml.pevgen.algo.leetcode.n1207;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UniqueNumberOfOccurrencesTest {

    private UniqueNumberOfOccurrences solution;

    @BeforeEach
    void setUp() {
        solution = new UniqueNumberOfOccurrences();
    }

    @Test
    void should_return_false() {
        assertFalse(solution.uniqueOccurrences(new int[]{1, 2}));
        assertFalse(solution.uniqueOccurrences(new int[]{3, 5, -2, -3, -6, -6}));

    }

    @Test
    void should_return_true() {
        assertTrue(solution.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
        assertTrue(solution.uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
    }
}