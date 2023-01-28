package ml.pevgen.algo.leetcode.n2;

import ml.pevgen.algo.leetcode.utils.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AddTwoNumbersTest {

    private AddTwoNumbers addTwoNumbers;

    @BeforeEach
    void init() {
        addTwoNumbers = new AddTwoNumbers();
    }

    @Test
    void should_return_null_for_both_null_arguments() {
        assertNull(addTwoNumbers.addTwoNumbers(null, null));
    }

    @Test
    void should_return_the_same_list_for_one_null_argument() {
        assertEquals(0, addTwoNumbers.addTwoNumbers(new ListNode(0, new ListNode(1)), null).val);
        assertEquals(4, addTwoNumbers.addTwoNumbers(null, new ListNode(4, new ListNode(2))).val);
    }

    @Test
    void should_return_simple_number_without_overflow() {
        assertEquals(4, addTwoNumbers.addTwoNumbers(new ListNode(1), new ListNode(3)).val);
    }

    @Test
    void should_return_simple_number_with_overflow() {
        assertEquals(7, addTwoNumbers.addTwoNumbers(new ListNode(8), new ListNode(9)).val);
        assertEquals(1, addTwoNumbers.addTwoNumbers(new ListNode(8), new ListNode(9)).next.val);
    }


    @Test
    void should_return_number_from_longer_argument_with_overflow() {
        assertEquals(7,
                addTwoNumbers.addTwoNumbers(
                        new ListNode(8,
                                new ListNode(5)),
                        new ListNode(9)).val);
        assertEquals(7,
                addTwoNumbers.addTwoNumbers(
                        new ListNode(9),
                        new ListNode(8,
                                new ListNode(5))).val);
    }

    @Test
    void should_return_number_from_longer_argument_no_overflow() {
        assertEquals(9,
                addTwoNumbers.addTwoNumbers(
                        new ListNode(8,
                                new ListNode(5)),
                        new ListNode(1)).val);
        assertEquals(9,
                addTwoNumbers.addTwoNumbers(
                        new ListNode(1),
                        new ListNode(8,
                                new ListNode(5))).val);
    }

    @Test
    void should_return_number__from_example() {
        ListNode result = addTwoNumbers.addTwoNumbers(
                new ListNode(2,
                        new ListNode(4,
                                new ListNode(3))),
                new ListNode(5,
                        new ListNode(6,
                                new ListNode(4)))
        );

        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
    }

}