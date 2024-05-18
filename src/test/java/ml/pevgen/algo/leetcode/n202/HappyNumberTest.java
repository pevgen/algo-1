package ml.pevgen.algo.leetcode.n202;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HappyNumberTest {

    private HappyNumber solution;

    @BeforeEach
    void setUp() {
        solution = new HappyNumber();
    }

    @Test
    void should_return_true_for_happy_number() {
        assertTrue(solution.isHappy(19));
    }

    @Test
    void should_return_false_for_unhappy_number() {
        assertFalse(solution.isHappy(2));
    }
}