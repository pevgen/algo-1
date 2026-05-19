package ml.pevgen.algo.leetcode.quest.array2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class Q3FindAllNumbersDisappearedInArrayTest {

    private final Q3FindAllNumbersDisappearedInArray solution = new Q3FindAllNumbersDisappearedInArray();

    @Test
    void findDisappearedNumbers() {
        assertIterableEquals(List.of(2), solution.findDisappearedNumbers(new int[]{1, 1}));
        assertIterableEquals(List.of(5, 6), solution.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}