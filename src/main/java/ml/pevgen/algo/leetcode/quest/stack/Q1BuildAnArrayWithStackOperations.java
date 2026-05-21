package ml.pevgen.algo.leetcode.quest.stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Q1BuildAnArrayWithStackOperations {

    public List<String> buildArray(int[] target, int n) {
        int index = 0;
        List<String> result = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            stack.push(i);
            result.add("Push");
            if (!stack.isEmpty()) {
                if (stack.peek() != target[index]) {
                    stack.pop();
                    result.add("Pop");
                } else {
                    index++;
                    if (index >= target.length) {
                        break;
                    }
                }
            }

        }
        return result;
    }
}
