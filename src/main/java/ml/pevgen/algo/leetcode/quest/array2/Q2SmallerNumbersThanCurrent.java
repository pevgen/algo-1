package ml.pevgen.algo.leetcode.quest.array2;

public class Q2SmallerNumbersThanCurrent {


    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int[] sums = new int[101];  //task constrain

        // How many the same numbers
        // index = number
        for (int num : nums) {
            sums[num]++;
        }
        // accumulated sum
        for (int i = 1; i < sums.length; i++) {
            sums[i] = sums[i - 1] + sums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[i] = sums[nums[i] - 1];
            }
        }

        return result;
    }


    public int[] smallerNumbersThanCurrent_brute(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int counter = 0;
            for (int num : nums) {
                if (num < nums[i]) {
                    counter++;
                }
                result[i] = counter;
            }
        }
        return result;
    }
}
