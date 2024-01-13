package ml.pevgen.algo.leetcode.n1207;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

/**
 * <a href="https://leetcode.com/problems/unique-number-of-occurrences">
 * https://leetcode.com/problems/unique-number-of-occurrences</a>
 */
public class UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int i : arr) {
            if (occurrences.containsKey(i)) {
                occurrences.computeIfPresent(i, (k, v) -> v + 1);
            } else {
                occurrences.put(i, 1);
            }
        }
        Set<Integer> cntSet = new HashSet<>(occurrences.values());
        return cntSet.size() == occurrences.values().size();
    }

    /**
     *  solution with streams
     */
    @SuppressWarnings("java:S100")
    public boolean uniqueOccurrences_withStreams(int[] arr) {
        Map<Integer, Long> occurrences = Arrays.stream(arr)
                .boxed()
                .collect(groupingBy(Function.identity(), Collectors.counting()));
        long cnt = occurrences
                .values()
                .stream()
                .distinct()
                .count();
        return cnt == occurrences.values().size();
    }
}
