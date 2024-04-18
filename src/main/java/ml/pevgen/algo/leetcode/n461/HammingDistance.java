package ml.pevgen.algo.leetcode.n461;

/**
 * <a href="https://leetcode.com/problems/hamming-distance/description/">
 * https://leetcode.com/problems/hamming-distance/description/</a>
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {
        int diff = x ^ y; // xor
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = result + (diff & 1);  // diff & 1  check right bit (0 or 1)
            diff = diff >> 1;
        }
        return result;
    }
}
