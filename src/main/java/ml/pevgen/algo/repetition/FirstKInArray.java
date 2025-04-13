package ml.pevgen.algo.repetition;

public class FirstKInArray {

    public int[] findFirstK(int[] input, int k) {
        if (input.length == 0) {
            return new int[]{};
        }

        int[] result = new int[k];
        int previousMax = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            result[i] = findMaxLessThan(input, previousMax);
            previousMax = result[i];
        }
        return result;
    }

    private int findMaxLessThan(int[] input, int previousMax) {
        int max = Integer.MIN_VALUE;
        for (int n : input) {
            if (n > max && n < previousMax) {
                max = n;
            }
        }
        return max;
    }
}
