package ml.pevgen.algo.others;

import ml.pevgen.algo.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConvertSortedArrayToBinarySearchTreeTest {

    private final ConvertSortedArrayToBinarySearchTree solution = new ConvertSortedArrayToBinarySearchTree();

    @Test
    void should_build_bst_from_one_node() {
        TreeNode result = solution.sortedArrayToBST(new int[]{1});
        assertEquals(1, result.val);
        assertNull(result.left);
        assertNull(result.right);
    }

    @Test
    void should_build_bst_from_two_node() {
        TreeNode result = solution.sortedArrayToBST(new int[]{1, 2});
        assertEquals(2, result.val);
        assertNotNull(result.left);
        assertEquals(1, result.left.val);
        assertNull(result.right);
    }

    @Test
    void should_build_bst_from_three_node() {
        TreeNode result = solution.sortedArrayToBST(new int[]{1, 3, 100});
        assertEquals(3, result.val);
        assertNotNull(result.left);
        assertEquals(1, result.left.val);
        assertNotNull(result.right);
        assertEquals(100, result.right.val);
    }

    @Test
    void should_build_bst_example_1() {
        TreeNode result = solution.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        assertEquals(0, result.val);
        assertNotNull(result.left);
        assertEquals(-3, result.left.val);
        assertNotNull(result.right);
        assertEquals(9, result.right.val);
    }

    @Test
    void should_build_bst_example_2() {
        TreeNode result = solution.sortedArrayToBST(new int[]{1, 2, 3, 4, 5, 6, 7});
        assertEquals(4, result.val);
        assertNotNull(result.left);
        assertEquals(2, result.left.val);

        assertNotNull(result.left.left);
        assertEquals(1, result.left.left.val);
        assertNotNull(result.left.right);
        assertEquals(3, result.left.right.val);

        assertNotNull(result.right);
        assertEquals(6, result.right.val);

        assertNotNull(result.right.left);
        assertEquals(5, result.right.left.val);
        assertNotNull(result.right);
        assertEquals(7, result.right.right.val);
    }
}