package ml.pevgen.algo.leetcode.n283;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroesTest {

    private MoveZeroes solution;

    @BeforeEach
    void setUp() {
        solution = new MoveZeroes();
    }

    @Test
    void should_move_zeroes_to_the_end_one_element() {
        int[] array = new int[]{0};
        solution.moveZeroes(array);
        assertArrayEquals(new int[]{0}, array);

        int[] array2 = new int[]{1};
        solution.moveZeroes(array2);
        assertArrayEquals(new int[]{1}, array2);
    }

    @Test
    void should_move_zeroes_to_the_end() {
        int[] array = new int[]{0, 1, 0, 3, 12};
        solution.moveZeroes(array);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, array);
    }
}