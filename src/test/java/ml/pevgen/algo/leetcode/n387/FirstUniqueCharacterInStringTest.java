package ml.pevgen.algo.leetcode.n387;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstUniqueCharacterInStringTest {

    private FirstUniqueCharacterInString solution;

    @BeforeEach
    void setUp() {
        solution = new FirstUniqueCharacterInString();
    }

    @Test
    void should_return_minus_1_if_no_single_chars() {
        assertEquals(-1, solution.firstUniqChar("aabb"));

    }

    @Test
    void should_return_index_of_first_single_char() {
        assertEquals(0, solution.firstUniqChar("leetcode"));
        assertEquals(2, solution.firstUniqChar("loveleetcode"));
    }
}