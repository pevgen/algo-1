package ml.pevgen.algo.leetcode.n334;

/**
 * <a href="https://leetcode.com/problems/increasing-triplet-subsequence/description/">
 * https://leetcode.com/problems/increasing-triplet-subsequence/description/</a>
 */
public class IncreasingTripletSubsequence {

    public boolean increasingTriplet(int[] nums) {

        if (nums.length < 3) {
            return false;
        }

        // the idea:
        // find first minimum ,
        // then find second minimum,
        // and then find something greater than second minimum
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : nums) {

            if ((num < firstMin)) {
                firstMin = num;
            } else if (num < secondMin && num != firstMin) {
                secondMin = num;
            } else if (num > secondMin) {
                return true;
            }
        }

        return false;
    }
}
