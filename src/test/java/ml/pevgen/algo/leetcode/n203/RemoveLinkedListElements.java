package ml.pevgen.algo.leetcode.n203;

import ml.pevgen.algo.leetcode.utils.ListNode;

/**
 * <a href="https://leetcode.com/problems/remove-linked-list-elements/">
 * https://leetcode.com/problems/remove-linked-list-elements/</a>
 */
public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        // for the first nodes
        while ((head != null) && (head.val == val)) {
            head = head.next;
        }

        // for next nodes
        ListNode realHead = head;
        while (realHead != null) {
            ListNode nextElement = realHead.next;
            while ((nextElement != null) && (nextElement.val == val)) {
                realHead.next = nextElement.next;
                nextElement = nextElement.next;
            }
            realHead = realHead.next;
        }

        return head;
    }
}
