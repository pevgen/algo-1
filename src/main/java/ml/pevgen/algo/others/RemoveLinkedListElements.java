package ml.pevgen.algo.others;

import ml.pevgen.algo.leetcode.utils.ListNode;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        // find start node
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return null;
        }

        ListNode startNode = new ListNode(-1, head);
        ListNode prev = startNode;

        while (head != null) {
            if (head.val != val) {
                prev.next = head;
                prev = prev.next;
            }
            head = head.next;
        }
        prev.next = null;

        return startNode.next;
    }
}
