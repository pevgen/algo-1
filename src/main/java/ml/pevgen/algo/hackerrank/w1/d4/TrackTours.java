package ml.pevgen.algo.hackerrank.w1.d4;

import java.util.List;

/**
 * <a href="https://www.hackerrank.com/challenges/truck-tour/problem">
 *     https://www.hackerrank.com/challenges/truck-tour/problem</a>
 */
public class TrackTours {

    public int truckTour(List<List<Integer>> pp) {
        int sum = 0;
        int startIndex = 0;
        for (int i = 0; i < pp.size(); i++) {
            int petrol = pp.get(i).get(0);
            int distance = pp.get(i).get(1);
            sum = sum + (petrol - distance);

            if (sum < 0) {
                sum = 0;
                startIndex = i + 1;
            }
        }
        return startIndex;
    }


}
