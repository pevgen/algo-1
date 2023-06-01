package ml.pevgen.algo.leetcode.n136;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberTest {

    private SingleNumber solution;


    @BeforeEach
    void setUp() {
        solution = new SingleNumber();
    }

    @Test
    void should_find_single_number() {
        assertEquals(2, solution.singleNumber(new int[]{1, 2, 1}));
    }
}