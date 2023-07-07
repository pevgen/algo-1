package ml.pevgen.algo.leetcode.n112;

import ml.pevgen.algo.leetcode.utils.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PathSumTest {

    private PathSum solution;

    @BeforeEach
    void setUp() {
        solution = new PathSum();
    }

    @Test
    void should_return_false_if_null_tree() {
        assertFalse(solution.hasPathSum(null, 100));
    }

    @Test
    void should_return_result_for_one_node_tree() {
        assertTrue(solution.hasPathSum(new TreeNode(100), 100));
        assertFalse(solution.hasPathSum(new TreeNode(1), 100));
    }

    @Test
    void should_return_true() {
        assertTrue(solution.hasPathSum(
                new TreeNode(-2,
                        null,
                        new TreeNode(-3)),
                -5));

        assertTrue(solution.hasPathSum(
                new TreeNode(1,
                        new TreeNode(2,
                                new TreeNode(3),
                                null),
                        null), 6));

        assertTrue(solution.hasPathSum(
                new TreeNode(5,
                        new TreeNode(4,
                                new TreeNode(11,
                                        new TreeNode(7),
                                        new TreeNode(2)),
                                new TreeNode(3)),
                        new TreeNode(8,
                                new TreeNode(13),
                                new TreeNode(4,
                                        null,
                                        new TreeNode(1)))),
                22));


    }

    @Test
    void should_return_false() {
        assertFalse(solution.hasPathSum(new TreeNode(1,
                new TreeNode(3),
                new TreeNode(5)), 100));

        assertFalse(solution.hasPathSum(
                new TreeNode(1,
                        new TreeNode(2),
                        null), 1));

    }

}