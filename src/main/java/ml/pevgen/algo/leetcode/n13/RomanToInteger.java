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

    private static final Map<Character, Integer> romanToIntegerMap = new HashMap<>();

    static {
        romanToIntegerMap.put('I', 1);
        romanToIntegerMap.put('V', 5);
        romanToIntegerMap.put('X', 10);
        romanToIntegerMap.put('L', 50);
        romanToIntegerMap.put('C', 100);
        romanToIntegerMap.put('D', 500);
        romanToIntegerMap.put('M', 1000);
    }


    public int romanToInt(String s) {

        if (s.length() == 1) {
            return romanToIntegerMap.get(s.charAt(0));
        }

        int sum = 0;
        int prev = -1;
        boolean minus = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = romanToIntegerMap.get(s.charAt(i));
            if (current > prev) {
                sum = sum + current;
                minus = false;
            } else if (current == prev  && !minus) {
                sum = sum + current;
            } else {
                sum = sum - current;
                minus = true;
            }
            prev = current;
        }
        return sum;
    }


    public int romanToInt_stack_solution(String inputString) {

        Deque<Integer> deque = new LinkedList<>();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            char currentChar = inputString.charAt(i);
            int current = romanToIntegerMap.get(currentChar);
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
