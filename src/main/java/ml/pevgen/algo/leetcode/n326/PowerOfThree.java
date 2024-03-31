package ml.pevgen.algo.leetcode.n326;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/power-of-three/description/">
 * https://leetcode.com/problems/power-of-three/description/</a>
 */
public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        Set<Integer> pow3set = new HashSet<>();
        pow3set.add(1);
        long l = 3;
        while (l < Integer.MAX_VALUE) {
            pow3set.add((int) l);
            l = l * 3;
        }
        return pow3set.contains(n);
    }

    public boolean isPowerOfThree_brute(int n) {
        if (n == 1) {
            return true;
        }
        if (n < 3) {
            return false;
        }

        while (n > 1) {
            int reminder = n % 3;
            if (reminder != 0) {
                return false;
            }
            n = n / 3;
        }
        return true;
    }


}
