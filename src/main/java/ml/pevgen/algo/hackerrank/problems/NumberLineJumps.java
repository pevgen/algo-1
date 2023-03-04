package ml.pevgen.algo.hackerrank.problems;

/**
 * <a href="https://www.hackerrank.com/challenges/kangaroo">
 * https://www.hackerrank.com/challenges/kangaroo</a>
 */
public class NumberLineJumps {

    private static final String YES = "YES";
    private static final String NO = "NO";

    public String kangaroo(int x1, int v1, int x2, int v2) {
        // x1 < x2 always : from conditions
        if (v1 <= v2) {
            return NO;
        }

        int currentPos1 = x1;
        int currentPos2 = x2;

        while (currentPos1 < currentPos2) {
            currentPos1 = currentPos1 + v1;
            currentPos2 = currentPos2 + v2;
            if (currentPos1 == currentPos2) {
                return YES;
            }
        }
        return NO;
    }
}
