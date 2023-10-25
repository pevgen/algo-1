package ml.pevgen.algo.leetcode.n153;

/**
 * <a href="https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/">
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/</a>
 */
public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int indexLeft = 0;
        int indexRight = nums.length - 1;
        while (indexRight > indexLeft + 1) {

            int newIndex = indexLeft + (indexRight - indexLeft) / 2;

            if (nums[indexRight] > nums[indexLeft]) {
                indexRight = newIndex;
            } else if (nums[indexRight] > nums[newIndex]) {
                indexRight = newIndex;
            } else {
                indexLeft = newIndex;
            }
        }

        if (indexRight == indexLeft) {
            return nums[indexLeft];
        }
        return Math.min(nums[indexRight], nums[indexLeft]);
    }
}
