package ml.pevgen.algo.hackerrank.w1.d5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeTwoSortedLinkedListsTest {

    private MergeTwoSortedLinkedLists mergeTwoSortedLinkedLists;

    @BeforeEach
    void setUp() {
        mergeTwoSortedLinkedLists = new MergeTwoSortedLinkedLists();
    }

    @Test
    void should_merge_simple_lists() {
        SinglyLinkedListNode n1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode n2 = new SinglyLinkedListNode(2);

        SinglyLinkedListNode result = mergeTwoSortedLinkedLists.mergeLists(n1, n2);
        assertEquals(1, result.data);
    }

    @Test
    void should_merge_lists() {
        SinglyLinkedListNode n1 =
                new SinglyLinkedListNode(2,
                        new SinglyLinkedListNode(3,
                                new SinglyLinkedListNode(5)));


        SinglyLinkedListNode n2 =
                new SinglyLinkedListNode(1,
                        new SinglyLinkedListNode(4,
                                new SinglyLinkedListNode(6)));

        SinglyLinkedListNode result = mergeTwoSortedLinkedLists.mergeLists(n1, n2);
        assertEquals(1, result.data);
    }

}