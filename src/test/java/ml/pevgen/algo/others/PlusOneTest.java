package ml.pevgen.algo.others;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    private PlusOne solution;

    @BeforeEach
    void setUp() {
        solution = new PlusOne();
    }

    @Test
    void should_return_plus_one_not_overflow() {
        assertArrayEquals(new int[]{1, 2, 4}, solution.plusOne(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{4, 3, 2, 2}, solution.plusOne(new int[]{4, 3, 2, 1}));
    }

    @Test
    void should_return_plus_one_with_overflow() {
        assertArrayEquals(new int[]{1, 0}, solution.plusOne(new int[]{9}));
        assertArrayEquals(new int[]{2, 0}, solution.plusOne(new int[]{1, 9}));
        assertArrayEquals(new int[]{1, 0, 0, 0}, solution.plusOne(new int[]{9, 9, 9}));
    }


}