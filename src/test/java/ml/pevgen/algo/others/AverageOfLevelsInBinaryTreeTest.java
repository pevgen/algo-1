package ml.pevgen.algo.others;

import ml.pevgen.algo.leetcode.utils.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AverageOfLevelsInBinaryTreeTest {

    private AverageOfLevelsInBinaryTree averageOfLevelsInBinaryTree;

    @BeforeEach
    void setUp() {
        averageOfLevelsInBinaryTree = new AverageOfLevelsInBinaryTree();
    }

    @Test
    void averageOfLevels() {
        // Test case 1: Empty tree
        assertTrue(averageOfLevelsInBinaryTree.averageOfLevels(null).isEmpty());

        // Test case 2: Single node tree
        assertEquals(1.0, averageOfLevelsInBinaryTree.averageOfLevels(new TreeNode(1)).get(0));

        // Test case 3: Two-level tree
        TreeNode root =
                new TreeNode(3,
                        new TreeNode(9),
                        new TreeNode(20,
                                new TreeNode(15),
                                new TreeNode(7))
                );

        assertEquals(List.of(3.0, 14.5, 11.0), averageOfLevelsInBinaryTree.averageOfLevels(root));

        // Test case 4: Three-level tree
        root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5)),
                new TreeNode(3,
                        null,
                        new TreeNode(6)));
        assertEquals(List.of(1.0, 2.5, 5.0), averageOfLevelsInBinaryTree.averageOfLevels(root));
    }
}