package ml.pevgen.algo.hackerrank.w1.d5;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pairs {

    public int pairs(int k, List<Integer> arr) {

        Set<Integer> set = new HashSet<>(arr);
        int count = 0;
        for (Integer el : arr) {
            if (set.contains(el + k)) {
                count++;
            }
        }
        return count;

    }
}
