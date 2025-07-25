package ml.pevgen.algo.others;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOf1BitsTest {

    private final NumberOf1Bits solution = new NumberOf1Bits();

    @Test
    void testZero() {
        assertEquals(0, solution.hammingWeight(0));
    }

    @Test
    void testOne() {
        assertEquals(1, solution.hammingWeight(1));
    }

    @Test
    void testPowerOfTwo() {
        assertEquals(1, solution.hammingWeight(8));
    }

    @Test
    void testMultipleBits() {
        assertEquals(3, solution.hammingWeight(11));
    }

    @Test
    void testMaxValue() {
        assertEquals(31, solution.hammingWeight(Integer.MAX_VALUE));
    }
}