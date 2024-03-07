package ml.pevgen.algo.n384;

import ml.pevgen.algo.leetcode.n384.ShuffleAnArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ShuffleAnArrayTest {

    @Test
    void should_return_the_same_array_after_reset() {
        int[] nums = new int[]{1, 2, 3};
        ShuffleAnArray obj = new ShuffleAnArray(nums);

        int[] param_2 = obj.shuffle();
        assertEquals(nums.length, param_2.length);

        int[] param_1 = obj.reset();
        assertArrayEquals(nums, param_1);
    }

}