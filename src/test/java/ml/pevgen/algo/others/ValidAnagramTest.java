package ml.pevgen.algo.others;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    private ValidAnagram solution;

    @BeforeEach
    void setUp() {
        solution = new ValidAnagram();
    }

    @Test
    void isAnagram_validAnagrams_returnsTrue() {
        assertTrue(solution.isAnagram("anagram", "nagaram"));
        assertTrue(solution.isAnagram("listen", "silent"));
        assertTrue(solution.isAnagram("abc", "cba"));
        assertTrue(solution.isAnagram("", ""));
    }

    @Test
    void isAnagram_notAnagrams_returnsFalse() {
        assertFalse(solution.isAnagram("rat", "car"));
        assertFalse(solution.isAnagram("hello", "world"));
        assertFalse(solution.isAnagram("abc", "abcd"));
        assertFalse(solution.isAnagram("abc", "abb"));
    }

    @Test
    void isAnagram_caseSensitive_returnsFalse() {
        assertFalse(solution.isAnagram("Abc", "abc"));
    }

    @Test
    void isAnagram_withSpecialCharacters_returnsTrue() {
        assertTrue(solution.isAnagram("a!b@c#", "c#b@a!"));
    }

    @Test
    void isAnagram_nullInputs_returnsFalse() {
        assertFalse(solution.isAnagram(null, "abc"));
        assertFalse(solution.isAnagram("abc", null));
        assertFalse(solution.isAnagram(null, null));
    }
}