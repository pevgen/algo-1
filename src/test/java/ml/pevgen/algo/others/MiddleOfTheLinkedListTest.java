package ml.pevgen.algo.others;

import ml.pevgen.algo.leetcode.utils.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfTheLinkedListTest {

    private MiddleOfTheLinkedList solution;

    @BeforeEach
    void setUp() {
        solution = new MiddleOfTheLinkedList();
    }


    @Test
    void should_find_a_middle_node() {
        assertEquals(3,
                solution.middleNode(
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(3,
                                                new ListNode(4, new ListNode(5))))))
                        .val);
    }

    @Test
    void should_find_a_middle_of_single_element_list() {
        assertEquals(1,
                solution.middleNode(
                        new ListNode(1))
                        .val);
    }

    @Test
    void should_find_a_second_middle_node() {
        assertEquals(4,
                solution.middleNode(
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(3,
                                                new ListNode(4,
                                                        new ListNode(5,
                                                                new ListNode(6)))))))
                        .val);
    }

}