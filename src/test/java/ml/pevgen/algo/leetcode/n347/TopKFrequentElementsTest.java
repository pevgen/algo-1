package ml.pevgen.algo.leetcode.n347;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TopKFrequentElementsTest {

    private TopKFrequentElements solution;

    @BeforeEach
    void setUp() {
        solution = new TopKFrequentElements();
    }

    @Test
    void should_return_one_element() {
        assertArrayEquals(new int[]{1}, solution.topKFrequent(new int[]{1}, 1));
    }

    @Test
    void should_return_k_elements() {
        assertArrayEquals(new int[]{2, 1}, solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2));
        assertArrayEquals(new int[]{-1}, solution.topKFrequent(new int[]{-1, -1, -2, 3}, 1));
    }
}