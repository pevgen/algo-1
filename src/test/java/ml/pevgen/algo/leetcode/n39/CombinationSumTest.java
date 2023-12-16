package ml.pevgen.algo.leetcode.n39;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CombinationSumTest {

    private CombinationSum solution;

    @BeforeEach
    void setUp() {
        solution = new CombinationSum();
    }

    @Test
    void should_calculate_lists_example_1() {
        List<List<Integer>> result = solution.combinationSum(new int[]{1}, 1);
        assertEquals(1, result.size());
    }

    @Test
    void should_calculate_lists_example_2() {
        List<List<Integer>> result = solution.combinationSum(new int[]{2, 3}, 3);
        assertEquals(1, result.size());
    }

    @Test
    void should_calculate_lists_example_3() {
        List<List<Integer>> result = solution.combinationSum(new int[]{1, 2}, 3);
        assertEquals(2, result.size());
    }

    @Test
    void should_calculate_lists_example_4() {
        List<List<Integer>> result = solution.combinationSum(new int[]{2, 3, 5}, 8);
        assertEquals(3, result.size());
    }

    @Test
    void should_calculate_lists_example_5() {
        List<List<Integer>> result = solution.combinationSum(new int[]{3, 5, 8}, 11);
        assertEquals(2, result.size());
    }

    @Test
    void should_calculate_lists_example_6() {
        List<List<Integer>> result = solution.combinationSum(new int[]{2, 3}, 6);
        assertEquals(2, result.size());
    }

}