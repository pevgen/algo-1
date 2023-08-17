package ml.pevgen.algo.algo1.permutations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CharPermutationsTest {

    private CharPermutations solution;

    @BeforeEach
    void setUp() {
        solution = new CharPermutations();
    }

    @Test
    void should_transpose_1_char() {
        List<String> result = solution.transposeChars("a");
        assertEquals(1, result.size());
        assertEquals("a", result.get(0));
    }

    @Test
    void should_transpose_2_chars() {
        List<String> result = solution.transposeChars("ab");
        assertEquals(2, result.size());
        assertTrue(result.contains("ab"));
        assertTrue(result.contains("ba"));
    }

    @Test
    void should_transpose_3_chars() {
        List<String> result = solution.transposeChars("abc");
        assertEquals(6, result.size());
        assertTrue(result.contains("abc"));
        assertTrue(result.contains("acb"));

        assertTrue(result.contains("bac"));
        assertTrue(result.contains("bca"));

        assertTrue(result.contains("cab"));
        assertTrue(result.contains("cba"));

    }

}