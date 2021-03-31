package ml.pevgen.algo.algo1.twostackdijkstra;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Dijkstra Two Stack Algorithm. Simplified
 *
 * Preconditions (see unit tests):
 *  - all operations enclosed in parentheses
 *  - all operands are separated by spaces
 */
public class DijkstraTwoStackSimplifiedImplementation {

    private final Deque<String> ops = new ArrayDeque<>();
    private final Deque<Integer> numbers = new ArrayDeque<>();

    public double calculate(String expression) {

        String[] tokens = expression.split(" ");

        for (var token : tokens) {
            switch (token) {
                case "(":
                case "":
                case " ":
                    break;
                case "+":
                case "-":
                case "*":
                case ":":
                    ops.push(token);
                    break;
                case ")":
                    doOperation();
                    break;
                default:
                    numbers.push(Integer.parseInt(token));
            }
        }
        return numbers.pop();
    }

    private void doOperation() {
        int second = numbers.pop();
        int first = numbers.pop();
        switch (ops.pop()) {
            case "+":
                numbers.push(first + second);
                break;
            case "-":
                numbers.push(first - second);
                break;
            case "*":
                numbers.push(first * second);
                break;
            case ":":
                numbers.push(first / second);
                break;
            default:
        }

    }

}
