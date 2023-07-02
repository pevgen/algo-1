package ml.pevgen.algo.leetcode.n637;

import ml.pevgen.algo.leetcode.utils.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AverageOfLevelsInBinaryTreeTest {

    private AverageOfLevelsInBinaryTree solution;

    @BeforeEach
    void setUp() {
        solution = new AverageOfLevelsInBinaryTree();
    }

    @Test
    void should_return_0_for_zero_node() {
        List<Double> result = solution.averageOfLevels(new TreeNode(0));
        assertEquals(1, result.size());
        assertEquals(0, result.get(0));
    }

    @Test
    void should_return_average_value_for_simple_case() {
        List<Double> result = solution.averageOfLevels(new TreeNode(1));
        assertEquals(1, result.size());
        assertEquals(1.0, result.get(0));
    }

    @Test
    void should_return_average_value() {
        List<Double> result = solution.averageOfLevels(
                new TreeNode(3,
                        new TreeNode(9),
                        new TreeNode(20,
                                new TreeNode(15),
                                new TreeNode(7))));
        assertEquals(3, result.size());
        assertEquals(3.0, result.get(0));
        assertEquals(14.5, result.get(1));
        assertEquals(11.0, result.get(2));
    }
}