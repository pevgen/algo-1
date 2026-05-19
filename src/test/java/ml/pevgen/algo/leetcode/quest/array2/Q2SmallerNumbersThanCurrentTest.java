package ml.pevgen.algo.leetcode.quest.array2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Q2SmallerNumbersThanCurrentTest {

    private final Q2SmallerNumbersThanCurrent solution = new Q2SmallerNumbersThanCurrent();

    @Test
    void smallerNumbersThanCurrent() {
        assertArrayEquals(new int[]{4, 0, 1, 1, 3}, solution.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3}));
        assertArrayEquals(new int[]{2, 1, 0, 3}, solution.smallerNumbersThanCurrent(new int[]{6, 5, 4, 8}));
        assertArrayEquals(new int[]{0, 0, 0}, solution.smallerNumbersThanCurrent(new int[]{7, 7, 7}));
    }

}