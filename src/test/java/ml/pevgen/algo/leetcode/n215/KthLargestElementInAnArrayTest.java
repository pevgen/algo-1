package ml.pevgen.algo.leetcode.n215;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthLargestElementInAnArrayTest {

    private KthLargestElementInAnArray solution;

    @BeforeEach
    void setUp() {
        solution = new KthLargestElementInAnArray();
    }

    @Test
    void should_find_element_in_one_size_array() {
        assertEquals(3, solution.findKthLargest(new int[]{3}, 1));
    }

    @Test
    void should_find_element_example_1() {
        assertEquals(5, solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    @Test
    void should_find_element_example_2() {
        assertEquals(4, solution.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }

    @Test
    void should_find_element_example_3() {
        assertEquals(-1, solution.findKthLargest(new int[]{-1, -1}, 2));
    }

    @Test
    void should_find_element_example_4() {
        assertEquals(2, solution.findKthLargest(new int[]{-1, 2, 0}, 1));
    }
}