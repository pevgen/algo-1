package ml.pevgen.algo.leetcode.n257;

import ml.pevgen.algo.leetcode.utils.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreePathsTest {

    private BinaryTreePaths solution;

    @BeforeEach
    void setUp() {
        solution = new BinaryTreePaths();
    }

    @Test
    void should_return_only_one_value() {
        List<String> result = solution.binaryTreePaths(new TreeNode(1));
        assertEquals("1", result.get(0));
    }

    @Test
    void should_return_list_example_1() {
        List<String> result = solution.binaryTreePaths(
                new TreeNode(1,
                        new TreeNode(2,
                                null,
                                new TreeNode(5)),
                        new TreeNode(3)));
        assertEquals("1->2->5", result.get(0));
        assertEquals("1->3", result.get(1));
    }

}