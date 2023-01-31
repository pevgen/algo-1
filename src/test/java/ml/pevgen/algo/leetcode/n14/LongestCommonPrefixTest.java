package ml.pevgen.algo.leetcode.n14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixTest {

    private LongestCommonPrefix longestCommonPrefix;

    @BeforeEach
    void setUp() {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    void should_return_empty_for_empty() {
        assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{""}));
    }

    @Test
    void should_return_empty_if_no_common_prefix() {
        assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"aaaa", "bbb", "ccc"}));
    }

    @Test
    void should_return_common_prefix_for_the_same_strings() {
        assertEquals("aaaa", longestCommonPrefix.longestCommonPrefix(new String[]{"aaaa", "aaaa", "aaaa"}));
    }

    @Test
    void should_return_common_prefix_for_different_strings_with_the_same_length() {
        assertEquals("aaa", longestCommonPrefix.longestCommonPrefix(new String[]{"aaab", "aaac", "aaad"}));
    }

    @Test
    void should_return_common_prefix_for_different_strings_with_different_length() {
        assertEquals("aa", longestCommonPrefix.longestCommonPrefix(new String[]{"aaab", "aaac", "aad"}));
    }

}