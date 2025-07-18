package ml.pevgen.algo.others;

import ml.pevgen.algo.leetcode.utils.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvertBinaryTreeTest {

    private InvertBinaryTree solution;

    @BeforeEach
    void setUp() {
        solution = new InvertBinaryTree();
    }

    @Test
    void should_invert_simple_tree() {
        assertNull(solution.invertTree(null));
        assertEquals(1,solution.invertTree(new TreeNode(1)).val);
    }
        @Test
    void should_invert_real_tree() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9)));

        TreeNode result = solution.invertTree(root);

        assertEquals(4, result.val);
        assertEquals(7, result.left.val);
        assertEquals(9, result.left.left.val);
        assertEquals(6, result.left.right.val);
        assertEquals(2, result.right.val);
        assertEquals(3, result.right.left.val);
        assertEquals(1, result.right.right.val);
    }
}