package ml.pevgen.algo.leetcode.n543;

import ml.pevgen.algo.leetcode.utils.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiameterOfBinaryTreeTest {

    private DiameterOfBinaryTree solution;

    @BeforeEach
    void setUp() {
        solution = new DiameterOfBinaryTree();
    }

    @Test
    void should_return_diameterOfBinaryTree() {

        assertEquals(0, solution.diameterOfBinaryTree(null));
        assertEquals(0, solution.diameterOfBinaryTree(new TreeNode(5)));
        assertEquals(1, solution.diameterOfBinaryTree(
                new TreeNode(5,
                        new TreeNode(3), null)));

        assertEquals(2, solution.diameterOfBinaryTree(
                new TreeNode(5,
                        new TreeNode(3,
                                new TreeNode(6),
                                null),
                        null)));


        assertEquals(2, solution.diameterOfBinaryTree(
                new TreeNode(5,
                        new TreeNode(3),
                        new TreeNode(4))));

        assertEquals(3, solution.diameterOfBinaryTree(
                new TreeNode(5,
                        new TreeNode(3),
                        new TreeNode(4,
                                null,
                                new TreeNode(1)))));


    }

    @Test
    void should_return_depth() {

        assertEquals(0, solution.depth(null));
        assertEquals(1, solution.depth(new TreeNode(5)));
        assertEquals(2,
                solution.depth(
                        new TreeNode(5,
                                new TreeNode(3), null)));

        assertEquals(2,
                solution.depth(
                        new TreeNode(5,
                                new TreeNode(3),
                                new TreeNode(4))));

        assertEquals(3,
                solution.depth(
                        new TreeNode(5,
                                new TreeNode(3),
                                new TreeNode(4,
                                        null,
                                        new TreeNode(1)))));
    }

}