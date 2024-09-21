package ml.pevgen.algo.leetcode.n328;

import ml.pevgen.algo.leetcode.utils.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenLinkedListTest {

    private OddEvenLinkedList solution;

    @BeforeEach
    void setUp() {
        solution = new OddEvenLinkedList();
    }

    @Test
    void should_return_new_oddEvenList_example_1() {
        ListNode newList = solution.oddEvenList(
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5))))));
        assertNotNull(newList);
        assertEquals(1, newList.val);
        assertEquals(3, newList.next.val);
        assertEquals(5, newList.next.next.val);
        assertEquals(2, newList.next.next.next.val);
        assertEquals(4, newList.next.next.next.next.val);
    }

    @Test
    void should_return_new_oddEvenList_example_2() {

        ListNode newList = solution.oddEvenList(
                new ListNode(2,
                        new ListNode(1,
                                new ListNode(3,
                                        new ListNode(5,
                                                new ListNode(6,
                                                        new ListNode(4,
                                                                new ListNode(7))))))));
        assertNotNull(newList);
        assertEquals(2, newList.val);
        assertEquals(3, newList.next.val);
        assertEquals(6, newList.next.next.val);
        assertEquals(7, newList.next.next.next.val);
        assertEquals(1, newList.next.next.next.next.val);
        assertEquals(5, newList.next.next.next.next.next.val);
        assertEquals(4, newList.next.next.next.next.next.next.val);
    }

    @Test
    void should_return_new_oddEvenList_example_3_even_array_length() {

        ListNode newList = solution.oddEvenList(
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4)))));
        assertNotNull(newList);
        assertEquals(1, newList.val);
        assertEquals(3, newList.next.val);
        assertEquals(2, newList.next.next.val);
        assertEquals(4, newList.next.next.next.val);
    }

    @Test
    void should_return_the_same_list_for_simple_cases() {

        ListNode newList = solution.oddEvenList(null);
        assertNull(newList);

        newList = solution.oddEvenList(new ListNode(1));
        assertNotNull(newList);
        assertEquals(1, newList.val);

        newList = solution.oddEvenList(new ListNode(2, new ListNode(3)));
        assertNotNull(newList);
        assertEquals(2, newList.val);
        assertEquals(3, newList.next.val);

    }


}