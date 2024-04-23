package ml.pevgen.algo.leetcode.n160;

import ml.pevgen.algo.leetcode.utils.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class IntersectionOfTwoLinkedListsTest {

    private IntersectionOfTwoLinkedLists solution;

    @BeforeEach
    void setUp() {
        solution = new IntersectionOfTwoLinkedLists();
    }

    @Test
    void should_return_null_if_no_interception() {
        assertNull(solution.getIntersectionNode(new ListNode(1), new ListNode(2)));
    }

    @Test
    void should_return_interception() {
        ListNode interception = new ListNode(5, new ListNode(6, new ListNode(7)));
        ListNode headA = new ListNode(1, new ListNode(2, interception));
        ListNode headB = new ListNode(2, new ListNode(4, new ListNode(100, interception)));

        assertEquals(interception, solution.getIntersectionNode(headA, headB));
    }

}