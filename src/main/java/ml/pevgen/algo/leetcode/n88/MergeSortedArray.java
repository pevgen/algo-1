package ml.pevgen.algo.leetcode.n88;

/**
 * <a href="https://leetcode.com/problems/merge-sorted-array/description/">
 * https://leetcode.com/problems/merge-sorted-array/description/</a>
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int current = 0;
        while (current < m + n) {

            if (j == n) {
                return;
            }

            if (i < m) {

                if (nums1[current] <= nums2[j]) {
                    i++;
                } else {
                    rightShift(nums1, current);
                    nums1[current] = nums2[j];
                    j++;
                }
            } else {
                nums1[current] = nums2[j];
                j++;
            }
            current++;
        }

    }

    private void rightShift(int[] nums1, int currentIndex) {
        int i = nums1.length - 1;
        while (i > currentIndex) {
            nums1[i] = nums1[i - 1];
            i--;
        }
    }
}
