package ml.pevgen.algo.leetcode.n98;

import ml.pevgen.algo.leetcode.utils.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidateBinarySearchTreeTest {

    private ValidateBinarySearchTree solution;

    @BeforeEach
    void setUp() {
        solution = new ValidateBinarySearchTree();
    }

    @Test
    void should_return_true_for_valid_binary_tree() {
//        assertTrue(solution.isValidBST(
//                new TreeNode(2,
//                        new TreeNode(1),
//                        new TreeNode(3))));


        assertTrue(solution.isValidBST(
                new TreeNode(3,
                        new TreeNode(1,
                                new TreeNode(0),
                                new TreeNode(2)),
                        new TreeNode(5,
                                new TreeNode(4),
                                new TreeNode(6)))));


    }

    @Test
    void should_return_false_for_invalid_binary_tree() {
        assertFalse(solution.isValidBST(
                new TreeNode(5,
                        new TreeNode(1),
                        new TreeNode(4,
                                new TreeNode(3),
                                new TreeNode(6)))));

        assertFalse(solution.isValidBST(
                new TreeNode(5,
                        new TreeNode(1),
                        new TreeNode(6,
                                new TreeNode(7),
                                new TreeNode(8)))));

        assertFalse(solution.isValidBST(
                new TreeNode(2,
                        new TreeNode(2),
                        new TreeNode(2))));

        assertFalse(solution.isValidBST(
                new TreeNode(5,
                        new TreeNode(4),
                        new TreeNode(6,
                                new TreeNode(3),
                                new TreeNode(7)))));


        assertFalse(solution.isValidBST(
                new TreeNode(120,
                        new TreeNode(70,
                                new TreeNode(50,
                                        new TreeNode(20),
                                        new TreeNode(55)),
                                new TreeNode(100,
                                        new TreeNode(75),
                                        new TreeNode(110))),
                        new TreeNode(140,
                                new TreeNode(130,
                                        new TreeNode(119),
                                        new TreeNode(135)),
                                new TreeNode(160,
                                        new TreeNode(150),
                                        new TreeNode(200))))));

    }
}