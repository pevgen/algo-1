package ml.pevgen.algo.leetcode.n347;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.com/problems/top-k-frequent-elements/">
 * https://leetcode.com/problems/top-k-frequent-elements/</a>
 */
public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> cntMap = new HashMap<>();
        for (int n : nums) {
            cntMap.putIfAbsent(n, 0);
            cntMap.put(n, cntMap.get(n) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for (Map.Entry<Integer, Integer> e : cntMap.entrySet()) {
            pq.offer(e);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll().getKey();
        }
        return result;
    }

    public int[] topKFrequentV1(int[] nums, int k) {

        Map<Integer, Long> cntMap = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        return cntMap.entrySet().stream()
                .sorted((es1, es2) -> Math.toIntExact(es2.getValue() - es1.getValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue)
                .toArray();
    }


}
