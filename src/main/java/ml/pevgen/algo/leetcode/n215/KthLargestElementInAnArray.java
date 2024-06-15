package ml.pevgen.algo.leetcode.n215;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * <a href="https://leetcode.com/problems/kth-largest-element-in-an-array/description/">
 * https://leetcode.com/problems/kth-largest-element-in-an-array/description/</a>
 */
public class KthLargestElementInAnArray {

    // with quicksort algorithm
    // Average case time is O(n), worst case time is O(n^2)
    public int findKthLargest_quick_sort(int[] nums, int k) {
        int border = partition(nums, 0, nums.length - 1);
        if (border == k - 1) {
            return nums[border];
        }

        if (border < k - 1) {
            k = k - 1 - border;
            int[] newNums = Arrays.copyOfRange(nums, border + 1, nums.length);
            return findKthLargest_quick_sort(newNums, k);
        }

        int[] newNums = Arrays.copyOfRange(nums, 0, border);
        return findKthLargest_quick_sort(newNums, k);

    }

    private int partition(int[] nums, int leftIndex, int rightIndex) {
        int pivotIndex = leftIndex;

        while (leftIndex < rightIndex) {
            if (nums[leftIndex] > nums[rightIndex]) {
                swap(nums, leftIndex, pivotIndex);
                pivotIndex++;
            }
            leftIndex++;
        }

        swap(nums, rightIndex, pivotIndex);

        return pivotIndex;
    }


    public void swap(int[] nums, int ind1, int ind2) {
        int tmp = nums[ind1];
        nums[ind1] = nums[ind2];
        nums[ind2] = tmp;
    }

    public int findKthLargest(int[] nums, int k) {

        if (nums.length < k) {
            throw new IllegalArgumentException();
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        for (int i : nums) {
            queue.add(i);
        }
        for (int i = 0; i < k - 1; i++) {
            queue.poll();
        }

        return queue.poll();
    }
}
