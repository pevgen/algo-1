package ml.pevgen.algo.leetcode.n232;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyQueueTest {

    private MyQueue solution;

    @BeforeEach
    void setUp() {
        solution = new MyQueue();
    }

    @Test
    void should_check_1_element() {
        assertTrue(solution.empty());
        solution.push(1);
        assertEquals(1, solution.peek());
        assertEquals(1, solution.pop());
        assertTrue(solution.empty());
    }

    @Test
    void should_check_2_elements() {
        assertTrue(solution.empty());
        solution.push(1);
        solution.push(2);
        assertEquals(1, solution.peek());
        assertEquals(1, solution.pop());
        assertEquals(2, solution.peek());
        assertEquals(2, solution.pop());
        assertTrue(solution.empty());
    }
}