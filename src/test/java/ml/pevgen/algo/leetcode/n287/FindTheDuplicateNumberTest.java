package ml.pevgen.algo.leetcode.n287;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheDuplicateNumberTest {

    private FindTheDuplicateNumber solution;

    @BeforeEach
    void setUp() {
        solution = new FindTheDuplicateNumber();
    }

    @Test
    void should_return_duplicate_number_example1_1() {
        assertEquals(2, solution.findDuplicate(new int[]{1, 3, 4, 2, 2}));
    }

    @Test
    void should_return_duplicate_number_example1_2() {
        assertEquals(3, solution.findDuplicate(new int[]{3, 1, 3, 4, 2}));
    }

    @Test
    void should_return_duplicate_number_example1_3() {
        assertEquals(9, solution.findDuplicate(new int[]{2, 5, 9, 6, 9, 3, 8, 9, 7, 1}));
    }

}