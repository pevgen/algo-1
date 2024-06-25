package ml.pevgen.algo.leetcode.n172;

/**
 * <a href="https://leetcode.com/problems/factorial-trailing-zeroes/description/">
 * https://leetcode.com/problems/factorial-trailing-zeroes/description/</a>
 */
public class FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        if (n < 5) {
            return 0;
        }

        int result = 0;
        while (n > 0) {
            n = n / 5;
            result = result + n;
        }
        return result;
    }


}
