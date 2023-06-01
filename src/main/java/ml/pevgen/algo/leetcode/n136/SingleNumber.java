package ml.pevgen.algo.leetcode.n136;

/**
 * <a href="https://leetcode.com/problems/single-number/">
 * https://leetcode.com/problems/single-number/</a>
 * <p>
 * The idea:
 * XOR of zero and some bit returns that bit
 * a^0 = a
 * XOR of two same bits returns 0
 * a^a = 0
 * XOR of a^b^a for some bits a and b returns b
 * a^b^a = (a^a)^b = 0^b = b
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result = result ^ i;
        }
        return result;
    }
}
