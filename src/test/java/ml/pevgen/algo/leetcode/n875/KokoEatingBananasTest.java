package ml.pevgen.algo.leetcode.n875;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KokoEatingBananasTest {

    private KokoEatingBananas solution;

    @BeforeEach
    void setUp() {
        solution = new KokoEatingBananas();
    }

    @Test
    void should_return_min_eating_speed_example_1() {
        assertEquals(4, solution.minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
    }

    @Test
    void should_return_min_eating_speed_example_2() {
        assertEquals(30, solution.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5));
    }

    @Test
    void should_return_min_eating_speed_example_3() {
        assertEquals(23, solution.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6));
    }

}