package ml.pevgen.algo.leetcode.n26;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/</a>
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        var result = 1;
        var prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != prev) {
                prev = nums[i];
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }
}
