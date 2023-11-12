package ml.pevgen.algo.leetcode.n199;

import ml.pevgen.algo.leetcode.utils.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeRightSideViewTest {

    private BinaryTreeRightSideView solution;

    @BeforeEach
    void setUp() {
        solution = new BinaryTreeRightSideView();
    }

    @Test
    void should_return_empty_list() {
        assertEquals(0, solution.rightSideView(null).size());
    }

    @Test
    void should_return_one_element_list() {
        List<Integer> result = solution.rightSideView(new TreeNode(100));
        assertEquals(1, result.size());
        assertEquals(100, result.get(0).intValue());
    }

    @Test
    void should_return_right_side_view_example_1() {
        List<Integer> result =
                solution.rightSideView(
                        new TreeNode(1,
                                null,
                                new TreeNode(3)));
        assertEquals(2, result.size());
        assertEquals(1, result.get(0).intValue());
        assertEquals(3, result.get(1).intValue());
    }

    @Test
    void should_return_right_side_view_example_2() {
        List<Integer> result =
                solution.rightSideView(
                        new TreeNode(1,
                                new TreeNode(2,
                                        null,
                                        new TreeNode(5)),
                                new TreeNode(3,
                                        null,
                                        new TreeNode(4))));
        assertEquals(3, result.size());
        assertEquals(1, result.get(0).intValue());
        assertEquals(3, result.get(1).intValue());
        assertEquals(4, result.get(2).intValue());
    }

    @Test
    void should_return_right_side_view_example_3() {
        List<Integer> result =
                solution.rightSideView(
                        new TreeNode(1,
                                new TreeNode(2),
                                null));
        assertEquals(2, result.size());
        assertEquals(1, result.get(0).intValue());
        assertEquals(2, result.get(1).intValue());
    }

}