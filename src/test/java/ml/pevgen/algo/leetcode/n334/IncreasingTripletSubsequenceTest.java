package ml.pevgen.algo.leetcode.n334;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IncreasingTripletSubsequenceTest {

    private IncreasingTripletSubsequence solution;

    @BeforeEach
    void setUp() {
        solution = new IncreasingTripletSubsequence();
    }

    @Test
    void should_return_true_if_increasing_triplet_exists() {
        assertTrue(solution.increasingTriplet(new int[]{20, 100, 10, 12, 5, 13}));
        assertTrue(solution.increasingTriplet(new int[]{1, 2, 3, 7, 99}));
        assertTrue(solution.increasingTriplet(new int[]{100, 123, 1, 2, 3}));
        assertTrue(solution.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
        assertTrue(solution.increasingTriplet(new int[]{-5, 1, 0, 3, 2}));
    }

    @Test
    void should_return_false_if_short_size() {
        assertFalse(solution.increasingTriplet(new int[]{1, 2}));
    }

    @Test
    void should_return_false_if_increasing_triplet_doesnt_exists() {
        assertFalse(solution.increasingTriplet(new int[]{1, 1, -2, 6}));
        assertFalse(solution.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
        assertFalse(solution.increasingTriplet(new int[]{3, 2, 1, -5}));
        assertFalse(solution.increasingTriplet(new int[]{2, 3, 1}));
    }
}