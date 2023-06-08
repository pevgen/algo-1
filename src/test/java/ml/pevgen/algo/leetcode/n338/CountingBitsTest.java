package ml.pevgen.algo.leetcode.n338;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CountingBitsTest {

    private CountingBits solution;

    @BeforeEach
    void setUp() {
        solution = new CountingBits();
    }

    @Test
    void should_count_bits() {
        assertArrayEquals(new int[]{0, 1, 1}, solution.countBits(2));
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, solution.countBits(5));
    }
}