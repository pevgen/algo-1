package ml.pevgen.algo.hackerrank.w1.d4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecursiveDigitSumTest {

    private RecursiveDigitSum recursiveDigitSum;

    @BeforeEach
    void setUp() {
        recursiveDigitSum = new RecursiveDigitSum();
    }

    @Test
    void should_return_the_same_number_for_one_digit_number() {
        assertEquals(4, recursiveDigitSum.superDigit("4", 1));
    }

    @Test
    void should_return_example() {

        assertEquals(4, recursiveDigitSum.superDigit("148", 1));

        assertEquals(8, recursiveDigitSum.superDigit("9875", 4));
    }


}