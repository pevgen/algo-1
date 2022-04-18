package ml.pevgen.algo.algoslerm.fewmaxvalues;

import java.util.PriorityQueue;

public class FewMaxFinderByPriorityQueue {

    public int[] selectFewMaxValues(int[] data, int maxCount) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i : data) {
            priorityQueue.offer(i);
            if (priorityQueue.size() > maxCount) {
                priorityQueue.poll();
            }
        }

        int[] result = new int[priorityQueue.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = priorityQueue.poll();
        }
        return result;
    }
}
