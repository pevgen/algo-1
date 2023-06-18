package ml.pevgen.algo.leetcode.n203;

import ml.pevgen.algo.leetcode.utils.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class RemoveLinkedListElementsTest {

    private RemoveLinkedListElements solution;

    @BeforeEach
    void setUp() {
        solution = new RemoveLinkedListElements();
    }

    @Test
    void should_return_null_for_null_list() {
        assertNull(solution.removeElements(null, 1));
    }

    @Test
    void should_return_null_for_empty_list_after_removed() {
        assertNull(solution.removeElements(new ListNode(1), 1));
    }

    @Test
    void should_remove_element_from_head_and_return_new_head() {
        assertEquals(2,
                solution.removeElements(
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(3))),
                        1).val);

        assertEquals(3,
                solution.removeElements(
                        new ListNode(1,
                                new ListNode(1,
                                        new ListNode(3))),
                        1).val);
    }

    @Test
    void should_remove_element_and_return_new_head() {
        assertEquals(1,
                solution.removeElements(
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(3))),
                        2).val);

        assertEquals(1,
                solution.removeElements(
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(3))),
                        3).val);
    }

}