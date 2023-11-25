package ml.pevgen.algo.leetcode.n703;

import java.util.PriorityQueue;

/**
 * <a href="https://leetcode.com/problems/kth-largest-element-in-a-stream/description/">
 * https://leetcode.com/problems/kth-largest-element-in-a-stream/description/</a>
 */
public class KthLargestElementInAStream {

    private final PriorityQueue<Integer> sortedNums = new PriorityQueue<>();
    private final int k;

    public KthLargestElementInAStream(int k, int[] nums) {

        this.k = k;
        for (int num : nums) {
            sortedNums.add(num);
            if (sortedNums.size() > k) {
                sortedNums.remove();
            }
        }
    }

    public Integer add(int val) {
        sortedNums.add(val);
        if (sortedNums.size() > k) {
            sortedNums.remove();
        }
        return sortedNums.peek();
    }
}
