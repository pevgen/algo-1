package ml.pevgen.algo.leetcode.n977;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/squares-of-a-sorted-array/">
 *     https://leetcode.com/problems/squares-of-a-sorted-array/</a>
 */
public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {

        // find zero or positive number
        int positiveOrZeroIndex = Arrays.binarySearch(nums, 0);
        if (positiveOrZeroIndex < 0) {
            positiveOrZeroIndex = -1*positiveOrZeroIndex - 1;
        }

        int positiveIndex = positiveOrZeroIndex;
        int negativeIndex = positiveOrZeroIndex - 1;
        int[] result = new int[nums.length];
        int resultIndex = 0;

        while (positiveIndex < nums.length && negativeIndex > -1) {
          if (nums[positiveIndex] < Math.abs(nums[negativeIndex])) {
              result[resultIndex] = nums[positiveIndex] * nums[positiveIndex];
              positiveIndex++;
              resultIndex++;
          } else if (nums[positiveIndex] > Math.abs(nums[negativeIndex])) {
              result[resultIndex] = nums[negativeIndex] * nums[negativeIndex];
              negativeIndex--;
              resultIndex++;
          } else {
              result[resultIndex] = nums[positiveIndex] * nums[positiveIndex];
              positiveIndex++;
              resultIndex++;
              result[resultIndex] = nums[negativeIndex] * nums[negativeIndex];
              negativeIndex--;
              resultIndex++;
          }
        }

        while (negativeIndex > -1) {
            result[resultIndex] = nums[negativeIndex] * nums[negativeIndex];
            negativeIndex--;
            resultIndex++;
        }

        while (positiveIndex < nums.length) {
            result[resultIndex] = nums[positiveIndex] * nums[positiveIndex];
            positiveIndex++;
            resultIndex++;
        }

        return result;
    }
}
