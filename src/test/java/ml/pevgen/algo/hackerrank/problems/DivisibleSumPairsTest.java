package ml.pevgen.algo.hackerrank.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisibleSumPairsTest {

    private DivisibleSumPairs divisibleSumPairs;

    @BeforeEach
    void setUp() {
        divisibleSumPairs = new DivisibleSumPairs();
    }

    @Test
    void should_return_correct_count() {
        assertEquals(5, divisibleSumPairs.divisibleSumPairs(6, 3, List.of(1, 3, 2, 6, 1, 2)));

    }
}