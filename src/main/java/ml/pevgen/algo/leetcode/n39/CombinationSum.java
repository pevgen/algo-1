package ml.pevgen.algo.leetcode.n39;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/combination-sum/description/">
 * https://leetcode.com/problems/combination-sum/description/</a>
 */
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < candidates.length; i++) {
            List<Integer> currentList = new ArrayList<>();
            backtrack(i, candidates, target, currentList, result);
        }
        return result;
    }

    private void backtrack(int i, int[] candidates, int target, List<Integer> currentList, List<List<Integer>> result) {
        currentList.add(candidates[i]);
        int currentSum = currentList.stream().mapToInt(num -> num).sum();
        if (currentSum > target) {
            return;
        }
        if (currentSum == target) {
            result.add(new ArrayList<>(currentList));
            return;
        }
        if (i > candidates.length - 1) {
            return;
        }

        backtrack(i, candidates, target, currentList, result);
        currentList.remove(currentList.size() - 1);

        for (int j = i + 1; j < candidates.length; j++) {
            backtrack(j, candidates, target, currentList, result);
            currentList.remove(currentList.size() - 1);
        }
    }

}
