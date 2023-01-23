package ml.pevgen.algo.leetcode.n15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    private ThreeSum threeSum;

    @BeforeEach
    void init() {
        threeSum = new ThreeSum();
    }

    @Test
    void should_return_empty_list_for_null_and_empty_array() {
        assertNotNull(threeSum.threeSum(null));
        assertNotNull(threeSum.threeSum(new int[]{}));
        assertTrue(threeSum.threeSum(new int[]{}).isEmpty());
    }

    @Test
    void should_return_empty_list_if_not_zero_sum_triplet() {
        assertTrue(threeSum.threeSum(new int[]{0, 1, 1}).isEmpty());
    }

    @Test
    void should_return_zero_triplet_for_zeros_only() {
        int[] array = new int[]{0, 0, 0};
        assertEquals(1, threeSum.threeSum(array).size());
        assertArrayEquals(new Integer[]{0, 0, 0}, threeSum.threeSum(array).get(0).toArray());
    }


    @Test
    void should_return_one_triplet() {
        int[] array = new int[]{-1, 2, 5, -1};
        assertEquals(1, threeSum.threeSum(array).size());
        assertArrayEquals(new Integer[]{-1, -1, 2}, threeSum.threeSum(array).get(0).toArray());
    }

    @Test
    void should_return_triplets() {
        int[] array = new int[]{-1, 0, 1, 2, -1, -4};

        assertEquals(2, threeSum.threeSum(array).size());
        assertArrayEquals(new Integer[]{-1, 0, 1}, threeSum.threeSum(array).get(0).toArray());
        assertArrayEquals(new Integer[]{-1, -1, 2}, threeSum.threeSum(array).get(1).toArray());
    }

    @Test
    void should_return_triplets_2() {
        int[] array = new int[]{-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4};
        assertEquals(9, threeSum.threeSum(array).size());
    }

}