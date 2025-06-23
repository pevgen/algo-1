package ml.pevgen.algo.others;

import ml.pevgen.algo.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkedListCycleTest {

    private LinkedListCycle solution;

    @BeforeEach
    void setUp() {
        solution = new LinkedListCycle();
    }

    @Test
    void should_has_cycle() {

        ListNode head = new ListNode(1);

        head.next = new ListNode(2,
                new ListNode(2,
                        new ListNode(3,
                                head)));
        Assertions.assertTrue(solution.hasCycle(head));

        head.next = new ListNode(2,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        head))));
        Assertions.assertTrue(solution.hasCycle(head));
    }

    @Test
    void should_has_not_cycle() {
        Assertions.assertFalse(solution.hasCycle(
                new ListNode(1)));
        Assertions.assertFalse(solution.hasCycle(
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3)))));
    }

}