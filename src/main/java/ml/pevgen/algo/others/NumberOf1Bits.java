package ml.pevgen.algo.others;

public class NumberOf1Bits {

    public int hammingWeight(int n) {
        var result = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                result++;
            }
            n = n >> 1;
        }
        return result;
    }
}
