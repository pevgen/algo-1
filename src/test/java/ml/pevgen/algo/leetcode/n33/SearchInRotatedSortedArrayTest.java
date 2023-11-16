package ml.pevgen.algo.leetcode.n33;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInRotatedSortedArrayTest {

    private SearchInRotatedSortedArray solution;

    @BeforeEach
    void setUp() {
        solution = new SearchInRotatedSortedArray();
    }

    @Test
    void should_not_find_target() {
        assertEquals(-1, solution.search(new int[]{}, 1));
        assertEquals(-1, solution.search(new int[]{1}, 2));
        assertEquals(-1, solution.search(new int[]{1, 3}, 2));
        assertEquals(-1, solution.search(new int[]{1, 3, 4}, 2));
        assertEquals(-1, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));

    }

    @Test
    void should_find_target_for_non_increasing_even_seq() {
        assertEquals(2, solution.search(new int[]{7, 0, 1, 2}, 1));
        assertEquals(4, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        assertEquals(0, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 4));
        assertEquals(1, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 5));
        assertEquals(6, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 2));
        assertEquals(5, solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 1));
    }

    @Test
    void should_find_target_for_non_increasing_odd_seq() {
        assertEquals(0, solution.search(new int[]{4, 5, 6, 7, 8, 0, 1, 2}, 4));
        assertEquals(7, solution.search(new int[]{4, 5, 6, 7, 8, 0, 1, 2}, 2));
        assertEquals(3, solution.search(new int[]{4, 5, 6, 7, 8, 0, 1, 2}, 7));
        assertEquals(6, solution.search(new int[]{4, 5, 6, 7, 8, 0, 1, 2}, 1));
    }

    @Test
    void should_find_target_for_increasing_seq() {
        assertEquals(2, solution.search(new int[]{1, 2, 3, 4, 5}, 3));
    }

}