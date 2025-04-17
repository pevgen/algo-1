package ml.pevgen.algo.skillbox.l1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstMinKInArrayTest {

    private FirstMinKInArray solution;

    @BeforeEach
    void setUp() {
        solution = new FirstMinKInArray();
    }

    @Test
    void should_find_first_min_k() {
        assertArrayEquals(new int[]{-3, 1,4}, solution.findFirstMinK(new int[]{7, 1,-3, 8,4, 6}, 3));
    }
}