package ml.pevgen.algo.leetcode.n94;

import ml.pevgen.algo.leetcode.utils.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinaryTreeInorderTraversalTest {

    private BinaryTreeInorderTraversal solution;

    @BeforeEach
    void setUp() {
        solution = new BinaryTreeInorderTraversal();
    }

    @Test
    void should_return_empty_list_for_null_tree() {
        assertTrue(solution.inorderTraversal(null).isEmpty());
    }

    @Test
    void should_return_list_of_1_element() {
        List<Integer> result = solution.inorderTraversal(new TreeNode(123));
        assertEquals(1, result.size());
        assertEquals(123, result.get(0));
    }

    @Test
    void should_return_list_of_elements_example_1() {
        List<Integer> result = solution.inorderTraversal(
                new TreeNode(1,
                        null,
                        new TreeNode(2,
                                new TreeNode(3),
                                null)));
        assertEquals(3, result.size());
        assertEquals(1, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(2, result.get(2));
    }

    @Test
    void should_return_list_of_elements_example_2() {
        List<Integer> result = solution.inorderTraversal(
                new TreeNode(1,
                        null,
                        new TreeNode(2)));
        assertEquals(2, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
    }
}