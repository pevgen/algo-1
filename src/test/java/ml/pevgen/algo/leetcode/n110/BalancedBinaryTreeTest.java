package ml.pevgen.algo.leetcode.n110;

import ml.pevgen.algo.leetcode.utils.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BalancedBinaryTreeTest {

    private BalancedBinaryTree solution;

    @BeforeEach
    void setUp() {
        solution = new BalancedBinaryTree();
    }

    @Test
    void should_return_true_if_balanced() {
        assertTrue(solution.isBalanced(null));
        assertTrue(
                solution.isBalanced(
                        new TreeNode(3,
                                new TreeNode(9),
                                new TreeNode(20,
                                        new TreeNode(15),
                                        new TreeNode(7))
                        )
                ));
    }

    @Test
    void should_return_false_if_not_balanced() {

        assertFalse(
                solution.isBalanced(
                        new TreeNode(1,
                                new TreeNode(2,
                                        new TreeNode(3,
                                                new TreeNode(4),
                                                new TreeNode(4)),
                                        new TreeNode(3)),
                                new TreeNode(2))));
    }
}