package ml.pevgen.algo.hackerrank.w1.d5;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueUsingTwoStacks<T> {

    private final Deque<T> stackIn = new ArrayDeque<>();
    private final Deque<T> stackOut = new ArrayDeque<>();


    public void push(T element) {
//        while (!stackOut.isEmpty()) {
//            stackIn.push(stackOut.pop());
//        }
        stackIn.push(element);
    }

    public T pop() {
        if (stackOut.isEmpty()) {
            while (!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
            }
        }
        return stackOut.pop();
    }

    public T print() {
        if (stackOut.isEmpty()) {
            while (!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
            }
        }
        System.out.println(stackOut.peek());
        return stackOut.peek();
    }

}
