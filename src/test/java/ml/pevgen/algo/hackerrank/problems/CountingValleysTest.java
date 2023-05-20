package ml.pevgen.algo.hackerrank.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountingValleysTest {

    private CountingValleys countingValleys;

    @BeforeEach
    void setUp() {
        countingValleys = new CountingValleys();
    }

    @Test
    void should_count_valley() {
        assertEquals(0, countingValleys.countingValleys(1, "U"));
        assertEquals(1, countingValleys.countingValleys(8, "UDDDUDUU"));
        assertEquals(2, countingValleys.countingValleys(3, "DUD"));
    }
}