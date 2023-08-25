package ml.pevgen.algo.leetcode.n238;

/**
 * <a href="https://leetcode.com/problems/product-of-array-except-self/">
 * https://leetcode.com/problems/product-of-array-except-self/</a>
 */
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        int len = nums.length;
        int[] desc = new int[len];
        int[] asc = new int[len];
        asc[0] = nums[0];
        desc[len - 1] = nums[len - 1];
        for (int i = 1, j = len - 2; i < len; i++, j--) {
            asc[i] = asc[i - 1] * nums[i];
            desc[j] = desc[j + 1] * nums[j];
        }

        int[] result = new int[len];
        if (len > 1) {
            result[0] = desc[1];
            result[len - 1] = asc[len - 2];
        }
        for (int i = 1; i < len - 1; i++) {
            result[i] = asc[i - 1] * desc[i + 1];
        }
        return result;
    }
}
