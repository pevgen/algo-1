package ml.pevgen.algo.leetcode.n19;

import ml.pevgen.algo.leetcode.utils.ListNode;

/**
 * <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/">
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/</a>
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode index1 = head;
        ListNode index2 = head;
        for (int i = 0; i < n; i++) {
            index2 = index2.next;
        }

        if (index2 == null) {
            return head.next;
        }

        while (index2.next != null) {
            index2 = index2.next;
            index1 = index1.next;
        }

        index1.next = index1.next.next;

        return head;
    }


}
