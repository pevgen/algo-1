package ml.pevgen.algo.leetcode.n268;


import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/missing-number/">
 *     https://leetcode.com/problems/missing-number/</a>
 * <p>
 * O(1) space
 * O(n) time
 *
 */
public class MissingNumber {

    // O(n) - time, O(1) - space
    public int missingNumber(int[] nums) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // sum, min, max of numbers
        for (int num : nums) {
            sum = sum + num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // for missing max element
        if (max < nums.length) {
            return nums.length;
        }

        // the sum of all consecutive numbers
        int allSum = 0;
        for (int i = min; i <= max; i++){
            allSum = allSum + i;
        }

        return allSum - sum;
    }

    // O(1) - space, O(N*LogN) - time
    public int missingNumber_ONlogN(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

}
