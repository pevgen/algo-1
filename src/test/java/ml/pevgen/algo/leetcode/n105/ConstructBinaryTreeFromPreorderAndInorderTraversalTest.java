package ml.pevgen.algo.leetcode.n105;

import ml.pevgen.algo.leetcode.utils.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

    private ConstructBinaryTreeFromPreorderAndInorderTraversal solution;

    @BeforeEach
    void setUp() {
        solution = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
    }

    @Test
    void should_build_tree_from_one_node() {
        TreeNode result = solution.buildTree(new int[]{-1}, new int[]{-1});
        assertEquals(-1, result.val);
        assertNull(result.left);
        assertNull(result.right);
    }

    @Test
    void should_build_tree() {
        TreeNode result = solution.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        assertEquals(3, result.val);
        assertEquals(9, result.left.val);
        assertNull(result.left.left);
        assertNull(result.left.right);

        assertEquals(20, result.right.val);
        assertEquals(15, result.right.left.val);
        assertEquals(7, result.right.right.val);
    }

}