package ml.pevgen.algo.leetcode.n278;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstBadVersionTest {

    private FirstBadVersion solution;

    @Test
    void should_return_1_for_one_version() {
        solution = new FirstBadVersion(1);
        assertEquals(1, solution.firstBadVersion(1));
    }

    @Test
    void should_return_right_n_for_right_border_bad_version() {
        solution = new FirstBadVersion(5);
        assertEquals(5, solution.firstBadVersion(5));
    }

    @Test
    void should_return_1_for_left_border_bad_version() {
        solution = new FirstBadVersion(1);
        assertEquals(1, solution.firstBadVersion(5));
    }

}