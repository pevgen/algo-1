package ml.pevgen.algo.hackerrank.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalesByMatchTest {

    private SalesByMatch salesByMatch;

    @BeforeEach
    void setUp() {
        salesByMatch = new SalesByMatch();
    }

    @Test
    void sockMerchant() {
        assertEquals(2, salesByMatch.sockMerchant(7, List.of(1, 2, 1, 2, 1, 3, 2)));
        assertEquals(3, salesByMatch.sockMerchant(7, List.of(10, 20, 20, 10, 10, 30, 50, 10, 20)));
    }
}