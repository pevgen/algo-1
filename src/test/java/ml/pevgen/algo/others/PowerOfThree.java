package ml.pevgen.algo.others;

public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        int maxIntPower3 = (int)Math.pow(3, 19);  // 1162261467 (max int for power 3)

        return maxIntPower3%n == 0;
    }

}
