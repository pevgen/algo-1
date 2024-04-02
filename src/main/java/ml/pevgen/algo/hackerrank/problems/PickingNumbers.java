package ml.pevgen.algo.hackerrank.problems;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <a href="https://www.hackerrank.com/challenges/picking-numbers">
 * https://www.hackerrank.com/challenges/picking-numbers</a>
 */
public class PickingNumbers {

    public int pickingNumbers(List<Integer> a) {
        List<Integer> ll = a.stream().sorted().collect(Collectors.toList());


        int p1 = 0;
        int current = ll.get(0);
        int maxLength = 1;
        int tempMaxLength = 1;
        for (int i = 1; i < ll.size(); i++) {
            if (current == ll.get(i)) {
                tempMaxLength++;
            } else if (Math.abs(current - ll.get(i)) == 1) {
                if (tempMaxLength > maxLength) {
                    maxLength = tempMaxLength;
                }
                current = ll.get(i);
                tempMaxLength = i - p1 + 1;
                p1 = i;
            } else {
                if (tempMaxLength > maxLength) {
                    maxLength = tempMaxLength;
                }
                tempMaxLength = 1;
                current = ll.get(i);
                p1 = i;
            }

        }
        return Math.max(maxLength, tempMaxLength);
    }
}
