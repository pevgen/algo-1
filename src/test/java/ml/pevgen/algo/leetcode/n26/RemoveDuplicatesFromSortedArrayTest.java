package ml.pevgen.algo.leetcode.n26;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.copyOf;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedArrayTest {


    private RemoveDuplicatesFromSortedArray solution;

    @BeforeEach
    void setUp() {
        solution = new RemoveDuplicatesFromSortedArray();
    }

    @Test
    void should_return_correct_count_unique_elements() {
        int[] arr = new int[]{1, 1, 2};
        assertEquals(2, solution.removeDuplicates(arr));
        assertArrayEquals(new int[]{1, 2}, copyOf(arr, 2));

        arr = new int[]{-1, -1, -1};
        assertEquals(1, solution.removeDuplicates(arr));
        assertArrayEquals(new int[]{-1}, copyOf(arr, 1));

        arr = new int[]{-1, 0, 1};
        assertEquals(3, solution.removeDuplicates(arr));
        assertArrayEquals(new int[]{-1, 0, 1}, copyOf(arr, 3));

        arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, solution.removeDuplicates(arr));
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, copyOf(arr, 5));
    }
}