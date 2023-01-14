package ml.pevgen.algo.leetcode.n11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {

    private ContainerWithMostWater cnt;

    @BeforeEach
    void init() {
        cnt = new ContainerWithMostWater();
    }

    @Test
    void should_return_zero_for_null_or_empty_height() {
        Assertions.assertEquals(0, cnt.maxArea(null));
        Assertions.assertEquals(0, cnt.maxArea(new int[]{}));
        Assertions.assertEquals(0, cnt.maxArea(new int[]{1}));
    }

    @Test
    void should_return_one() {
        Assertions.assertEquals(1, cnt.maxArea(new int[]{1, 1}));
    }

    @Test
    void should_return_real_result() {
        Assertions.assertEquals(49, cnt.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }


}