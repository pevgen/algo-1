package ml.pevgen.algo.hackerrank.problems;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <a href="https://www.hackerrank.com/challenges/between-two-sets">
 * https://www.hackerrank.com/challenges/between-two-sets</a>
 */
public class BetweenTwoSets {

    public int getTotalX(List<Integer> a, List<Integer> b) {

        Collections.sort(b);
        Set<Integer> factors = createSetAllFactorsOfB(b);

        int result = 0;
        for (Integer f : factors) {
            boolean needToAdd = true;

            for (Integer m : a) {
                if (f % m != 0) {
                    needToAdd = false;
                    break;
                }
            }

            if (needToAdd) {
                result++;
            }
        }

        return result;
    }

    private Set<Integer> createSetAllFactorsOfB(List<Integer> b) {
        Set<Integer> factors = ConcurrentHashMap.newKeySet();
        Integer firstElement = b.get(0);
        for (int i = 1; i <= firstElement; i++) {
            if (firstElement % i == 0) {
                factors.add(i);
            }
        }

        for (int i = 1; i < b.size(); i++) {
            for (Integer f : factors) {
                if (b.get(i) % f != 0) {
                    factors.remove(f);
                }
            }
        }
        return factors;
    }


}
