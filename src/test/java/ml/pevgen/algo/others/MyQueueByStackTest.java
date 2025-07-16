package ml.pevgen.algo.others;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueByStackTest {

    private MyQueueByStack queue;

    @BeforeEach
    void setUp() {
        queue =  new MyQueueByStack();
    }

    @Test
    void should_check_queue_ops() {

        queue.push(1); // queue is: [1]
        assertEquals(1, queue.peek());
        assertEquals(1, queue.size());
        assertFalse(queue.empty());

        queue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        assertEquals(2, queue.size());
        assertEquals(1, queue.peek());
        assertEquals(1, queue.pop());
        assertFalse(queue.empty());

        assertEquals(2, queue.peek());
        assertFalse(queue.empty());
        assertEquals(2, queue.pop());
        assertTrue(queue.empty());
    }
}