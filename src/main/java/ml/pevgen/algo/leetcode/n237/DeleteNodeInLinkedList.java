package ml.pevgen.algo.leetcode.n237;

import ml.pevgen.algo.leetcode.utils.ListNode;

/**
 * <a href="https://leetcode.com/problems/delete-node-in-a-linked-list/description/">
 *     https://leetcode.com/problems/delete-node-in-a-linked-list/description/</a>
 */
public class DeleteNodeInLinkedList {
    public void deleteNode(ListNode node) {
        if (node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
