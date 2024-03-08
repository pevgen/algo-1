package ml.pevgen.algo.leetcode.n122;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockIITest {

    private BestTimeToBuyAndSellStockII solution;

    @BeforeEach
    void setUp() {
        solution = new BestTimeToBuyAndSellStockII();
    }

    @Test
    void should_return_0_as_no_profit() {

        assertEquals(0, solution.maxProfit(new int[]{7, 6, 5, 4, 3}));
    }

    @Test
    void should_return_profit_example_1() {
        assertEquals(4, solution.maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void should_return_profit_example_2() {
        assertEquals(7, solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}