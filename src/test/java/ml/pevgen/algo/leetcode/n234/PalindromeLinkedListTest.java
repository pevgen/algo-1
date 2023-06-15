package ml.pevgen.algo.leetcode.n234;

import ml.pevgen.algo.leetcode.utils.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeLinkedListTest {

    private PalindromeLinkedList solution;

    @BeforeEach
    void setUp() {
        solution = new PalindromeLinkedList();
    }

    @Test
    void testIsSimplePalindrome() {
        assertTrue(solution.isPalindrome(new ListNode(1)));
        assertTrue(solution.isPalindrome(
                new ListNode(1,
                        new ListNode(1))));
        assertFalse(solution.isPalindrome(
                new ListNode(1,
                        new ListNode(2))));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(solution.isPalindrome(
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(2,
                                                new ListNode(1)))))));

        assertTrue(solution.isPalindrome(
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(3,
                                                new ListNode(2,
                                                        new ListNode(1))))))));

    }

    @Test
    void testIsNotPalindrome() {
        assertFalse(solution.isPalindrome(
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5)))))));

        assertFalse(solution.isPalindrome(
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5,
                                                        new ListNode(6))))))));

        assertFalse(solution.isPalindrome(
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(2,
                                                        new ListNode(1))))))));

    }

}