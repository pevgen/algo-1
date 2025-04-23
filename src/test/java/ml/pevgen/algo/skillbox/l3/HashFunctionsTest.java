package ml.pevgen.algo.skillbox.l3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HashFunctionsTest {

    private HashFunctions solution;

    @BeforeEach
    void setUp() {
        solution = new HashFunctions();
    }

    @Test
    void should_return_sum_of_chars() {
        assertEquals(97, solution.hashFromChars("a"));
        assertEquals(98, solution.hashFromChars("b"));
        assertEquals(99, solution.hashFromChars("c"));
        assertEquals(97 + 98 + 99, solution.hashFromChars("abc"));
    }

    @Test
    void should_return_multiple_of_digits() {
        assertEquals(1, solution.hashFromIntDigits(1));
        assertEquals(6, solution.hashFromIntDigits(23));
        assertEquals(24, solution.hashFromIntDigits(1234));
        assertEquals(60, solution.hashFromIntDigits(345));
    }

    @Test
    void should_return_hash_of_object() {
        assertEquals(1, solution.hashFromObject(new Student("a", 1))); // 97 & 1
        assertEquals( 6, solution.hashFromObject(new Student("abc", 23))); // 295 & 6
    }
}