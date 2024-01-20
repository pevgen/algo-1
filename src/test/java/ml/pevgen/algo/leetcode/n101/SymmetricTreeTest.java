package ml.pevgen.algo.leetcode.n101;

import ml.pevgen.algo.leetcode.utils.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SymmetricTreeTest {

    private SymmetricTree solution;

    @BeforeEach
    void setUp() {
        solution = new SymmetricTree();
    }

    @Test
    void should_return_true_for_just_root() {
        assertTrue(solution.isSymmetric(new TreeNode(1)));
    }

    @Test
    void should_return_true_for_symmetrical_tree() {
        assertTrue(solution.isSymmetric(
                new TreeNode(1,
                        new TreeNode(2,
                                new TreeNode(3),
                                new TreeNode(4)),
                        new TreeNode(2,
                                new TreeNode(4),
                                new TreeNode(3)))));
    }

    @Test
    void should_return_false_for_asymmetrical_tree_example_1() {

        assertFalse(solution.isSymmetric(
                new TreeNode(1,
                        new TreeNode(2,
                                null,
                                new TreeNode(3)),
                        new TreeNode(2,
                                null,
                                new TreeNode(3)))));
    }

    @Test
    void should_return_false_for_asymmetrical_tree_example_2() {

        assertFalse(solution.isSymmetric(
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4),
                                new TreeNode(5)),
                        new TreeNode(3,
                                null,
                                new TreeNode(4)))));
    }

}