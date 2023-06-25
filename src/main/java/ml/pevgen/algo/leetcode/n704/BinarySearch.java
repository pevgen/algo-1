package ml.pevgen.algo.leetcode.n704;

/**
 * <a href="https://leetcode.com/problems/binary-search/description/">
 * https://leetcode.com/problems/binary-search/description/</a>
 */
public class BinarySearch {
    public int search(int[] nums, int target) {

        int result = -1;
        int leftIndex = 0;
        int rightIndex = nums.length - 1;

        while (rightIndex - leftIndex > 1) {

            int middle = leftIndex + (rightIndex - leftIndex) / 2;

            if (nums[middle] == target) {
                result = middle;
                break;
            } else if (nums[middle] < target) {
                leftIndex = middle;
            } else {
                rightIndex = middle;
            }
        }

        if (nums[leftIndex] == target) {
            result = leftIndex;
        }
        if (nums[rightIndex] == target) {
            result = rightIndex;
        }
        return result;
    }
}
