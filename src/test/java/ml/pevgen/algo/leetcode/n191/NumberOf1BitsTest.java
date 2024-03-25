package ml.pevgen.algo.leetcode.n191;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOf1BitsTest {

    private NumberOf1Bits solution;

    @BeforeEach
    void setUp() {
        solution = new NumberOf1Bits();
    }

    @Test
    void should_return_1_bits_count_example_1() {
        assertEquals(3, solution.hammingWeight(11));  // 1011
    }

    @Test
    void should_return_1_bits_count_example_2() {
        assertEquals(1, solution.hammingWeight(128)); //
    }

    @Test
    void should_return_1_bits_count_example_3() {
        assertEquals(30, solution.hammingWeight(2147483645)); // 1111111111111111111111111111101
    }

    @Test
    void should_return_1_bits_count_example_4() {
        assertEquals(1, solution.hammingWeight(1));  // 1
    }

}