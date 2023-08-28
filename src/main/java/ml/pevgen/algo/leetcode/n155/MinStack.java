package ml.pevgen.algo.leetcode.n155;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <a href="https://leetcode.com/problems/min-stack/">
 * https://leetcode.com/problems/min-stack/</a>
 */

public class MinStack {

    private final Deque<Integer> deque = new ArrayDeque<>();
    private final Deque<Integer> minimums = new ArrayDeque<>();

    public void push(int val) {
        deque.push(val);

        if (minimums.isEmpty() || (val < minimums.peek())) {
            minimums.push(val);
        } else {
            minimums.push(minimums.peek());
        }
    }

    public void pop() {
        deque.pop();
        minimums.pop();
    }

    public int top() {
        return deque.peek();
    }

    public int getMin() {
        return minimums.peek();
    }
}

