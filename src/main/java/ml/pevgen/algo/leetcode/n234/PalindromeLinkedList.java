package ml.pevgen.algo.leetcode.n234;

import ml.pevgen.algo.leetcode.utils.ListNode;

/**
 * <a href="https://leetcode.com/problems/palindrome-linked-list/">
 * https://leetcode.com/problems/palindrome-linked-list/</a>
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {

        // 1. Двумя указателями искать середину
        // 2. Первый указатель делает в первой части reverse list
        // 3. Когда найдена середина   (1<-2<-3->4->5)
        //   - от первого указателя (который на середине)
        //   - идём в две строны от середины, сравнивая

        if (head.next == null) {  // one element
            return true;
        }

        if (head.next.next == null) {  // two element
            return head.val == head.next.val;
        }

        ListNode forwardPointer = head;
        ListNode reversePointer = null;
        ListNode doublePointer = head;
        boolean even = false;

        while (doublePointer.next != null) {
            if (doublePointer.next.next == null) {
                even = true;
                break;
            } else {
                doublePointer = doublePointer.next.next;
            }

            // reverse links
            ListNode nextPointer = forwardPointer.next;
            forwardPointer.next = reversePointer;
            reversePointer = forwardPointer;
            forwardPointer = nextPointer;

        }

        // reverse middle node
        ListNode nextPointer = forwardPointer.next;
        forwardPointer.next = reversePointer;
        reversePointer = forwardPointer;
        forwardPointer = nextPointer;

        // check palindrome
        if (!even) {
            reversePointer = reversePointer.next;
        }

        boolean result = true;
        while (reversePointer != null) {
            if (reversePointer.val != forwardPointer.val) {
                result = false;
                break;
            }
            reversePointer = reversePointer.next;
            forwardPointer = forwardPointer.next;
        }

        return result;
    }

}
