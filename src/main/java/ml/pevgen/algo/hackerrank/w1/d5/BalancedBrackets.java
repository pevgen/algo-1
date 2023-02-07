package ml.pevgen.algo.hackerrank.w1.d5;

import java.util.*;

public class BalancedBrackets {

    public String isBalanced(String str) {

        if (str == null || str.isEmpty() || ((str.length() % 2) != 0)) {
            return "NO";
        }

        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        Set<Character> leftPart = map.keySet();
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (leftPart.contains(ch)) {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                Character pair = map.get(stack.pop());
                if (!ch.equals(pair)) {
                    return "NO";
                }
            }
        }
        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
