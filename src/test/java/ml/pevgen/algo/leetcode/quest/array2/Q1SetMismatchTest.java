package ml.pevgen.algo.leetcode.quest.array2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Q1SetMismatchTest {

    private final Q1SetMismatch solution = new Q1SetMismatch();

    @Test
    void findErrorNums() {

        assertArrayEquals(new int[]{1, 2}, solution.findErrorNums(new int[]{1, 1}));
        assertArrayEquals(new int[]{2, 3}, solution.findErrorNums(new int[]{1, 2, 2, 4}));
        assertArrayEquals(new int[]{3, 1}, solution.findErrorNums(new int[]{3, 2, 3, 4, 6, 5}));
        assertArrayEquals(new int[]{2, 10}, solution.findErrorNums(new int[]{1, 5, 3, 2, 2, 7, 6, 4, 8, 9}));

    }
}