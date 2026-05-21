package ml.pevgen.algo.leetcode.quest.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Q3ExclusiveTimeOfFunctions {

    public int[] exclusiveTime(int n, List<String> logs) {

        Deque<Integer> stack = new ArrayDeque<>();
        int[] sums = new int[n];
        int prevTimePoint = 0;

        for (String log : logs) {

            int id = Integer.parseInt(log.split(":")[0]);
            String startOrFinish = log.split(":")[1];
            int timePoint = Integer.parseInt(log.split(":")[2]);


            if (startOrFinish.equals("start")) {

                if (!stack.isEmpty()) {
                    int currentFunctionId = stack.peek();
                    sums[currentFunctionId] = sums[currentFunctionId] + (timePoint - prevTimePoint);
                }

                stack.push(id);
                prevTimePoint = timePoint;
            }

            if (startOrFinish.equals("end")) {
                int currentFunctionId = stack.pop();
                sums[currentFunctionId] = sums[currentFunctionId] + (timePoint - prevTimePoint) + 1;
                prevTimePoint = timePoint + 1;
            }
        }
        return sums;
    }
}
