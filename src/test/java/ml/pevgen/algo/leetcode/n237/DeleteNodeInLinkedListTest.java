package ml.pevgen.algo.leetcode.n237;

import ml.pevgen.algo.leetcode.utils.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class DeleteNodeInLinkedListTest {

    private DeleteNodeInLinkedList solution;

    @BeforeEach
    void setUp() {
        solution = new DeleteNodeInLinkedList();
    }

    @Test
    void should_delete_node_in_the_middle() {
        ListNode node =
                new ListNode(4,
                        new ListNode(5,
                                new ListNode(1,
                                        new ListNode(9))));
        assertEquals(4, node.val);
        assertEquals(5, node.next.val);
        assertEquals(1, node.next.next.val);
        assertEquals(9, node.next.next.next.val);
        assertNull(node.next.next.next.next);

        solution.deleteNode(node.next);

        assertEquals(4, node.val);
        assertEquals(1, node.next.val);
        assertEquals(9, node.next.next.val);
        assertNull(node.next.next.next);
    }
}