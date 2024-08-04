package ml.pevgen.algo.leetcode.n230;

import ml.pevgen.algo.leetcode.utils.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthSmallestElementInBSTTest {

    private KthSmallestElementInBST solution;

    @BeforeEach
    void setUp() {
        solution = new KthSmallestElementInBST();
    }

    @Test
    void should_return_root_value_for_one_element_tree() {
        assertEquals(0, solution.kthSmallest(new TreeNode(0), 1));
    }

    @Test
    void should_return_correct_result_example_1() {
        assertEquals(1, solution.kthSmallest(
                new TreeNode(3,
                        new TreeNode(1,
                                null,
                                new TreeNode(2)),
                        new TreeNode(4))
                , 1));
    }

    @Test
    void should_return_correct_result_example_2() {
        assertEquals(3, solution.kthSmallest(
                new TreeNode(5,
                        new TreeNode(3,
                                new TreeNode(2,
                                        new TreeNode(1),
                                        null),
                                new TreeNode(4)),
                        new TreeNode(6))
                , 3));
    }

}