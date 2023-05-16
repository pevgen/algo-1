package ml.pevgen.algo.hackerrank.problems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <a href="https://www.hackerrank.com/challenges/sock-merchant/problem">
 * https://www.hackerrank.com/challenges/sock-merchant/problem</a>
 */
public class SalesByMatch {

    public int sockMerchant(int n, List<Integer> ar) {
        int counter = 0;
        Set<Integer> pairSet = new HashSet<>();
        for (Integer i : ar) {
            if (pairSet.remove(i)) {
                counter++;
            } else {
                pairSet.add(i);
            }
        }
        return counter;
    }
}
