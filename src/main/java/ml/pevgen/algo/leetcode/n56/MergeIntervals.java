package ml.pevgen.algo.leetcode.n56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/merge-intervals/description/">
 * https://leetcode.com/problems/merge-intervals/description/</a>
 */
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1) {
            return intervals;
        }

        Arrays.sort(intervals, Arrays::compare);
        List<int[]> result = new ArrayList<>();

        int[] span = new int[]{intervals[0][0], intervals[0][1]};

        for (int i = 1; i < intervals.length; i++) {
            if (span[1] >= intervals[i][0]) {            // start must be less or equal previous end
                if (span[1] < intervals[i][1]) {         // end must be less previous end (check that the span isn't completely inside another span)
                    span[1] = intervals[i][1];
                }
            } else {
                result.add(span);
                span = new int[]{intervals[i][0], intervals[i][1]};
            }
        }
        if (intervals[intervals.length - 1][1] > span[1]) {
            span[1] = intervals[intervals.length - 1][1];
        }
        result.add(span);
        return result.toArray(new int[0][]);
    }

}
