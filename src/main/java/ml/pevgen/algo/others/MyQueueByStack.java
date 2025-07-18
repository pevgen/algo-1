package ml.pevgen.algo.others;

import java.util.Deque;

public class MyQueueByStack {

    private final Deque<Integer> stackTail = new java.util.ArrayDeque<>();
    private final Deque<Integer> stackHead = new java.util.ArrayDeque<>();


    public void push(int x) {
        stackTail.push(x);

    }

    public int pop() {
        if (empty()) {
            throw new RuntimeException("No values in the queue");
        }

        if (stackHead.isEmpty()) {
            fromTailToHead();
        }
        return stackHead.pop();
    }

    public int peek() {
        if (empty()) {
            throw new RuntimeException("No values in the queue");
        }

        if (stackHead.isEmpty()) {
            fromTailToHead();
        }
        return stackHead.peek();
    }

    public boolean empty() {
        return stackTail.isEmpty() && stackHead.isEmpty();
    }

    public int size() {
        return stackTail.size() + stackHead.size();
    }


    private void fromTailToHead(){
        while (!stackTail.isEmpty()){
            stackHead.push(stackTail.pop());
        }
    }
}
