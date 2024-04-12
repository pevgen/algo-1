package ml.pevgen.algo.leetcode.n198;

/**
 * <a href="https://leetcode.com/problems/house-robber/description/">
 * https://leetcode.com/problems/house-robber/description/</a>
 */
public class HouseRobber {

    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] accumulatedSumArray = new int[nums.length];

        accumulatedSumArray[0] = nums[0];
        accumulatedSumArray[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            accumulatedSumArray[i] = Math.max(accumulatedSumArray[i - 2] + nums[i], accumulatedSumArray[i - 1]);
        }
        return accumulatedSumArray[accumulatedSumArray.length - 1];
    }


}
