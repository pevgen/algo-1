package ml.pevgen.algo.leetcode.n75;

/**
 * <a href="https://leetcode.com/problems/sort-colors/">
 * https://leetcode.com/problems/sort-colors/</a>
 */
public class SortColors {

    public void sortColors(int[] nums) {
        int c0 = 0;
        int c1 = 0;

        for (int n : nums) {
            if (n == 0) {
                c0++;
            } else if (n == 1) {
                c1++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < c0) {
                nums[i] = 0;
            } else if (i < c0 + c1) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }
}
