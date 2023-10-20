package ml.pevgen.algo.leetcode.n128;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.com/problems/longest-consecutive-sequence">
 * https://leetcode.com/problems/longest-consecutive-sequence</a>
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toCollection(HashSet::new));

        int result = 0;
        for (int num : nums) {
            if (!numSet.contains(num - 1)) {  // sequence start
                // count all sequence
                int currentNum = num;
                int currentLength = 1;
                while (numSet.contains(currentNum + 1)) {  // find all sequence
                    currentLength++;
                    currentNum++;
                }
                if (currentLength > result) {
                    result = currentLength;
                }
            }
        }
        return result;
    }
}
