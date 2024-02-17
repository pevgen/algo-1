package ml.pevgen.algo.leetcode.n189;

/**
 * <a href="https://leetcode.com/problems/rotate-array/description/">
 * https://leetcode.com/problems/rotate-array/description/</a>
 */
public class RotateArray {

    // solution with reverse
    public void rotate(int[] nums, int k) {
        k = k % nums.length;                                          // 1 2 3 4 5 6 7  (k = 2)
        // reverse full array
        reverseSubarray(nums, 0, nums.length - 1);  // 7 6    5 4 3 2 1
        // reverse first k elements
        reverseSubarray(nums, 0, k - 1);            // 6 7    5 4 3 2 1
        // reverse last elements (from k to the end)
        reverseSubarray(nums, k, nums.length - 1);           // 6 7    1 2 3 4 5
    }

    void reverseSubarray(int[] arr, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = arr[endIndex];
            arr[endIndex] = arr[startIndex];
            arr[startIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

    public void rotate_with_additional_memory(int[] nums, int k) {

        k = k % nums.length;

        int[] tempArrayK = new int[k];
        // save tail
        int tempInd = 0;
        for (int i = nums.length - k; i < nums.length; i++) {
            tempArrayK[tempInd++] = nums[i];
        }

        // shift nums
        for (int i = nums.length - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        // update head
        for (int i = 0; i < k; i++) {
            nums[i] = tempArrayK[i];
        }

    }
}
