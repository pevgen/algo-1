package ml.pevgen.algo.leetcode.n204;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountPrimesTest {

    private CountPrimes solution;

    @BeforeEach
    void setUp() {
        solution = new CountPrimes();
    }

    @Test
    void should_count_primes_for_small_values() {
        assertEquals(0, solution.countPrimes(0));
        assertEquals(0, solution.countPrimes(1));
        assertEquals(0, solution.countPrimes(2));
        assertEquals(1, solution.countPrimes(3));
    }

    @Test
    void should_count_primes_for_usual_values() {
        assertEquals(2, solution.countPrimes(5)); // 2, 3
        assertEquals(4, solution.countPrimes(10)); // 2, 3, 5, 7
    }

}