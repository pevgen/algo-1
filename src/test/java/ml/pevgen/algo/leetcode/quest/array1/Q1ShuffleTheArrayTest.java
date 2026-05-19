package ml.pevgen.algo.leetcode.quest.array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Q1ShuffleTheArrayTest {

    Q1ShuffleTheArray solution = new Q1ShuffleTheArray();

    @Test
    void shuffle() {
        assertArrayEquals(new int[]{2, 3, 5, 4, 1, 7}, solution.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3));
    }
}