package ml.pevgen.algo.leetcode.n191;

/**
 * <a href="https://leetcode.com/problems/number-of-1-bits/">
 * https://leetcode.com/problems/number-of-1-bits/</a>
 */
public class NumberOf1Bits {

    public int hammingWeight(int n) {
        int result = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                result++;
            }
            n = n >> 1;
        }
        return result;
    }
}
