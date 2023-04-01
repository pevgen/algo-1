package ml.pevgen.algo.hackerrank.problems;

import java.util.List;

/**
 * <a href="https://www.hackerrank.com/challenges/breaking-best-and-worst-records">
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records</a>
 */
public class BreakingTheRecords {


    public List<Integer> breakingRecords(List<Integer> scores) {
        int mostPointsRecord = 0;
        int leastPointsRecord = 0;
        int higherScore = scores.get(0);
        int lowerScore = scores.get(0);

        for (int i = 1; i < scores.size(); i++) {
            int currentScore = scores.get(i);
            if (currentScore > higherScore) {
                mostPointsRecord++;
                higherScore = currentScore;
            } else if (currentScore < lowerScore) {
                leastPointsRecord++;
                lowerScore = currentScore;
            }
        }

        return List.of(mostPointsRecord, leastPointsRecord);
    }
}
