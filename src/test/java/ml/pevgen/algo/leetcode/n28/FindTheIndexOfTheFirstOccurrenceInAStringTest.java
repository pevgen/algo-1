package ml.pevgen.algo.leetcode.n28;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    private FindTheIndexOfTheFirstOccurrenceInAString solution;

    @BeforeEach
    void setUp() {
        solution = new FindTheIndexOfTheFirstOccurrenceInAString();
    }

    @Test
    void should_return_minus_one_if_not_found() {
        assertEquals(-1, solution.strStr("", "123"));
        assertEquals(-1, solution.strStr("qwerty", "123"));
        assertEquals(-1, solution.strStr("leetcode", "leeto"));
        assertEquals(-1, solution.strStr("aa", "aaa"));
        assertEquals(-1, solution.strStr("mississippi", "issipi"));
    }

    @Test
    void should_return_position() {
        assertEquals(2, solution.strStr("qw123erty", "123"));
        assertEquals(0, solution.strStr("sadbutsad", "sad"));
        assertEquals(4, solution.strStr("mississippi", "issip"));
    }

}