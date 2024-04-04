package ml.pevgen.algo.leetcode.n268;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingNumberTest {

    private MissingNumber solution;

    @BeforeEach
    void setUp() {
        solution = new MissingNumber();
    }

    @Test
    void should_return_missing_number() {
        assertEquals(2, solution.missingNumber(new int[]{0, 1}));
        assertEquals(2, solution.missingNumber(new int[]{3, 0, 1}));
        assertEquals(8, solution.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }
}