package ml.pevgen.algo.leetcode.n876;

import ml.pevgen.algo.leetcode.utils.ListNode;

/**
 * <a href="https://leetcode.com/problems/middle-of-the-linked-list/">
 * https://leetcode.com/problems/middle-of-the-linked-list/</a>
 */
public class MiddleOfTheLinkedList {

    public ListNode middleNode(ListNode head) {
        int count = 1;
        // find tail
        ListNode head2 = head;
        while (head2.next != null) {
            count++;
            head2 = head2.next;
        }

        int middle = count / 2 + 1;
        for (int i = 2; i <= middle; i++) {
            head = head.next;
        }

        return head;
    }
}
