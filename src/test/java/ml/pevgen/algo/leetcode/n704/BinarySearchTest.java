package ml.pevgen.algo.leetcode.n704;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    private BinarySearch solution;

    @BeforeEach
    void setUp() {
        solution = new BinarySearch();
    }

    @Test
    void should_find_correct_number_for_single_number() {
        assertEquals(0, solution.search(new int[]{0}, 0));
    }

    @Test
    void should_return_correct_response_for_absent_target() {
        assertEquals(-1, solution.search(new int[]{1,3,5}, 4));
        assertEquals(-1, solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
        assertEquals(-1, solution.search(new int[]{0}, -1));
    }

    @Test
    void should_find_correct_number() {
        assertEquals(4, solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

}