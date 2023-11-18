package ml.pevgen.algo.leetcode.n56;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeIntervalsTest {

    private MergeIntervals solution;

    @BeforeEach
    void setUp() {
        solution = new MergeIntervals();
    }

    @Test
    void should_merge_intervals_example_1() {
        assertArrayEquals(new int[][]{{1, 5}}, solution.merge(new int[][]{{1, 4}, {4, 5}}));
    }

    @Test
    void should_merge_intervals_example_2() {
        assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}}, solution.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
    }

    @Test
    void should_merge_intervals_example_3() {
        assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}}, solution.merge(new int[][]{{2, 6}, {1, 3}, {15, 18}, {8, 10}}));
    }

    @Test
    void should_merge_intervals_example_4() {
        assertArrayEquals(new int[][]{{1, 4}}, solution.merge(new int[][]{{1, 4}, {2, 3}}));
    }

    @Test
    void should_merge_intervals_just_one() {
        assertArrayEquals(new int[][]{{1, 6}}, solution.merge(new int[][]{{1, 6}}));
    }

}