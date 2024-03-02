package ml.pevgen.algo.n384;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/shuffle-an-array/description/">
 * https://leetcode.com/problems/shuffle-an-array/description/</a>
 */
public class ShuffleAnArray {

    private final int[] initialArray;
    private final Random random = new Random();

    public ShuffleAnArray(int[] nums) {
        initialArray = Arrays.copyOf(nums, nums.length);
    }

    public int[] reset() {
        return Arrays.copyOf(initialArray, initialArray.length);
    }

    public int[] shuffle() {
        int[] nums = new int[initialArray.length];
        Set<Integer> indexes = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int ind = random.nextInt(initialArray.length);//(int)(Math.random()*initialArray.length);
            while (indexes.contains(ind)) {
                ind = random.nextInt(initialArray.length);//(int)(Math.random()*initialArray.length);
            }
            indexes.add(ind);
            nums[i] = initialArray[ind];
        }
        return nums;
    }
}
