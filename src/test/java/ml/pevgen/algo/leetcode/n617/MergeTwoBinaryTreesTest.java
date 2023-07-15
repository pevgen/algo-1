package ml.pevgen.algo.leetcode.n617;

import ml.pevgen.algo.leetcode.utils.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MergeTwoBinaryTreesTest {

    private MergeTwoBinaryTrees solution;

    @BeforeEach
    void setUp() {
        solution = new MergeTwoBinaryTrees();
    }

    @Test
    void should_return_null_for_null_input() {
        assertNull(solution.mergeTrees(null, null));
        assertNull(solution.mergeTrees(new TreeNode(1), null));
        assertNull(solution.mergeTrees(null, new TreeNode(2)));
    }

    @Test
    void should_return_single_node_tree() {
        assertEquals(3,
                solution.mergeTrees(new TreeNode(1), new TreeNode(2)).val);
    }

    @Test
    void should_return_example_node_tree() {

        TreeNode result = solution.mergeTrees(
                new TreeNode(1,
                        new TreeNode(3,
                                new TreeNode(5),
                                null),
                        new TreeNode(2)),
                new TreeNode(2,
                        new TreeNode(1,
                                null,
                                new TreeNode(4)),
                        new TreeNode(3,
                                null,
                                new TreeNode(7))));

        assertEquals(3, result.val);
        assertEquals(4, result.left.val);
        assertEquals(5, result.left.left.val);
        assertEquals(5, result.right.val);
        assertEquals(7, result.right.right.val);

    }

}