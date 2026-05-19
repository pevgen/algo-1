package ml.pevgen.algo.leetcode.quest.array1;

public class Q1ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] newArray = new int[nums.length];

        int i2 = 0;
        int i3 = n;
        int i = 0;
        while (i < newArray.length) {
            if (i % 2 == 0) {
                newArray[i] = nums[i2];
                i2++;
            } else {
                newArray[i] = nums[i3];
                i3++;
            }
            i++;
        }
        return newArray;
    }
}
