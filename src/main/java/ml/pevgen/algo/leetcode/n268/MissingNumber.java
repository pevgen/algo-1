package ml.pevgen.algo.leetcode.n268;


import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/missing-number/">https://leetcode.com/problems/missing-number/</a>
 *
 * O(1) extra space complexity (the same array)
 * O(n) runtime complexity (sort - O(N*logN); for - O(N); O(N*logN) < O(N) )
 *
 */
public class MissingNumber {

    public static void main(String[] args) {
        System.out.println("result [2]: " + new MissingNumber().missingNumber(new int[]{0, 1}));
        System.out.println("result [2]: " + new MissingNumber().missingNumber(new int[]{3, 0, 1}));
        System.out.println("result [8]: " + new MissingNumber().missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}
