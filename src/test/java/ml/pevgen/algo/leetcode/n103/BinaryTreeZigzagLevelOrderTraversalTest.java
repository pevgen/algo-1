package ml.pevgen.algo.leetcode.n103;

import ml.pevgen.algo.leetcode.utils.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeZigzagLevelOrderTraversalTest {

    private BinaryTreeZigzagLevelOrderTraversal solution;

    @BeforeEach
    void setUp() {
        solution = new BinaryTreeZigzagLevelOrderTraversal();
    }

    @Test
    void should_return_empty_list_for_0_node() {
        List<List<Integer>> result = solution.zigzagLevelOrder(null);
        assertEquals(0, result.size());
    }

    @Test
    void should_return_one_level_for_1_node() {
        List<List<Integer>> result = solution.zigzagLevelOrder(new TreeNode(0));
        assertEquals(1, result.size());
        assertEquals(1, result.get(0).size());
        assertEquals(0, result.get(0).get(0));
    }

    @Test
    void should_return_levels_for_case_1() {
        List<List<Integer>> result = solution.zigzagLevelOrder(
                new TreeNode(3,
                        new TreeNode(9),
                        new TreeNode(20,
                                new TreeNode(15),
                                new TreeNode(7))));
        assertEquals(3, result.size());
        assertEquals(1, result.get(0).size());
        assertEquals(20, result.get(1).get(0));
        assertEquals(9, result.get(1).get(1));
        assertEquals(15, result.get(2).get(0));
        assertEquals(7, result.get(2).get(1));
    }

    @Test
    void should_return_levels_for_case_2() {
        List<List<Integer>> result = solution.zigzagLevelOrder(
                new TreeNode(1,
                        new TreeNode(2,
                                new TreeNode(4),
                                null),
                        new TreeNode(3,
                                null,
                                new TreeNode(5))));
        assertEquals(3, result.size());
        assertEquals(1, result.get(0).size());
        assertEquals(3, result.get(1).get(0));
        assertEquals(2, result.get(1).get(1));
        assertEquals(4, result.get(2).get(0));
        assertEquals(5, result.get(2).get(1));
    }
}