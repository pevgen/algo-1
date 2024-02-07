package ml.pevgen.algo.leetcode.n344;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseStringTest {


    private ReverseString solution;

    @BeforeEach
    void setUp() {
        solution = new ReverseString();
    }

    @Test
    void should_reverse_char_array() {
        char[] array = new char[]{'H', 'e', 'l', 'l', 'o'};
        solution.reverseString(array);
        Assertions.assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'H'}, array);
    }
}