package ml.pevgen.algo.others;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueNumberOfOccurrencesTest {

    private UniqueNumberOfOccurrences solution;

    @BeforeEach
    void setUp() {
        solution = new UniqueNumberOfOccurrences();
    }

    @Test
    void should_count() {
        assertTrue(solution.uniqueOccurrences(new int[]{1,2,2,1,1,3}));
        assertFalse(solution.uniqueOccurrences(new int[]{1,2}));
        assertTrue(solution.uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }
}