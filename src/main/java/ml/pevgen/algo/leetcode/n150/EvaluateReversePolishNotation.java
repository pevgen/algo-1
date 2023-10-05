package ml.pevgen.algo.leetcode.n150;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <a href="https://leetcode.com/problems/evaluate-reverse-polish-notation/">
 * https://leetcode.com/problems/evaluate-reverse-polish-notation/</a>
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            if ("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token)) {
                Integer op1 = stack.pop();
                Integer op2 = stack.pop();
                int opResult;
                switch (token) {
                    case "+":
                        opResult = op1 + op2;
                        break;
                    case "-":
                        opResult = op2 - op1;
                        break;
                    case "*":
                        opResult = op1 * op2;
                        break;
                    case "/":
                        opResult = op2 / op1;
                        break;
                    default:
                        opResult = 0;
                }
                stack.push(opResult);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
