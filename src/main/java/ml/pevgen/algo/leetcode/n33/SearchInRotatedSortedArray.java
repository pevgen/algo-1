package ml.pevgen.algo.leetcode.n33;

/**
 * <a href="https://leetcode.com/problems/search-in-rotated-sorted-array/">
 * https://leetcode.com/problems/search-in-rotated-sorted-array/</a>
 */
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {

        int i = 0;
        int j = nums.length - 1;

        if ((j == 0) && (nums[0] == target)) {
            return j;
        }

        while (i < j) {
            // совпало
            if (nums[i] == target) {
                return i;
            }
            if (nums[j] == target) {
                return j;
            }

            // Если nums[i] == nums[j]
            if (nums[i] == nums[j]) {
                return -1;
            }

            if (i == j - 1) {
                return -1;
            }

            int middle = i + (j - i) / 2;

            // Если nums[j] > nums[j]  ----> возрастающая последовательность (4,5,6,7) - обычный бинарный поиск
            if (nums[j] > nums[i]) {

                if (target == nums[middle]) {
                    return middle;
                }

                if (target > nums[middle]) {
                    i = middle;
                } else {
                    j = middle;
                }
            }

            // Если nums[j] < nums[j]  ----> НЕ возрастающая последовательность (8,0,3,5)
            else if (nums[middle] > nums[i]) {
                if (target > nums[i] && target < nums[middle]) {  // в диапазоне
                    j = middle;
                } else {
                    i = middle;
                }
            } else { // nums[middle] < nums[i]
                if (target > nums[middle] && target < nums[j]) {  // в диапазоне
                    i = middle;
                } else {
                    j = middle;
                }
            }
        }

        return -1;
    }

}
