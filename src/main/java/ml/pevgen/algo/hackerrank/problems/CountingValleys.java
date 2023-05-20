package ml.pevgen.algo.hackerrank.problems;

/**
 * <a href="https://www.hackerrank.com/challenges/counting-valleys/problem">
 * https://www.hackerrank.com/challenges/counting-valleys/problem</a>
 */
public class CountingValleys {

    public int countingValleys(int steps, String path) {
        int level = 0;
        int result = 0;
        for (char currentChar : path.toCharArray()) {
            if (currentChar == 'D') {
                if (level == 0) {
                    result++;
                }
                level--;
            } else {
                level++;
            }
        }
        return result;
    }
}
