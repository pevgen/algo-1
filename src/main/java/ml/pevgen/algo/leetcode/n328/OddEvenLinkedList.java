package ml.pevgen.algo.leetcode.n328;

import ml.pevgen.algo.leetcode.utils.ListNode;

/**
 * <a href="https://leetcode.com/problems/odd-even-linked-list/description/">
 * https://leetcode.com/problems/odd-even-linked-list/description/</a>
 */
public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        ListNode pOdd = head;
        ListNode nextOdd = pOdd.next.next;
        ListNode pOddEdge = head;
        ListNode pEven = head.next;

        while (pEven != null && nextOdd != null) {

            // 1. Взять след.нечётный
            pOdd = nextOdd;

            ////  перестановка указателей для чётных

            // 2. переставить указатель у текущего чётного на следующий чётный
            pEven.next = pOdd.next;
            // 3. сделать текущим чётным - следующий
            pEven = pEven.next;

            //// перестановка указателей для нечётных

            // 4. Сохранить  следующий нечётный
            if (pOdd.next != null) {
                nextOdd = pOdd.next.next;
            } else {
                nextOdd = null;  // last odd element
            }

            // 5. границу нечётный чётный устанавливаем в новый нечётный
            pOdd.next = pOddEdge.next;

            // 6. переставляем линк с пред.границы на новую
            pOddEdge.next = pOdd;

            // 7. новыя граница нечётных = след.нечётному
            pOddEdge = pOdd;

        }

        return head;
    }
}
