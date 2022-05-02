package ml.pevgen.algo.leetcode.n21;

import static java.lang.System.out;

/**
 * leetcode N21
 * <p>
 * Merge Two Sorted Lists
 *
 * <a href="https://leetcode.com/problems/merge-two-sorted-lists/">https://leetcode.com/problems/merge-two-sorted-lists/</a>
 */
public class MergeTwoSortedLists {

    public static void main(String[] args) {
        out.println(mergeTwoListsRecursively(null, null));
        out.println(mergeTwoListsRecursively(new ListNode(), null));
        out.println(mergeTwoListsRecursively(null, new ListNode()));

        ListNode l3 = new ListNode(3);
        ListNode l1 = new ListNode(1, l3);

        ListNode l4 = new ListNode(4);
        ListNode l2 = new ListNode(2, l4);

        out.println(mergeTwoListsRecursively(l1, l2));

    }

    public static ListNode mergeTwoListsRecursively(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode result;
        if (list1.val <= list2.val) {
            result = list1;
            result.next = mergeTwoListsRecursively(list1.next, list2);
        } else {
            result = list2;
            result.next = mergeTwoListsRecursively(list1, list2.next);
        }
        return result;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "val=" + val + ", next=" + next;
        }
    }
}
