package ml.pevgen.algo.hackerrank.problems;

import java.util.List;

/**
 * <a href="https://www.hackerrank.com/challenges/divisible-sum-pairs/problem">
 * https://www.hackerrank.com/challenges/divisible-sum-pairs/problem</a>
 */
public class DivisibleSumPairs {

    public int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (((ar.get(i) + ar.get(j)) % k == 0)) {
                    result++;
                }
            }
        }
        return result;
    }
}
