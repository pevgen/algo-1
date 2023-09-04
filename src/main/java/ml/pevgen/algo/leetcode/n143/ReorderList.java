package ml.pevgen.algo.leetcode.n143;

import ml.pevgen.algo.leetcode.utils.ListNode;

/**
 * <a href="https://leetcode.com/problems/reorder-list/">
 * https://leetcode.com/problems/reorder-list/</a>
 */
public class ReorderList {
    public void reorderList(ListNode head) {

        // find middle
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse second part
        ListNode reverseHead = slow.next;
        slow.next = null;

        ListNode prev = null;
        while (reverseHead != null) {
            ListNode temp = reverseHead.next;
            reverseHead.next = prev;
            prev = reverseHead;
            reverseHead = temp;
        }

        // merge two lists
        ListNode forwardHead = head;
        reverseHead = prev;
        while (reverseHead != null) {
            ListNode forwardNext = forwardHead.next;
            ListNode reverseNext = reverseHead.next;
            forwardHead.next = reverseHead;

            reverseHead.next = forwardNext;
            forwardHead = forwardNext;
            reverseHead = reverseNext;
        }

    }
}
