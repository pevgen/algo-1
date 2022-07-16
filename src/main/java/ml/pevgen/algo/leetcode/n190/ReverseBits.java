package ml.pevgen.algo.leetcode.n190;

/**
 * <a href="https://leetcode.com/problems/reverse-bits/">https://leetcode.com/problems/reverse-bits/</a>
 */
public class ReverseBits {

    public static void main(String[] args) {
//        System.out.println("result = " + (new ReverseBits().reverseBits(2) == 1));
//        System.out.println("result = " + (new ReverseBits().reverseBits(5) == 5));
        System.out.println("result = " + (new ReverseBits().reverseBits(43261596) == 964176192));
        System.out.println("result = " + (new ReverseBits().reverseBits(-3) == -1073741825));

    }

    public int reverseBits(int n) {
        int in = n;
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = result << 1;
            if ((n % 2 == 1) || (n % 2 == -1)) {
                result = result + 1;
            }
            n = n >> 1;
        }
        System.out.println("in: " + Integer.toBinaryString(in) + "; out: " + Integer.toBinaryString(result));
        return result;

    }
}
