package ml.pevgen.algo.hackerrank.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberLineJumpsTest {

    private NumberLineJumps numberLineJumps;

    @BeforeEach
    void setUp() {
        numberLineJumps = new NumberLineJumps();
    }

    @Test
    void should_return_yes() {
        assertEquals("YES", numberLineJumps.kangaroo(0, 3, 4, 2));
    }

    @Test
    void should_return_no() {
        assertEquals("NO", numberLineJumps.kangaroo(0, 1, 4, 2));
    }

}