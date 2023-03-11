package ml.pevgen.algo.hackerrank.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppleAndOrangeTest {

    private AppleAndOrange appleAndOrange;

    @BeforeEach
    void setUp() {
        appleAndOrange = new AppleAndOrange();
    }

    @Test
    void countApplesAndOranges() {
        int[] results = appleAndOrange.countApplesAndOranges(7, 10, 4, 12,
                List.of(2, 3, -4), List.of(3, -2, -4));
        assertEquals(1, results[0]);
        assertEquals(2, results[1]);
    }
}