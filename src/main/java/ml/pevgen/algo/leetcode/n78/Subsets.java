package ml.pevgen.algo.leetcode.n78;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/subsets/description/">
 * https://leetcode.com/problems/subsets/description/</a>
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Collections.emptyList());

        for (int i = 0; i < nums.length; i++) {
            List<Integer> currentList = new ArrayList<>();
            subsetIn(i, nums, currentList, result);
        }

        return result;
    }

    private void subsetIn(int index, int[] nums, List<Integer> currentList, List<List<Integer>> result) {
        currentList.add(nums[index]);
        result.add(new ArrayList<>(currentList));
        if (index < nums.length - 1) {
            for (int i = index + 1; i < nums.length; i++) {
                subsetIn(i, nums, new ArrayList<>(currentList), result);
            }
        }
    }
}