package ml.pevgen.algo.leetcode.n338;

/**
 * <a href="https://leetcode.com/problems/counting-bits/description/">
 * https://leetcode.com/problems/counting-bits/description/</a>
 * Good explanation: <a href="https://www.youtube.com/watch?v=yuyL1iJFQWU">...</a>
 */
public class CountingBits {
    public int[] countBits(int n) {
        // TODO for DP
        int[] result = new int[n + 1];
        return result;
    }

    public int[] countBitsSimpleSolution(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            result[i] = countOneNumber(i);
        }
        return result;
    }


    int countOneNumber(int n) {
        int result = 0;
        while (n > 0) {
            result = result + n % 2;
            n = n >> 1;
        }
        return result;
    }

}
