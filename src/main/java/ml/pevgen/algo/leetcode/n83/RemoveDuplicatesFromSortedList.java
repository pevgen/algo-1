package ml.pevgen.algo.leetcode.n83;

import ml.pevgen.algo.leetcode.utils.ListNode;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/">
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/</a>
 */
public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }

        // for beginning
        ListNode currentNode = head.next;
        while ((currentNode != null) && (head.val == currentNode.val)) {
            currentNode = currentNode.next;
        }
        head.next = currentNode;

        // for the last nodes
        ListNode oldNode = head;
        while (currentNode != null) {
            while ((currentNode != null) && (oldNode.val == currentNode.val)) {
                currentNode = currentNode.next;
            }
            oldNode.next = currentNode;
            oldNode = oldNode.next;
            if (currentNode != null) {
                currentNode = currentNode.next;
            }
        }

        return head;
    }
}
