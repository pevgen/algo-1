package ml.pevgen.algo.hackerrank.problems;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * <a href="https://www.hackerrank.com/challenges/migratory-birds/problem">
 * https://www.hackerrank.com/challenges/migratory-birds/problem</a>
 */
public class MigratoryBirds {
    public int migratoryBirds(List<Integer> arr) {

        Map<Integer, Long> countMap =
                arr.stream().collect(
                        Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
        int result = -1;
        long max = 0;
        for (var entry : countMap.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }

}
