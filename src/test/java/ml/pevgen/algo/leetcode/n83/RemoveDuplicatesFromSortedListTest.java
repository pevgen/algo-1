package ml.pevgen.algo.leetcode.n83;

import ml.pevgen.algo.leetcode.utils.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class RemoveDuplicatesFromSortedListTest {

    private RemoveDuplicatesFromSortedList solution;

    @BeforeEach
    void setUp() {
        solution = new RemoveDuplicatesFromSortedList();
    }


    @Test
    void should_do_nothing_for_one_or_null_nodes() {

        assertNull(solution.deleteDuplicates(null));

        var head = new ListNode(1);
        assertEquals(head, solution.deleteDuplicates(head));
    }

    @Test
    void should_remove_duplicates_from_head() {
        var head = new ListNode(1,
                new ListNode(1,
                        new ListNode(2)));
        var newHead = solution.deleteDuplicates(head);

        assertEquals(head, newHead);
        assertEquals(1, newHead.val);
        assertEquals(2, newHead.next.val);
    }

    @Test
    void should_remove_duplicates_from_tail() {
        var tail = new ListNode(2, new ListNode(2));
        var newHead = solution.deleteDuplicates(
                new ListNode(1, tail));

        assertEquals(1, newHead.val);
        assertEquals(tail, newHead.next);
    }

    @Test
    void should_remove_duplicates_in_the_middle() {

        var tail = new ListNode(3);
        var newHead = solution.deleteDuplicates(
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(2,
                                        tail))));

        assertEquals(1, newHead.val);
        assertEquals(2, newHead.next.val);
        assertEquals(3, newHead.next.next.val);
        assertEquals(tail, newHead.next.next);


    }

}