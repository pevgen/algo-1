package ml.pevgen.algo.others;

import ml.pevgen.algo.leetcode.utils.ListNode;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        ListNode p1 = head;
        ListNode p2 = head.next.next;

        while (p1 != p2 && p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }

        return p1 == p2;
    }
}
