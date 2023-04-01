package ml.pevgen.algo.hackerrank.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BreakingTheRecordsTest {

    private BreakingTheRecords breakingTheRecords;

    @BeforeEach
    void setUp() {
        breakingTheRecords = new BreakingTheRecords();
    }

    @Test
    void should_run_example_1() {
        List<Integer> result = breakingTheRecords.breakingRecords(List.of(12, 24, 10, 24));
        assertEquals(1, result.get(0));
        assertEquals(1, result.get(1));
    }

    @Test
    void should_run_example_2() {
        List<Integer> result = breakingTheRecords.breakingRecords(List.of(10, 5, 20, 20, 4, 5, 2, 25, 1));
        assertEquals(2, result.get(0));
        assertEquals(4, result.get(1));
    }


}