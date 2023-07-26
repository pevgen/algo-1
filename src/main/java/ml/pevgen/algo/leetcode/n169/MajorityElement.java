package ml.pevgen.algo.leetcode.n169;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/majority-element/description/">
 * https://leetcode.com/problems/majority-element/description/</a>
 */
public class MajorityElement {


    public int majorityElement_hash_map(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int num : nums) {
            Integer newCount = map.merge(num, 1, Integer::sum);
            if (newCount > nums.length / 2) {
                result = num;
            }
        }
        return result;
    }

    /**
     * <a href="https://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_majority_vote_algorithm">
     * https://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_majority_vote_algorithm</a>
     * Good explanation :  <a href="https://www.youtube.com/watch?v=PIpJRYHK39I">
     * https://www.youtube.com/watch?v=PIpJRYHK39I</a>
     * Идея: все элементы, кромме искомого (частота больше N/2) компенсируют друг друга и останется нужный
     */
    public int majorityElement(int[] nums) {
        int candidate = -1;
        int counter = 0;

        for (int num : nums) {

            if (counter == 0) {
                candidate = num;
                counter = 1;
            } else if (candidate == num) {
                counter++;
            } else {
                counter--;
            }
        }

        return candidate;
    }
}
