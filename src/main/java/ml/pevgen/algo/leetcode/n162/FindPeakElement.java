package ml.pevgen.algo.leetcode.n162;

/**
 * <a href="https://leetcode.com/problems/find-peak-element/description/">
 * https://leetcode.com/problems/find-peak-element/description/</a>
 */
public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex < rightIndex) {
            int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;
            if (nums[middleIndex] < nums[middleIndex + 1]) {
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex;
            }
        }
        return leftIndex;
    }

    public int findPeakElement_bruteForce(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        boolean up = nums[0] < nums[1];
        int cur = nums[1];
        int resultIndex = up ? 1 : 0;

        for (int i = 2; i < nums.length; i++) {
            if (up) {
                if (nums[i] > cur) {
                    cur = nums[i];
                    resultIndex = i;
                } else {
                    resultIndex = i - 1;
                    break;
                }
            } else {
                cur = nums[i];
                if (nums[i] > cur) {
                    up = true;
                }
            }
        }
        return resultIndex;

    }

}
