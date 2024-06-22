package ml.pevgen.algo.leetcode.n162;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindPeakElementTest {

    private FindPeakElement solution;

    @BeforeEach
    void setUp() {
        solution = new FindPeakElement();
    }

    @Test
    void should_return_zero_for_one_element() {
        assertEquals(0, solution.findPeakElement(new int[]{3}));
    }

    @Test
    void should_return_zero_for_decreasing_sequence() {
        assertEquals(0, solution.findPeakElement(new int[]{3, 2, 1}));
    }

    @Test
    void should_return_last_index_for_increasing_sequence() {
        assertEquals(2, solution.findPeakElement(new int[]{1, 2, 3}));
    }

    @Test
    void should_return_correct_index_for_peak_example_1() {
        assertEquals(2, solution.findPeakElement(new int[]{1, 2, 3, 1}));
    }

    //    @Test
    void should_return_correct_index_for_peak_example_2_bruteforce() {
        assertEquals(1, solution.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
    }

    @Test
    void should_return_correct_index_for_peak_example_2_binary() {
        assertEquals(5, solution.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
    }

}