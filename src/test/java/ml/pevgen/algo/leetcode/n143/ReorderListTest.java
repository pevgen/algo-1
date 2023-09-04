package ml.pevgen.algo.leetcode.n143;

import ml.pevgen.algo.leetcode.utils.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReorderListTest {

    private ReorderList solution;

    @BeforeEach
    void setUp() {
        solution = new ReorderList();
    }

    @Test
    void should_reorder_4nodes_list() {
        ListNode list =
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4))));

        solution.reorderList(list);

        assertEquals(1, list.val);
        assertEquals(4, list.next.val);
        assertEquals(2, list.next.next.val);
        assertEquals(3, list.next.next.next.val);
    }

    @Test
    void should_reorder_5nodes_list() {
        ListNode list =
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5)))));

        solution.reorderList(list);

        assertEquals(1, list.val);
        assertEquals(5, list.next.val);
        assertEquals(2, list.next.next.val);
        assertEquals(4, list.next.next.next.val);
        assertEquals(3, list.next.next.next.next.val);
    }
}