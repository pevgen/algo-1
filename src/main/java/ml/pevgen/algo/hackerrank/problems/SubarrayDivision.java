package ml.pevgen.algo.hackerrank.problems;

import java.util.List;

/**
 * <a href="https://www.hackerrank.com/challenges/the-birthday-bar/problem">
 * https://www.hackerrank.com/challenges/the-birthday-bar/problem</a>
 */
public class SubarrayDivision {

    public int birthday(List<Integer> s, int d, int m) {
        int result = 0;
        int startIndex = 0;
        int endIndex = m - 1;
        int currentSum = 0;

        for (int i = 0; i < m; i++) {
            currentSum = currentSum + s.get(i);
        }

        while (true) {

            if (currentSum == d) {
                result++;
            }

            endIndex++;

            if (endIndex < s.size()) {
                currentSum = currentSum - s.get(startIndex) + s.get(endIndex);
                startIndex++;
            } else {
                break;
            }
        }

        return result;
    }
}
