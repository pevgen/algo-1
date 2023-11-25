package ml.pevgen.algo.leetcode.n703;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthLargestElementInAStreamTest {

    private KthLargestElementInAStream solution;

    @Test
    void should_return_element_example1() {
        solution = new KthLargestElementInAStream(3, new int[]{4, 5, 8, 2});
        assertEquals(4, solution.add(3));
        assertEquals(5, solution.add(5));
        assertEquals(5, solution.add(10));
        assertEquals(8, solution.add(9));
        assertEquals(8, solution.add(4));
    }

    @Test
    void should_return_element_example2() {
        solution = new KthLargestElementInAStream(3, new int[]{1, -7, 35, 2});
        assertEquals(2, solution.add(33));
    }
}