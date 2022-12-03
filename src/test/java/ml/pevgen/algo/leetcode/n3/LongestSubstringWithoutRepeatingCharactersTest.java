package ml.pevgen.algo.leetcode.n3;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {

    private LongestSubstringWithoutRepeatingCharacters cl;

    @BeforeEach
    void init() {
        cl = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    void test_no_repeatable() {
        assertEquals(6, cl.lengthOfLongestSubstring("asdfgh"));
    }

    @Test
    void test_repeatable_all() {
        assertEquals(1, cl.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void test_for_length_2() {
        assertEquals(2, cl.lengthOfLongestSubstring("cdd"));
        assertEquals(2, cl.lengthOfLongestSubstring("aab"));
    }

    @Test
    void test_for_length_3() {
        assertEquals(3, cl.lengthOfLongestSubstring("ohomm"));
        assertEquals(3, cl.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(3, cl.lengthOfLongestSubstring("pwwkew"));
        assertEquals(3, cl.lengthOfLongestSubstring("dvdf"));
    }


}