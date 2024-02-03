package ml.pevgen.algo.leetcode.n232;

import java.util.Deque;
import java.util.LinkedList;

/**
 * <a href="https://leetcode.com/problems/implement-queue-using-stacks/">
 * https://leetcode.com/problems/implement-queue-using-stacks/</a>
 */
public class MyQueue {

    private final Deque<Integer> stack1 = new LinkedList<>();
    private final Deque<Integer> stack2 = new LinkedList<>();

    /**
     * Pushes element x to the back of the queue
     *
     * @param x element to the back of the queu
     */
    public void push(int x) {
        stack1.push(x);
    }

    /**
     * Removes the element from the front of the queue and returns it
     *
     * @return the element from the front
     */
    public int pop() {
        if (stack2.isEmpty()) {
            fromStack1ToStack2();
        }
        return stack2.pop();
    }

    /**
     * Returns the element at the front of the queue.
     *
     * @return the element at the front
     */
    public int peek() {
        if (stack2.isEmpty()) {
            fromStack1ToStack2();
        }
        return stack2.peek();

    }

    /**
     * Returns true if the queue is empty, false otherwise.
     *
     * @return true if the queue is empty, false otherwise
     */
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    private void fromStack1ToStack2() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }
}
