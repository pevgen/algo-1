package ml.pevgen.algo.leetcode.n172;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTrailingZeroesTest {

    private FactorialTrailingZeroes solution;

    @BeforeEach
    void setUp() {
        solution = new FactorialTrailingZeroes();
    }

    @Test
    void should_return_0_for_edge_cases() {
        assertEquals(0, solution.trailingZeroes(0));
        assertEquals(0, solution.trailingZeroes(1));
        assertEquals(0, solution.trailingZeroes(2));
        assertEquals(0, solution.trailingZeroes(3));
        assertEquals(0, solution.trailingZeroes(4));
    }

    @Test
    void should_return_1() {
        assertEquals(1, solution.trailingZeroes(5));
        assertEquals(1, solution.trailingZeroes(6));
        assertEquals(1, solution.trailingZeroes(7));
        assertEquals(1, solution.trailingZeroes(8));
        assertEquals(1, solution.trailingZeroes(9));

    }

    @Test
    void should_return_zeros_count() {
        assertEquals(2, solution.trailingZeroes(10));
        assertEquals(7, solution.trailingZeroes(30));

    }

}