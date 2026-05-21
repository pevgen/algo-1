package ml.pevgen.algo.leetcode.quest.stack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class Q1BuildAnArrayWithStackOperationsTest {

    private final Q1BuildAnArrayWithStackOperations solution = new Q1BuildAnArrayWithStackOperations();

    @Test
    void buildArray() {
        assertIterableEquals(List.of("Push", "Push", "Pop", "Push"), solution.buildArray(new int[]{1, 3}, 3));
        assertIterableEquals(List.of("Push", "Push", "Push"), solution.buildArray(new int[]{1, 2, 3}, 3));
        assertIterableEquals(List.of("Push", "Push"), solution.buildArray(new int[]{1, 2}, 4));
    }
}