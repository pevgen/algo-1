package ml.pevgen.algo.leetcode.n350;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class IntersectionOfTwoArraysIITest {

    private IntersectionOfTwoArraysII solution;

    @BeforeEach
    void setUp() {
        solution = new IntersectionOfTwoArraysII();
    }

    @Test
    void should_find_intersect() {
        assertArrayEquals(
                new int[]{4, 9},
                solution.intersect(
                        new int[]{4, 9, 5},
                        new int[]{9, 4, 9, 8, 4}));

        assertArrayEquals(
                new int[]{2, 2},
                solution.intersect(
                        new int[]{1, 2, 2, 1},
                        new int[]{2, 2}));

    }

    @Test
    void should_return_empty_if_no_intersection() {
        assertArrayEquals(
                new int[]{},
                solution.intersect(
                        new int[]{1, 3, 5},
                        new int[]{2, 4}));
    }
}