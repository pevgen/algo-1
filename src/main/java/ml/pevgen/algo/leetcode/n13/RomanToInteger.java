package ml.pevgen.algo.leetcode.n13;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/roman-to-integer/">
 * https://leetcode.com/problems/roman-to-integer/</a>
 */
public class RomanToInteger {

    private static final Map<String, Integer> romanToIntegerMap = new HashMap<>();

    static {
        romanToIntegerMap.put("I", 1);
        romanToIntegerMap.put("V", 5);
        romanToIntegerMap.put("X", 10);
        romanToIntegerMap.put("L", 50);
        romanToIntegerMap.put("C", 100);
        romanToIntegerMap.put("D", 500);
        romanToIntegerMap.put("M", 1000);
    }

    public int romanToInt(String inputString) {

        Deque<Integer> deque = new LinkedList<>();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            char currentChar = inputString.charAt(i);
            int current = romanToIntegerMap.get(String.valueOf(currentChar));
            Integer prev = 0;
            if (!deque.isEmpty()) {
                prev = deque.peek();
            }
            if (current < prev) {
                deque.pop();
                deque.push(prev - current);
            } else {
                deque.push(current);
            }
        }
        int result = 0;
        while (!deque.isEmpty()) {
            result = result + deque.pop();
        }
        return result;
    }
}
