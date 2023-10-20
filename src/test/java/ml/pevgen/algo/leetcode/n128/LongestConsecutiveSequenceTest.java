package ml.pevgen.algo.leetcode.n128;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestConsecutiveSequenceTest {

    private LongestConsecutiveSequence solution;

    @BeforeEach
    void setUp() {
        solution = new LongestConsecutiveSequence();
    }

    @Test
    void should_calculate_longest_consecutive_length_example_1() {
        assertEquals(4, solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }

    @Test
    void should_calculate_longest_consecutive_length_example_2() {
        assertEquals(9, solution.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }
}