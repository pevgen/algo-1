package ml.pevgen.algo.hackerrank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfAllSubArraysTest {

    private SumOfAllSubArrays sumOfAllSubArrays;

    @BeforeEach
    void setUp() {
        sumOfAllSubArrays = new SumOfAllSubArrays();
    }

    @Test
    void should_sum_sub_arrays_bigO_n2() {
        // in: [1, 3, 5]
        // ---
        // [1] + [3] + [5]  = 9
        // [1, 3] + [3, 5] = 4 + 8 = 12
        // [1, 3, 5] = 9
        //  9 + 12 + 9 = 30

        assertEquals(30, sumOfAllSubArrays.sum(List.of(1, 3, 5)));
    }
}