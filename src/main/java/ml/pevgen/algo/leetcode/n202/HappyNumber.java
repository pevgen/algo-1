package ml.pevgen.algo.leetcode.n202;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/happy-number/description/">
 * https://leetcode.com/problems/happy-number/description/</a>
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> sumSet = new HashSet<>();
        while (n != 1) {
            n = sumOfSquaredDigits(n);
            if (sumSet.contains(n)) {
                return false;
            }
            sumSet.add(n);
        }
        return true;
    }

    private int sumOfSquaredDigits(int n) {
        int sum = 0;
        while (n > 9) {
            sum = sum + (n % 10) * (n % 10);
            n = n / 10;
        }
        sum = sum + n * n;
        return sum;
    }
}
