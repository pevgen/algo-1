package ml.pevgen.algo.leetcode.n461;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HammingDistanceTest {

    private HammingDistance solution;

    @BeforeEach
    void setUp() {
        solution = new HammingDistance();
    }

    @Test
    void should_return_hamming_distance() {
        assertEquals(0, solution.hammingDistance(0, 0));
        assertEquals(2, solution.hammingDistance(1, 4)); // 1(0 0 0 1); 4(0 1 0 0); diff: 2,4 bits
        assertEquals(1, solution.hammingDistance(1, 3)); // 1(0 0 0 1); 3(0 0 1 0); diff: 2 bit
    }
}