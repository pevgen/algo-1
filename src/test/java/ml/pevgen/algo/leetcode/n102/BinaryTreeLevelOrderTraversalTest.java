package ml.pevgen.algo.leetcode.n102;

import ml.pevgen.algo.leetcode.utils.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeLevelOrderTraversalTest {

    private BinaryTreeLevelOrderTraversal solution;

    @BeforeEach
    void setUp() {
        solution = new BinaryTreeLevelOrderTraversal();
    }

    @Test
    void should_return_empty_list__if_input_tree_null() {
        assertEquals(0, solution.levelOrder(null).size());
    }

    @Test
    void should_return_levels_one() {
        List<List<Integer>> result = solution.levelOrder(new TreeNode(100));
        assertEquals(1, result.size());
        assertEquals(1, result.get(0).size());
        assertEquals(100, result.get(0).get(0));
    }

    @Test
    void should_return_levels_two() {
        List<List<Integer>> result =
                solution.levelOrder(
                        new TreeNode(100,
                                new TreeNode(99),
                                new TreeNode(101)));
        assertEquals(2, result.size());
        assertEquals(1, result.get(0).size());
        assertEquals(2, result.get(1).size());
        assertEquals(100, result.get(0).get(0));
        assertEquals(99, result.get(1).get(0));
        assertEquals(101, result.get(1).get(1));
    }
}