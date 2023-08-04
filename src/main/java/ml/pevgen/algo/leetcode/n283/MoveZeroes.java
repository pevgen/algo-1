package ml.pevgen.algo.leetcode.n283;

/**
 * <a href="https://leetcode.com/problems/move-zeroes/description/">
 * https://leetcode.com/problems/move-zeroes/description/</a>
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int zeroCounter = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                int newZeroIndex = nums.length - 1 - zeroCounter;
                for (int j = i; j < newZeroIndex; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[newZeroIndex] = 0;
                zeroCounter++;
            }
        }
    }
}
