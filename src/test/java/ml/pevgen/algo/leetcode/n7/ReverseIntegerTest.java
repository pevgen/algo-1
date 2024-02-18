package ml.pevgen.algo.leetcode.n7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerTest {

    private ReverseInteger solution;

    @BeforeEach
    void setUp() {
        solution = new ReverseInteger();
    }

    @Test
    void should_reverse_positive_int() {
        assertEquals(321, solution.reverse(123));
    }

    @Test
    void should_reverse_positive_int_outside_int_range() {
        assertEquals(0, solution.reverse(1534236469));
    }


    @Test
    void should_reverse_negative_int() {
        assertEquals(-321, solution.reverse(-123));
    }

    @Test
    void should_reverse_negative_int_outside_int_range() {
        assertEquals(0, solution.reverse(-2147483648));
    }


    @Test
    void should_reverse_positive_int_with_trailing_zeros() {
        assertEquals(21, solution.reverse(1200));
    }

    @Test
    void should_reverse_negative_int_with_trailing_zeros() {
        assertEquals(-21, solution.reverse(-1200));
    }

    @Test
    void should_return_zero_for_input_zero() {
        assertEquals(0, solution.reverse(0));
    }
}