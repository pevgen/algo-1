package ml.pevgen.algo.leetcode.quest.array2;

public class Q1SetMismatch {

    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];


        for (int num : nums) {

            int ind = Math.abs(num) - 1;

            if (nums[ind] < 0) {
                result[0] = Math.abs(num);
            } else {
                nums[ind] = -Math.abs(nums[ind]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[1] = i + 1;
                break;
            }
        }
        return result;
    }

    public int[] findErrorNums_visited(int[] nums) {
        int[] result = new int[2];

        int[] nums2 = new int[nums.length]; // 0,0,0
        for (int num : nums) {
            int index = num - 1;

            if (nums2[index] != 0) {
                result[0] = num;
            }
            nums2[index] = num;
        }

        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] == 0) {
                result[1] = i + 1;
                break;
            }
        }
        return result;
    }
}
