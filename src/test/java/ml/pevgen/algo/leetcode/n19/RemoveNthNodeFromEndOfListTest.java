package ml.pevgen.algo.leetcode.n19;

import ml.pevgen.algo.leetcode.utils.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class RemoveNthNodeFromEndOfListTest {

    private RemoveNthNodeFromEndOfList solution;

    @BeforeEach
    void setUp() {
        solution = new RemoveNthNodeFromEndOfList();
    }

    @Test
    void should_remove_null_for_short_list() {

        assertNull(solution.removeNthFromEnd(null, 1));
        assertNull(solution.removeNthFromEnd(new ListNode(1), 2));

    }

    @Test
    void should_remove_Nth_element_from_the_end() {

        ListNode result = solution.removeNthFromEnd(
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5))))), 2);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(5, result.next.next.next.val);

    }

    @Test
    void should_remove_Nth_element_in_the_middle() {

        ListNode result = solution.removeNthFromEnd(
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5))))), 3);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(4, result.next.next.val);
        assertEquals(5, result.next.next.next.val);

    }

    @Test
    void should_remove_Nth_element_from_the_end_odd() {

        ListNode result = solution.removeNthFromEnd(
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4)))), 3);

        assertEquals(1, result.val);
        assertEquals(3, result.next.val);
        assertEquals(4, result.next.next.val);
    }

    @Test
    void should_remove_last_element() {

        ListNode result = solution.removeNthFromEnd(
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4)))), 1);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @Test
    void should_remove_first_element() {

        ListNode result = solution.removeNthFromEnd(
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5))))), 5);

        assertEquals(2, result.val);
        assertEquals(3, result.next.val);
        assertEquals(4, result.next.next.val);
        assertEquals(5, result.next.next.next.val);

    }
}