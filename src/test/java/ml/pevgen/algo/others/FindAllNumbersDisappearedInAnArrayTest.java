package ml.pevgen.algo.others;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Objects.requireNonNull;
import static org.junit.jupiter.api.Assertions.*;

class FindAllNumbersDisappearedInAnArrayTest {

    private FindAllNumbersDisappearedInAnArray solution;

    @BeforeEach
    void setUp() {
        solution = new FindAllNumbersDisappearedInAnArray();
    }

    @Test
    void should_find_disappeared_numbers() {
        assertArrayEquals(
                new int[]{2},
                intListToArray(solution.findDisappearedNumbers(new int[]{1, 1})));

        assertArrayEquals(
                new int[]{3, 4},
                intListToArray(solution.findDisappearedNumbers(new int[]{2, 5, 5, 6, 2, 1})));

        assertArrayEquals(
                new int[]{5, 6},
                intListToArray(solution.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1})));
    }


    private int[] intListToArray(List<Integer> integerList) {
        requireNonNull(integerList);
        return integerList.stream().mapToInt(i -> i).toArray();
    }
}