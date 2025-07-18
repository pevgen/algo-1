package ml.pevgen.algo.others;

import ml.pevgen.algo.leetcode.utils.ListNode;

import java.util.Deque;
import java.util.LinkedList;

public class PalindromeLinkedList {

    // with stack
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }

        Deque<ListNode> stack = new LinkedList<>();
        var node = head;
        while (node != null) {
            stack.push(node);
            node = node.next;
        }

        while (head != null) {
            var currentNode = stack.pop();
            if (currentNode.val != head.val) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
