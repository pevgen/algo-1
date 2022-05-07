package ml.pevgen.algo.leetcode.n54;

/**
 * leetcode 53
 * <a href="https://leetcode.com/problems/maximum-subarray/">https://leetcode.com/problems/maximum-subarray/</a>
 */
public class MaximumSubarray {

    public static void main(String[] args) {


        int[] array = new int[]{-2};
        System.out.println(maxSum(array));  // -2

        int[] array2 = new int[]{-2, 1};
        System.out.println(maxSum(array2));  // -1

        int[] array3 = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSum(array3));  // 6

        int[] array4 = new int[]{-2, 3, 1, -5};
        System.out.println(maxSum(array4));  // 4

        int[] array5 = new int[]{5, 4, -1, 7, 8};
        System.out.println(maxSum(array5));  // 23

    }

    /**
     * O(n) Algorithm Kadane
     */
    private static int maxSum(int[] array) {
        int maxResult = array[0];
        int temporarySum = Math.max(maxResult, 0);
        for (int i = 1; i < array.length; i++) {
            temporarySum = temporarySum + array[i];
            maxResult = Math.max(maxResult, temporarySum);
            if (temporarySum < 0) {
                temporarySum = 0;
            }
        }
        return maxResult;
    }

}
