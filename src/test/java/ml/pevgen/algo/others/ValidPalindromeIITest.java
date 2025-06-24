package ml.pevgen.algo.others;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeIITest {

    private ValidPalindromeII solution;

    @BeforeEach
    void setUp() {
        solution = new ValidPalindromeII();
    }

    @Test
    void should_return_true_for_string_as_is() {
        assertTrue(solution.validPalindrome("aba"));
        assertTrue(solution.validPalindrome("abba"));
        assertTrue(solution.validPalindrome("aa"));
    }

    @Test
    void should_return_true_if_delete_one_char() {
        assertTrue(solution.validPalindrome("abca"));
        assertTrue(solution.validPalindrome("eedede"));
        assertTrue(solution.validPalindrome("ajjua"));
        assertTrue(solution.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }

    @Test
    void should_return_false_if_not_a_palindrome() {
        assertFalse(solution.validPalindrome("abc"));
        assertFalse(solution.validPalindrome("eeccccbebaeeabebccceea"));
    }
}