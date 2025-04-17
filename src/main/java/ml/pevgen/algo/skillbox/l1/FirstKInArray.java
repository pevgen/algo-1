package ml.pevgen.algo.skillbox.l1;

public class FirstKInArray {

    public int[] findFirstK(int[] input, int k) {
        if (input.length == 0) {
            return new int[]{};
        }

        int[] result = new int[k];
        boolean[] used = new boolean[input.length];
        int previousMax = Integer.MAX_VALUE;

        for (int i = 0; i < k; i++) {
            result[i] = findMaxLessThan(input, previousMax, used);
            previousMax = result[i];
        }
        return result;
    }

    private int findMaxLessThan(int[] input, int previousMax, boolean[] used) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int j =0; j < input.length; j++) {
            if (input[j] > max && input[j] <= previousMax && !used[j]) {
                max = input[j];
                index = j;
            }
        }
        used[index] = true;
        return max;
    }
}
