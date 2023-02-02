package ml.pevgen.algo.others;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumberSimpleMergeSortTest {

    private EvenNumberSimpleMergeSort sort;

    @BeforeEach
    void setUp() {
        sort = new EvenNumberSimpleMergeSort();
    }

    @Test
    void sort_two_el() {
        int[] result = sort.sort(new int[]{7, 1});
        assertEquals(1, result[0]);
        assertEquals(7, result[1]);
    }

    @Test
    void sort_four_el() {
        int[] result = sort.sort(new int[]{4, 1 , 3, 2});
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
        assertEquals(4, result[3]);
    }

}