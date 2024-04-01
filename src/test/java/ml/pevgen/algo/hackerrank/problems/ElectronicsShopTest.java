package ml.pevgen.algo.hackerrank.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ElectronicsShopTest {

    private ElectronicsShop solution;

    @BeforeEach
    void setUp() {
        solution = new ElectronicsShop();
    }

    @Test
    void should_return_result() {

        assertEquals(9,
                solution.getMoneySpent(
                        new int[]{3, 1},
                        new int[]{5, 2, 8},
                        10));
    }

    @Test
    void should_return_unable_result() {
        assertEquals(-1,
                solution.getMoneySpent(
                        new int[]{5},
                        new int[]{4},
                        5));
    }

}