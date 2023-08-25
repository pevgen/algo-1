package ml.pevgen.algo.leetcode.n167;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/</a>
 */
public class TwoSumInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;
        while (rightPointer > leftPointer) {
            if (numbers[rightPointer] + numbers[leftPointer] == target) {
                return new int[]{leftPointer + 1, rightPointer + 1};
            }

            if (numbers[rightPointer] + numbers[leftPointer] > target) {
                rightPointer--;
            } else {
                leftPointer++;
            }
        }

        return new int[0];
    }


    public int[] twoSum_v1(int[] numbers, int target) {

        for (int i = 0; i < numbers.length - 1; i++) {
            int resultIndex = Arrays.binarySearch(numbers, i + 1, numbers.length, target - numbers[i]);
            if (resultIndex > 0) {
                return new int[]{i + 1, resultIndex + 1};
            }
        }
        return new int[0];
    }

}


