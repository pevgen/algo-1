package ml.pevgen.algo.others;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {
    
    private final FindTheIndexOfTheFirstOccurrenceInAString solution = new FindTheIndexOfTheFirstOccurrenceInAString();
    
    @Test
    void testBasicMatch() {
        assertEquals(0, solution.strStr("sadbutsad", "sad"));
        assertEquals(2, solution.strStr("hello", "ll"));
        assertEquals(4, solution.strStr("mississippi", "issip"));
        assertEquals(9, solution.strStr("mississippi", "pi"));
    }
    
    @Test
    void testNoMatch() {
        assertEquals(-1, solution.strStr("leetcode", "leeto"));
        assertEquals(-1, solution.strStr("hello", "world"));
    }
    
    @Test
    void testEmptyHaystack() {
        assertEquals(-1, solution.strStr("", "a"));
    }
    
    @Test
    void testSingleCharacter() {
        assertEquals(0, solution.strStr("a", "a"));
        assertEquals(-1, solution.strStr("a", "b"));
    }
    
    @Test
    void testNeedleLongerThanHaystack() {
        assertEquals(-1, solution.strStr("ab", "abc"));
    }
    
    @Test
    void testRepeatingPatterns() {
        assertEquals(0, solution.strStr("aaabaaab", "aaab"));
        assertEquals(0, solution.strStr("aaa", "a"));
    }
}