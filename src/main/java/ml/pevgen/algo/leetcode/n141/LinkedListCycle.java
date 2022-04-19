package ml.pevgen.algo.leetcode.n141;

/**
 * Linked List Cycle - search cycle in the list
 * <a href="https://leetcode.com/problems/linked-list-cycle/">https://leetcode.com/problems/linked-list-cycle/</a>
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while (fastPointer != null) {
            fastPointer = fastPointer.next;  // first step for fast pointer
            if (fastPointer == null) {
                return false;
            }
            fastPointer = fastPointer.next;           // second step  for fast pointer
            if (fastPointer == null) {
                return false;
            }

            slowPointer = slowPointer.next;  // one step of slow pointer
            if (slowPointer == fastPointer) {
                return true;
            }
        }

        return false;
    }
}

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

