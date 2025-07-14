package ml.pevgen.algo.others;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainDuplicatesTest {

    private ContainDuplicates solution;

    @BeforeEach
    void setUp() {
        solution = new ContainDuplicates();
    }

    @Test
    void should_check_contains_duplicate() {
        assertFalse(solution.containsDuplicate(new int[]{}));
        assertFalse(solution.containsDuplicate(new int[]{1}));
        assertFalse(solution.containsDuplicate(new int[]{1, 2, 3, 4}));
        assertTrue(solution.containsDuplicate(new int[]{1, 1}));
        assertTrue(solution.containsDuplicate(new int[]{1, 2, 3, 1}));
        assertTrue(solution.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}