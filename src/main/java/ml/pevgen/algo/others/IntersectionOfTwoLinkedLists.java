package ml.pevgen.algo.others;

import ml.pevgen.algo.leetcode.utils.ListNode;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode p1 = headA;
        ListNode p2 = headB;

        boolean listA = true;
        boolean listB = true;

        while (p1 != p2) {

            if (p1 == null) {
                if (listA) {
                    p1 = headB;
                    listA = false;
                } else {
                    p1 = headA;
                    listA = true;
                }
            } else {
                p1 = p1.next;
            }

            if (p2 == null) {
                if (listB) {
                    p2 = headA;
                    listB = false;
                } else {
                    p2 = headB;
                    listB = true;
                }
            } else  {
                p2 = p2.next;
            }

        }

        return p1;
    }
}
