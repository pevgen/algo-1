package ml.pevgen.algo.hackerrank.w1.d5;

public class MergeTwoSortedLinkedLists {

    SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedListNode result = new SinglyLinkedListNode();
        SinglyLinkedListNode resultHead = result;

        while ((head1 != null) && (head2 != null)) {
            if (head1.data <= head2.data) {
                result.next = head1;
                head1 = head1.next;
            } else {
                result.next = head2;
                head2 = head2.next;
            }
            result = result.next;
        }

        while (head1 != null) {
            result.next = head1;
            head1 = head1.next;
            result = result.next;
        }

        while (head2 != null) {
            result.next = head2;
            head2 = head2.next;
            result = result.next;
        }

        return resultHead.next;

    }
}
