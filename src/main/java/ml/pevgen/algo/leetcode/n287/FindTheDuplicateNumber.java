package ml.pevgen.algo.leetcode.n287;

/**
 * <a href="https://leetcode.com/problems/find-the-duplicate-number/description/">
 * https://leetcode.com/problems/find-the-duplicate-number/description/</a>
 */
public class FindTheDuplicateNumber {

    public int findDuplicate(int[] nums) {
        return twoPointers(nums); //bruteForce(nums);
    }

    /**
     * The main idea: using a correlation between index and values
     * index: [0,n],  values [1,n]
     * 1. Find the loop (a distance between duplicates)
     * 2. Find the duplicate value
     */
    private int twoPointers(int[] nums) {
        // 1.Find a loop (the distance between duplicates)
        int slowPointer = 0;
        int fastPointer = 0;
        do {
            slowPointer = nums[slowPointer];
            fastPointer = nums[nums[fastPointer]];
        } while (nums[fastPointer] != nums[slowPointer]);


        // 2. Find the duplicate value (move window [slowPointer, slowPointer2] until finding duplicates)
        int slowPointer2 = slowPointer;  // distance
        slowPointer = 0;

        while (nums[slowPointer2] != nums[slowPointer]) {
            slowPointer = nums[slowPointer];
            slowPointer2 = nums[slowPointer2];
        }

        return nums[slowPointer];
    }

    private int bruteForce(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
