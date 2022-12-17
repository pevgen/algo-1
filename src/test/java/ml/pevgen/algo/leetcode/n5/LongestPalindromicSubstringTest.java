package ml.pevgen.algo.leetcode.n5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.AnyOf.anyOf;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LongestPalindromicSubstringTest {

    private LongestPalindromicSubstring cl;

    @BeforeEach
    void init() {
        cl = new LongestPalindromicSubstring();
    }

    @Test
    void test_1() {
        assertThat(cl.longestPalindrome("babad"), anyOf(is("bab"), is("aba")));
    }

    @Test
    void test_2() {
        assertEquals("cc", cl.longestPalindrome("ccd"));
        assertThat(cl.longestPalindrome("abada"), anyOf(is("ada"), is("aba")));
    }

    @Test
    void test_3() {
        assertEquals("bb", cl.longestPalindrome("cbbd"));
    }

    @Test
    void test_4() {
        assertEquals("a", cl.longestPalindrome("abc"));
    }

    @Test
    void test_5() {
        assertEquals("aaakaaa", cl.longestPalindrome("aaccaaakaaakbd"));
    }


    @Test
    void test_one_char() {
        assertEquals("b", cl.longestPalindrome("b"));
    }

    @Test
    void test_tho_the_same_chars() {
        assertEquals("bb", cl.longestPalindrome("bb"));
    }

    @Test
    void test_full_string_even() {
        assertEquals("qwertyytrewq", cl.longestPalindrome("qwertyytrewq"));
    }

    @Test
    void test_full_string_odd() {
        assertEquals("qwertytrewq", cl.longestPalindrome("qwertytrewq"));
    }

    @Test
    void test_null_string() {
        assertNull(cl.longestPalindrome(null));
    }

    @Test
    void test_empty_string() {
        assertEquals("", cl.longestPalindrome(""));
    }


    @Test
    void test_palindromic_from_center(){
        assertEquals("", cl.getPalindromeFromCenter("", 0,0));
        assertEquals("a", cl.getPalindromeFromCenter("a", 0,0));
        assertEquals("a", cl.getPalindromeFromCenter("ab", 0,0));
        assertEquals("", cl.getPalindromeFromCenter("ab", 0,1));
        assertEquals("aba", cl.getPalindromeFromCenter("aba", 1,1));
        assertEquals("abba", cl.getPalindromeFromCenter("abba", 1,2));
        assertEquals("abba", cl.getPalindromeFromCenter("xabba", 2,3));
        assertEquals("abba", cl.getPalindromeFromCenter("abbay", 1,2));
        assertEquals("abba", cl.getPalindromeFromCenter("xabbay", 2,3));
        assertEquals("b", cl.getPalindromeFromCenter("xabbay", 2,2));
    }

}