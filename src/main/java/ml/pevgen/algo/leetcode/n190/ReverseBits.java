package ml.pevgen.algo.leetcode.n190;

/**
 * <a href="https://leetcode.com/problems/reverse-bits/">https://leetcode.com/problems/reverse-bits/</a>
 */
public class ReverseBits {

    public int reverseBits(int n) {
        int in = n;
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = result << 1;  // result*2
            if ((n % 2 == 1) || (n % 2 == -1)) {
                result = result + 1;
            }
            n = n >> 1;  // n/2  (but unsigned (32nd digit = 0))
        }
//        System.out.println("in: " + Integer.toBinaryString(in) + "; out: " + Integer.toBinaryString(result));
        return result;

    }
}
