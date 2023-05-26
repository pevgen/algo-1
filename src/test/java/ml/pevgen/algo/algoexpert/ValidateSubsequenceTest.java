package ml.pevgen.algo.algoexpert;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidateSubsequenceTest {


    private ValidateSubsequence solution;

    @BeforeEach
    void setUp() {
        solution = new ValidateSubsequence();
    }

    @Test
    void should_validate_subsequence() {
        assertTrue(solution.isValidSubsequence(List.of(1, 2, 3), List.of(1, 3)));
        assertTrue(solution.isValidSubsequence(List.of(1, 2, 3, 4), List.of(1, 3, 4)));
        assertTrue(solution.isValidSubsequence(List.of(1, 2, 3, 4), List.of(2, 4)));
        assertTrue(solution.isValidSubsequence(List.of(5, 1, 22, 25, 6, -1, 8, 10), List.of(1, 6, -1, 10)));
        assertFalse(solution.isValidSubsequence(List.of(1, 22, 25, 6), List.of(1, 22, 22, 6)));
        assertFalse(solution.isValidSubsequence(List.of(1, 22, 25, 6), List.of(1, 22, 22, 25, 6)));
    }
}