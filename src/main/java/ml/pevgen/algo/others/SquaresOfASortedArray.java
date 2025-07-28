package ml.pevgen.algo.others;

public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {

        if (nums.length == 0) {
            return new int[]{};
        }

        int[] result = new int[nums.length];

        if (nums[0] >= 0) {
            for (int i = 0; i < nums.length; i++) {
                result[i] = nums[i] * nums[i];
            }
            return result;
        }

        if (nums[nums.length - 1] < 0) {
            for (int i = nums.length - 1, j = 0; i >= 0; i--, j++) {
                result[j] = nums[i] * nums[i];
            }
            return result;
        }

        // find first positive value
        int positiveIndex = -1;
        int negativeIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                positiveIndex = i;
                negativeIndex = i - 1;
                break;
            }
        }

        int ind = -1;
        while (negativeIndex >= 0 || positiveIndex < nums.length) {
            ind++;
            if (negativeIndex >= 0 && (positiveIndex >= nums.length || nums[positiveIndex] >= Math.abs(nums[negativeIndex]))) {
                result[ind] = nums[negativeIndex] * nums[negativeIndex];
                negativeIndex--;
                continue;
            }

            result[ind] = nums[positiveIndex] * nums[positiveIndex];
            positiveIndex++;
        }

        return result;
    }
}
