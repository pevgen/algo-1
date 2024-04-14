package ml.pevgen.algo.leetcode.n190;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseBitsTest {

    private ReverseBits solution;

    @BeforeEach
    void setUp() {
        solution = new ReverseBits();
    }

    @Test
    void should_reverse_bit() {
        assertEquals(964176192, solution.reverseBits(43261596));
        assertEquals(-1073741825, solution.reverseBits(-3));
    }
}