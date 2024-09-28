package ml.pevgen.algo.leetcode.n116;

import ml.pevgen.algo.leetcode.utils.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PopulatingNextRightPointersInEachNodeTest {

    private PopulatingNextRightPointersInEachNode solution;

    @BeforeEach
    void setUp() {
        solution = new PopulatingNextRightPointersInEachNode();
    }

    @Test
    void should_return_null_for_null_input() {
        assertNull(solution.connect(null));
    }


    @Test
    void should_return_connected_tree_example_1() {
        Node result = solution.connect(
                new Node(1)
        );
        assertNotNull(result);
        assertNull(result.next);
    }

    @Test
    void should_return_connected_tree_example_2() {
        Node result = solution.connect(
                new Node(1,
                        new Node(2),
                        new Node(3))
        );
        assertNotNull(result);
        assertNotNull(result.left);
        assertNotNull(result.right);
        assertEquals(result.right, result.left.next);
    }

    @Test
    void should_return_connected_tree_example_3() {
        Node result = solution.connect(
                new Node(1,
                        new Node(2,
                                new Node(4),
                                new Node(5)),
                        new Node(3,
                                new Node(6),
                                new Node(7)),
                        null)
        );
        assertNotNull(result);
        assertNotNull(result.left);
        assertNotNull(result.right);
        assertEquals(result.right, result.left.next);

        assertEquals(result.left.right, result.left.left.next);
        assertEquals(result.right.right, result.right.left.next);

        assertEquals(result.right.left, result.left.right.next);
    }


    @Test
    void should_return_connected_tree_example_4() {
        Node result = solution.connect(
                new Node(-1,
                        new Node(0,
                                new Node(2,
                                        new Node(6),
                                        new Node(7)),
                                new Node(3,
                                        new Node(8),
                                        new Node(9))),
                        new Node(1,
                                new Node(4,
                                        new Node(10),
                                        new Node(11)),
                                new Node(5,
                                        new Node(12),
                                        new Node(13))),
                        null)
        );
        assertNotNull(result);

        assertEquals(result.left.next, result.right);
        assertEquals(result.left.right.next, result.right.left);
        assertEquals(result.left.right.right.next, result.right.left.left);
    }
}
