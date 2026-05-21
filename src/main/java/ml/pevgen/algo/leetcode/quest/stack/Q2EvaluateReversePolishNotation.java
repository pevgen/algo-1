package ml.pevgen.algo.leetcode.quest.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q2EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int minuend = stack.pop();
                    int subtrahend =  stack.pop();
                    stack.push(subtrahend - minuend);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int divisor = stack.pop();
                    int divisible = stack.pop();
                    stack.push(divisible / divisor);
                    break;
                default:
                    stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }
}
