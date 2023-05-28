package ml.pevgen.algo.leetcode.n448;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/">
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/</a>
 */
public class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        int[] sortedDistinctIntegerArray = Arrays.stream(nums).sorted().distinct().toArray();

        List<Integer> result = new ArrayList<>();
        int index = 0;
        for (int i = 1; i <= nums.length; i++) {
            if ((index >= sortedDistinctIntegerArray.length) || (sortedDistinctIntegerArray[index] != i)) {
                result.add(i);
            } else {
                index++;
            }
        }

        return result;
    }

}
