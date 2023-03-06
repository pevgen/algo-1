package ml.pevgen.algo.hackerrank.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BetweenTwoSetsTest {

    private BetweenTwoSets betweenTwoSets;

    @BeforeEach
    void setUp() {
        betweenTwoSets = new BetweenTwoSets();
    }

    @Test
    void should_return_result() {
        assertEquals(2, betweenTwoSets.getTotalX(new ArrayList<>(List.of(2, 6)), new ArrayList<>(List.of(24, 36))));
        assertEquals(9, betweenTwoSets.getTotalX(new ArrayList<>(List.of(1)), new ArrayList<>(List.of(100))));
    }


}