package ml.pevgen.algo.leetcode.n160;

import ml.pevgen.algo.leetcode.utils.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/intersection-of-two-linked-lists/description/">
 * https://leetcode.com/problems/intersection-of-two-linked-lists/description/</a>
 */
public class IntersectionOfTwoLinkedLists {

    // time O(n + m); memory O(1)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode pointer = headA;
        int lenA = 0;
        while (pointer != null) {
            lenA++;
            pointer = pointer.next;
        }

        int lenB = 0;
        pointer = headB;
        while (pointer != null) {
            lenB++;
            pointer = pointer.next;
        }

        int diffLen = Math.abs(lenB - lenA);
        if (lenB > lenA) {
            for (int i = 1; i <= diffLen; i++) {
                headB = headB.next;
            }
        } else if (lenA > lenB) {
            for (int i = 1; i <= diffLen; i++) {
                headA = headA.next;
            }
        }

        while (headA != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }


    // time O(n + m); memory O(n)
    public ListNode getIntersectionNode_On_memory(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        Set<ListNode> listNodesA = new HashSet<>();

        while (headA != null) {
            listNodesA.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (listNodesA.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }

        return null;
    }
}
