package ml.pevgen.algo.others;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfASortedArrayTest {

    private SquaresOfASortedArray solution;
    
    @BeforeEach
    void setUp() {
        solution = new SquaresOfASortedArray();
    }

    @Test
    void sortedSquares_allPositive_returnsSortedSquares() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 4, 9, 16, 25};
        assertArrayEquals(expected, solution.sortedSquares(input));
    }

    @Test
    void sortedSquares_allNegative_returnsSortedSquares() {
        int[] input = {-5, -4, -3, -2, -1};
        int[] expected = {1, 4, 9, 16, 25};
        assertArrayEquals(expected, solution.sortedSquares(input));
    }

    @Test
    void sortedSquares_mixedValues_returnsSortedSquares() {
        int[] input = {-4, -1, 0, 3, 10};
        int[] expected = {0, 1, 9, 16, 100};
        assertArrayEquals(expected, solution.sortedSquares(input));

        input = new int[]{-2,0};
        expected = new int[] {0,4};
        assertArrayEquals(expected, solution.sortedSquares(input));

        input = new int[]{-10000,-9999,-7,-5,0,0,10000};
        expected = new int[] {0,0,25,49,99980001,100000000,100000000};
        assertArrayEquals(expected, solution.sortedSquares(input));


    }

    @Test
    void sortedSquares_emptyArray_returnsEmptyArray() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, solution.sortedSquares(input));
    }

    @Test
    void sortedSquares_singleElement_returnsSingleSquare() {
        int[] input = {-7};
        int[] expected = {49};
        assertArrayEquals(expected, solution.sortedSquares(input));
    }
}