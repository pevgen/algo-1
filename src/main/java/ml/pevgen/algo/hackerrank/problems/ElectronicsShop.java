package ml.pevgen.algo.hackerrank.problems;

/**
 * <a href="https://www.hackerrank.com/challenges/electronics-shop">
 * https://www.hackerrank.com/challenges/electronics-shop</a>
 */
public class ElectronicsShop {

    int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int result = -1;
        for (int i = keyboards.length - 1; i >= 0; i--) {
            for (int j = drives.length - 1; j >= 0; j--) {
                int currentSum = keyboards[i] + drives[j];
                if (currentSum <= b && currentSum > result) {
                    result = currentSum;
                }
            }
        }

        return result;
    }
}
