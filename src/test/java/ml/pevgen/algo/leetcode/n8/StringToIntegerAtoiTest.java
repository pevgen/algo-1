package ml.pevgen.algo.leetcode.n8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringToIntegerAtoiTest {


    private StringToIntegerAtoi solution;

    @BeforeEach
    void setUp() {
        solution = new StringToIntegerAtoi();
    }

    @Test
    void should_return_number_from_only_one_digits() {
        assertEquals(1, solution.myAtoi("1"));
    }

    @Test
    void should_return_number_from_only_digits() {
        assertEquals(42, solution.myAtoi("42"));
    }

    @Test
    void should_return_number_from_digits_and_spaces() {
        assertEquals(-42, solution.myAtoi("   -42-"));
    }

    @Test
    void should_return_number_from_digits_with_words_at_the_end() {
        assertEquals(4193, solution.myAtoi("4193 with words"));
    }

    @Test
    void should_return_0_from_digits_with_words_at_the_start() {
        assertEquals(0, solution.myAtoi("words and 987"));
    }

    @Test
    void should_return_border_negative_value() {
        assertEquals(-2147483648, solution.myAtoi("-2147483648"));
    }

    @Test
    void should_return_too_long_value() {
        assertEquals(2147483647, solution.myAtoi("20000000000000000000"));
    }

    @Test
    void should_return_number_with_leading_zeroes() {
        assertEquals(12345678, solution.myAtoi("0000000000012345678"));
    }


}