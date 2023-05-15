package ml.pevgen.algo.hackerrank.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThePowerSumTest {

    private ThePowerSum powerSum;

    @BeforeEach
    void setUp() {
        powerSum = new ThePowerSum();
    }

    @Test
    void should_return_number_of_combinations() {
        assertEquals(1, powerSum.powerSum(10, 2));
        assertEquals(1, powerSum.powerSum(13, 2));
        assertEquals(3, powerSum.powerSum(100, 2));
        assertEquals(1, powerSum.powerSum(100, 3));
    }
}