package ml.pevgen.algo.hackerrank.w1.d5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueUsingTwoStacksTest {

    private QueueUsingTwoStacks<Integer> queue;

    @BeforeEach
    void setUp() {
        queue = new QueueUsingTwoStacks<>();
    }

    @Test
    void should_push_pop() {
        queue.push(1);
        queue.push(3);
        queue.push(5);
        assertEquals(1, queue.pop());
        assertEquals(3, queue.pop());
        assertEquals(5, queue.pop());
    }

    @Test
    void should_print_5() {

        queue.push(1);
        queue.push(3);
        queue.push(5);
        assertEquals(1, queue.pop());
        assertEquals(3, queue.pop());
        queue.print(); // 5
    }


    @Test
    void should_print_example(){

        queue.push(42); //1 42
        assertEquals(42, queue.pop()); //2
        queue.push(14); // 1 14
        queue.print(); //        3
        queue.push(28); // 1 28
        queue.print(); //        3
        queue.push(60);//1 60
        queue.push(78); //1 78
        assertEquals(14, queue.pop()); //2
        assertEquals(28, queue.pop()); //2
    }

}