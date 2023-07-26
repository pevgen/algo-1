package ml.pevgen.algo.leetcode.n169;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MajorityElementTest {

    private MajorityElement solution;

    @BeforeEach
    void setUp() {
        solution = new MajorityElement();
    }

    @Test
    void should_return_majority_element() {
        assertEquals(3, solution.majorityElement(new int[]{3, 2, 3}));
    }
}