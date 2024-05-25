package ml.pevgen.algo.leetcode.n2384;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestPalindromicNumberTest {

    private LargestPalindromicNumber solution;

    @BeforeEach
    void setUp() {
        solution = new LargestPalindromicNumber();
    }

    @Test
    void should_return_just_one_digit() {
        assertEquals("9", solution.largestPalindromic("00009"));
    }

    @Test
    void should_return_largest_palindromic_number() {
        assertEquals("7449447", solution.largestPalindromic("444947137"));
    }

    @Test
    void should_return_largest_palindromic_number_with_zeroes() {
        assertEquals("1005001", solution.largestPalindromic("00001105"));
    }

    @Test
    void should_return_largest_palindromic_number_only_zeroes() {
        assertEquals("0", solution.largestPalindromic("00000"));
    }

    @Test
    void should_return_largest_palindromic_number_zeroes_plus_1() {
        assertEquals("1", solution.largestPalindromic("0001"));
    }


}