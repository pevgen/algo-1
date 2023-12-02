package ml.pevgen.algo.leetcode.n78;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubsetsTest {

    private Subsets solution;

    @BeforeEach
    void setUp() {
        solution = new Subsets();
    }

    @Test
    void should_return_subsets_example_1() {
        List<List<Integer>> result = solution.subsets(new int[]{});
        assertEquals(1, result.size());
        assertEquals(0, result.get(0).size());
    }

    @Test
    void should_return_subsets_example_2() {
        List<List<Integer>> result = solution.subsets(new int[]{5});
        assertEquals(2, result.size());
        assertEquals(0, result.get(0).size());
        assertEquals(1, result.get(1).size());
        assertEquals(5, result.get(1).get(0));
    }

    @Test
    void should_return_subsets_example_3() {
        List<List<Integer>> result = solution.subsets(new int[]{1, 2});
        assertEquals(4, result.size());
        assertEquals(0, result.get(0).size());
        assertEquals(1, result.get(1).size());
        assertEquals(2, result.get(2).size());
        assertEquals(1, result.get(3).size());
    }

    @Test
    void should_return_subsets_example_4() {
        List<List<Integer>> result = solution.subsets(new int[]{1, 2, 3});
        assertEquals(8, result.size());
        assertEquals(0, result.get(0).size());
    }
}