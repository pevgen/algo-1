package ml.pevgen.algo.leetcode.n111;

import ml.pevgen.algo.leetcode.utils.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumDepthOfBinaryTreeTest {

    private MinimumDepthOfBinaryTree solution;

    @BeforeEach
    void setUp() {
        solution = new MinimumDepthOfBinaryTree();
    }

    @Test
    void should_return_0_for_null_tree() {
        assertEquals(0, solution.minDepth(null));
    }

    @Test
    void should_find_min_depth() {
        assertEquals(1, solution.minDepth(new TreeNode(2)));
        assertEquals(2,
                solution.minDepth(new TreeNode(2,
                        new TreeNode(5), null)));
        assertEquals(2,
                solution.minDepth(
                        new TreeNode(3,
                                new TreeNode(9),
                                new TreeNode(20,
                                        new TreeNode(15),
                                        new TreeNode(7)))));

        assertEquals(5,
                solution.minDepth(
                        new TreeNode(2,
                                new TreeNode(3,
                                        new TreeNode(4,
                                                new TreeNode(5,
                                                        new TreeNode(6),
                                                        null),
                                                null),
                                        null),
                                null)));

    }
}