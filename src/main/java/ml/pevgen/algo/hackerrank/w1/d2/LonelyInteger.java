package ml.pevgen.algo.hackerrank.w1.d2;

import java.util.AbstractMap;
import java.util.List;
import java.util.stream.Collectors;

public class LonelyInteger {

    public int lonelyInteger(List<Integer> list) {
        return list.stream()
                .collect(
                        Collectors.groupingBy(v -> v,
                                Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() < 2)
                .findFirst()
                .orElse(new AbstractMap.SimpleEntry<>(0, 1L))
                .getKey();
    }
}
