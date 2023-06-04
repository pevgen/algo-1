package ml.pevgen.algo.leetcode.n303;

/**
 * <a href="https://leetcode.com/problems/range-sum-query-immutable/">
 * https://leetcode.com/problems/range-sum-query-immutable/</a>
 */
public class RangeSumQuery {

    private final int[] sums;

    public RangeSumQuery(int[] nums) {
        sums = new int[nums.length];
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] = sums[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (right == 0) {
            return sums[0];
        }

        if (left == 0) {
            return sums[right];
        }
        return sums[right] - sums[left - 1];
    }
}
