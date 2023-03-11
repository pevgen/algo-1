package ml.pevgen.algo.hackerrank.problems;

import java.util.List;

/**
 * <a href="https://www.hackerrank.com/challenges/apple-and-orange">
 * https://www.hackerrank.com/challenges/apple-and-orange</a>
 */
public class AppleAndOrange {

    public int[] countApplesAndOranges(
            int houseLeft,
            int houseRight,
            int appleTreePoint,
            int orangeTreePoint,
            List<Integer> apples,
            List<Integer> oranges) {
        int[] result = new int[2];

        for (int appleDistance : apples) {
            if ((appleTreePoint + appleDistance >= houseLeft)
                    && (appleTreePoint + appleDistance <= houseRight)) {
                result[0]++;
            }
        }

        for (int orangeDistance : oranges) {
            if ((orangeTreePoint + orangeDistance >= houseLeft)
                    && (orangeTreePoint + orangeDistance <= houseRight)) {
                result[1]++;
            }
        }

        System.out.println(result[0]);
        System.out.println(result[1]);

        return result;
    }

}
