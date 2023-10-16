package ml.pevgen.algo.leetcode.n875;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/koko-eating-bananas/description/">
 * https://leetcode.com/problems/koko-eating-bananas/description/</a>
 */
public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int result = Integer.MAX_VALUE;
        Arrays.sort(piles);
        int minK = 1;
        int maxK = piles[piles.length - 1];
        int k = minK;
        while (minK < maxK) {

            if (minK + 1 == maxK) {  // neighbours
                if (canEatAll(piles, minK, h) && (result > minK)) {
                    result = minK;
                } else if (canEatAll(piles, maxK, h) && (result > minK)) {
                    result = maxK;
                }
                break;
            }

            if (!canEatAll(piles, k, h)) {
                minK = k;
                k = minK + (maxK - minK) / 2;
                //k++;  bruteforce
            } else {
                if (result > k) {
                    result = k;
                }
                maxK = k;
                k = maxK - (maxK - minK) / 2;
            }

        }
        return result;
    }

    private boolean canEatAll(int[] piles, int k, int h) {
        int eatingHours = 0;
        for (int n : piles) {
            eatingHours = eatingHours + (int) Math.ceil(((double) n) / k);
            if (eatingHours > h) {
                return false;
            }
        }
        return true;
    }
}
