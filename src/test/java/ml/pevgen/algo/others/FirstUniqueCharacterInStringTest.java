package ml.pevgen.algo.others;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterInStringTest {

    private FirstUniqueCharacterInString firstUniqueCharacterInString;

    @BeforeEach
    void setUp() {
        firstUniqueCharacterInString = new FirstUniqueCharacterInString();
    }

    @Test
    void firstUniqChar() {
        // Test case 1: Empty string
        assertEquals(-1, firstUniqueCharacterInString.firstUniqChar(""));

        // Test case 2: Single character string
        assertEquals(0, firstUniqueCharacterInString.firstUniqChar("a"));

        // Test case 3: All characters are unique
        assertEquals(0, firstUniqueCharacterInString.firstUniqChar("abcde"));

        // Test case 4: First unique character at the beginning
        assertEquals(0, firstUniqueCharacterInString.firstUniqChar("leetcode"));

        // Test case 5: First unique character at the end
        assertEquals(2, firstUniqueCharacterInString.firstUniqChar("loveleetcode"));

        // Test case 6: No unique characters
        assertEquals(-1, firstUniqueCharacterInString.firstUniqChar("aabbcc"));
    }
}