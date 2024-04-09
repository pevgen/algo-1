package ml.pevgen.algo.leetcode.n17;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LetterCombinationsOfAPhoneNumberTest {

    private LetterCombinationsOfAPhoneNumber solution;

    @BeforeEach
    void setUp() {
        solution = new LetterCombinationsOfAPhoneNumber();
    }

    @Test
    void should_return_empty() {
        assertTrue(solution.letterCombinations("").isEmpty());
    }

    @Test
    void should_return_list_of_one_char() {
        List<String> result = solution.letterCombinations("2");
        assertEquals(3, result.size());
        assertEquals("a", result.get(0));
        assertEquals("b", result.get(1));
        assertEquals("c", result.get(2));
    }

    @Test
    void should_return_list_of_char_permutations() {
        List<String> result = solution.letterCombinations("23");
        //"ad","ae","af","bd","be","bf","cd","ce","cf"
        assertEquals(9, result.size());
        assertEquals("ad", result.get(0));
        assertEquals("ae", result.get(1));
        assertEquals("af", result.get(2));
        assertEquals("bd", result.get(3));
        assertEquals("be", result.get(4));
        assertEquals("bf", result.get(5));
        assertEquals("cd", result.get(6));
        assertEquals("ce", result.get(7));
        assertEquals("cf", result.get(8));
    }

}