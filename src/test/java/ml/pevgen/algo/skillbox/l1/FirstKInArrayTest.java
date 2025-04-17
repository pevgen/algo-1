package ml.pevgen.algo.skillbox.l1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstKInArrayTest {

    private FirstKInArray solution;

    @BeforeEach
    void setUp() {
        solution = new FirstKInArray();
    }

    @Test
    void should_return_first_k_elements() {
        assertArrayEquals(new int[]{5}, solution.findFirstK(new int[]{1, 3, 5}, 1));
        assertArrayEquals(new int[]{5, 3}, solution.findFirstK(new int[]{1, 3, 5}, 2));
        assertArrayEquals(new int[]{100, 90, 5}, solution.findFirstK(new int[]{1, 100, 2, 90, 3, 4, 5}, 3));

        assertArrayEquals(new int[]{100, 100, 100}, solution.findFirstK(new int[]{100, 100, 100, 55, 8}, 3));
    }

    @Test
    void should_return_empty_array() {
        assertArrayEquals(new int[]{}, solution.findFirstK(new int[]{1, 3, 5}, 0));
        assertArrayEquals(new int[]{}, solution.findFirstK(new int[]{}, 5));
    }
}