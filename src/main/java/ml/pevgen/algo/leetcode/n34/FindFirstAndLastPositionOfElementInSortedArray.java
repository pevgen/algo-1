package ml.pevgen.algo.leetcode.n34;

/**
 * <a href="https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/">
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/</a>
 */
public class FindFirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        if ((nums.length == 1) && target == nums[0]) {
            return new int[]{0, 0};
        }

        int targetIndex = binarySearch(nums, target);
        if (targetIndex >= 0) {
            int leftIndex = targetIndex;
            while ((leftIndex >= 0) && (nums[leftIndex] == target)) {
                leftIndex--;
            }

            int rightIndex = targetIndex;
            while ((rightIndex < nums.length) && (nums[rightIndex] == target)) {
                rightIndex++;
            }

            return new int[]{++leftIndex, --rightIndex};
        }
        return new int[]{-1, -1};
    }

    int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (left + 1 == right) {
                if (nums[left] == target) {
                    return left;
                }
                if (nums[right] == target) {
                    return right;
                }
                return -1;
            }


            if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return -1;
    }
}
