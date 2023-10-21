package ml.pevgen.algo.leetcode.n424;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestRepeatingCharacterReplacementTest {

    private LongestRepeatingCharacterReplacement solution;

    @BeforeEach
    void setUp() {
        solution = new LongestRepeatingCharacterReplacement();
    }

    @Test
    void should_seqLength() {
        assertEquals(4, solution.seqLength("ABAB", 1, 2));
        assertEquals(4, solution.seqLength("AABABBA", 1, 1));
        assertEquals(4, solution.seqLength("AABABBA", 1, 1));
        assertEquals(4, solution.seqLength("ABAB", 0, 2));
        assertEquals(4, solution.seqLength("AABABBA", 0, 1));
    }

    @Test
    void should_return_repeating_character_length_example_1() {
        assertEquals(4, solution.characterReplacement("ABAB", 2));
    }

    @Test
    void should_return_repeating_character_length_example_2() {
        assertEquals(4, solution.characterReplacement("AABABBA", 1));
    }
}