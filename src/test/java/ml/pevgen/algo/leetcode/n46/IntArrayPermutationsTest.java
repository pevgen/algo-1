package ml.pevgen.algo.leetcode.n46;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class IntArrayPermutationsTest {

    IntArrayPermutations solution = new IntArrayPermutations();

    @Test
    void should_return_one_list() {
        assertIterableEquals(
                Arrays.asList(1),
                solution.permute(new int[]{1}).get(0));
    }

    @Test
    void should_return_two_list() {

        List<List<Integer>> result = solution.permute(new int[]{0, 1});

        assertEquals(2, result.size());

        assertIterableEquals(
                Arrays.asList(0, 1),
                result.get(0));
        assertIterableEquals(
                Arrays.asList(1, 0),
                result.get(1));

    }

}