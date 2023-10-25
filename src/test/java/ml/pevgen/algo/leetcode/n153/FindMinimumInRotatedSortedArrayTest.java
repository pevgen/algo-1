package ml.pevgen.algo.leetcode.n153;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMinimumInRotatedSortedArrayTest {

    private FindMinimumInRotatedSortedArray solution;

    @BeforeEach
    void setUp() {
        solution = new FindMinimumInRotatedSortedArray();
    }

    @Test
    void should_find_min_example_1() {
        assertEquals(11, solution.findMin(new int[]{11, 13, 15, 17}));

    }

    @Test
    void should_find_min_example_2() {
        assertEquals(1, solution.findMin(new int[]{3, 4, 5, 1, 2}));

    }

    @Test
    void should_find_min_example_3() {
        assertEquals(0, solution.findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
    }

    @Test
    void should_find_min_example_4() {
        assertEquals(0, solution.findMin(new int[]{4, 5, 6, 7, 8, 0, 1, 2}));
    }

    @Test
    void should_find_min_example_5() {
        assertEquals(1, solution.findMin(new int[]{5, 1, 2, 3, 4}));
    }

    @Test
    void should_find_min_example_6() {
        assertEquals(1, solution.findMin(new int[]{4, 5, 6, 1, 2, 3}));
    }

}