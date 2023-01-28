package ml.pevgen.algo.leetcode.n2;

import ml.pevgen.algo.leetcode.utils.ListNode;

/**
 * <a href="https://leetcode.com/problems/add-two-numbers/">
 * https://leetcode.com/problems/add-two-numbers/</a>
 * <p>
 * 127
 * 45
 * ---
 * 172
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tempResult = null;
        int overflow = 0;
        while ((l1 != null) && (l2 != null)) {

            int resVal = l1.val + l2.val + overflow;

            tempResult = new ListNode(resVal % 10, tempResult);
            overflow = resVal > 9 ? 1 : 0;

            l1 = l1.next;
            l2 = l2.next;
        }


        while (l1 != null) {
            int resVal = l1.val + overflow;
            tempResult = new ListNode(resVal % 10, tempResult);
            l1 = l1.next;
            overflow = resVal > 9 ? 1 : 0;
        }

        while (l2 != null) {
            int resVal = l2.val + overflow;
            tempResult = new ListNode(resVal % 10, tempResult);
            l2 = l2.next;
            overflow = resVal > 9 ? 1 : 0;
        }

        if (overflow > 0) {
            tempResult = new ListNode(1, tempResult);
        }

        ListNode header = null;
        if (tempResult != null) {
            while (tempResult != null) {
                header = new ListNode(tempResult.val, header);
                tempResult = tempResult.next;
            }
        }

        return header;
    }

}
