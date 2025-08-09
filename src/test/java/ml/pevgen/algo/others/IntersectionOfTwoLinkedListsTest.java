package ml.pevgen.algo.others;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ml.pevgen.algo.leetcode.utils.ListNode;

class IntersectionOfTwoLinkedListsTest {
    
    private final IntersectionOfTwoLinkedLists solution = new IntersectionOfTwoLinkedLists();
    
    @Test
    void testIntersectingLists() {
        ListNode common = new ListNode(8, new ListNode(4, new ListNode(5)));
        ListNode headA = new ListNode(4, new ListNode(1, common));
        ListNode headB = new ListNode(5, new ListNode(6, new ListNode(1, common)));

        assertEquals(common, solution.getIntersectionNode(headA, headB));
    }
    
    @Test
    void testNonIntersectingLists() {
        ListNode headA = new ListNode(2, new ListNode(6, new ListNode(4)));
        ListNode headB = new ListNode(1, new ListNode(5));
        
        assertNull(solution.getIntersectionNode(headA, headB));
    }
    
    @Test
    void testNullInputs() {
        assertNull(solution.getIntersectionNode(null, null));
        assertNull(solution.getIntersectionNode(new ListNode(1), null));
        assertNull(solution.getIntersectionNode(null, new ListNode(1)));
    }
    
    @Test
    void testSingleNodeIntersection() {
        ListNode common = new ListNode(1);

        assertEquals(common, solution.getIntersectionNode(common, common));
    }
    
    @Test
    void testDifferentLengthLists() {
        ListNode common = new ListNode(2, new ListNode(4));
        ListNode headA = new ListNode(1, new ListNode(9, new ListNode(1, common)));

        assertEquals(common, solution.getIntersectionNode(headA, common));
     }
}