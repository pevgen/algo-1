package ml.pevgen.algo.leetcode.n13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {

    private RomanToInteger romanToInteger;

    @BeforeEach
    void setUp() {
        romanToInteger = new RomanToInteger();
    }

    @Test
    void should_return_ones() {
        assertEquals(1, romanToInteger.romanToInt("I"));
        assertEquals(2, romanToInteger.romanToInt("II"));
        assertEquals(3, romanToInteger.romanToInt("III"));
    }

    @Test
    void should_return_simple_number_with_special_chars() {
        assertEquals(5, romanToInteger.romanToInt("V"));
        assertEquals(10, romanToInteger.romanToInt("X"));
        assertEquals(50, romanToInteger.romanToInt("L"));
        assertEquals(100, romanToInteger.romanToInt("C"));
        assertEquals(500, romanToInteger.romanToInt("D"));
        assertEquals(1000, romanToInteger.romanToInt("M"));
    }


    @Test
    void should_return_special_chars_and_one_right() {
        assertEquals(6, romanToInteger.romanToInt("VI"));
        assertEquals(17, romanToInteger.romanToInt("XVII"));
    }

    @Test
    void should_return_complex_number() {
        assertEquals(4, romanToInteger.romanToInt("IV"));
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));

    }

}