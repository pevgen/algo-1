package ml.pevgen.algo.leetcode.n88;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeSortedArrayTest {

    private MergeSortedArray solution;

    @BeforeEach
    void setUp() {
        solution = new MergeSortedArray();
    }

    @Test
    void should_merge_into_first_array_example_1() {
        int[] array1 = new int[1];
        array1[0] = 1;
        int[] array2 = new int[]{};
        solution.merge(array1, 1, array2, 0);
        assertEquals(1, array1.length);
        assertEquals(1, array1[0]);
    }

    @Test
    void should_merge_into_first_array_example_2() {
        int[] array1 = new int[1];
        int[] array2 = new int[]{1};
        solution.merge(array1, 0, array2, 1);
        assertEquals(1, array1.length);
        assertEquals(1, array1[0]);
    }

    @Test
    void should_merge_into_first_array_example_3() {
        int[] array1 = new int[6];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        int[] array2 = new int[]{2, 5, 6};
        solution.merge(array1, 3, array2, 3);
        assertEquals(6, array1.length);
        assertEquals(1, array1[0]);
        assertEquals(2, array1[1]);
        assertEquals(2, array1[2]);
        assertEquals(3, array1[3]);
        assertEquals(5, array1[4]);
        assertEquals(6, array1[5]);
    }
}