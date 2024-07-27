package ml.pevgen.algo.leetcode.n300;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/longest-increasing-subsequence/">
 * https://leetcode.com/problems/longest-increasing-subsequence/</a>
 */
public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        int[] longestLengthForThisElement = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            longestLengthForThisElement[i] = 1;
            // Dynamic Programming
            // check each previous(!) elements length:
            // (1) if current element is greater than previous
            // and
            // (2) if current length is less than previous length+1
            // than
            // increase current length (+1)
            for (int j = 0; j < i; j++) {
                if ((nums[i] > nums[j])
                        && (longestLengthForThisElement[i] < longestLengthForThisElement[j] + 1)) {
                    longestLengthForThisElement[i] = longestLengthForThisElement[j] + 1;
                }
            }
        }
        // return max length
        Arrays.sort(longestLengthForThisElement);
        return longestLengthForThisElement[longestLengthForThisElement.length - 1];
    }
}
