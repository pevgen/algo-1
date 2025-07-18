package ml.pevgen.algo.others;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    private SingleNumber solution;

    @BeforeEach
    void setUp() {
        solution = new SingleNumber();
    }

    @Test
    void should_find_single_number() {
        assertEquals(1, solution.singleNumber(new int[]{1}));
        assertEquals(2, solution.singleNumber(new int[]{1, 2, 1}));
        assertEquals(4, solution.singleNumber(new int[]{4,1,2,1,2}));
    }

}