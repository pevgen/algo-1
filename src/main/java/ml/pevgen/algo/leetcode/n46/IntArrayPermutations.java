package ml.pevgen.algo.leetcode.n46;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <a href="https://leetcode.com/problems/permutations/">https://leetcode.com/problems/permutations/</a>
 * <p>
 * Notice! We use the backwards principle here (from the end)
 */
public class IntArrayPermutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> initList =
                IntStream.of(nums)
                        .boxed()
                        .collect(Collectors.toList());
        permute(initList, new ArrayList<>(), result);
        return result;
    }

    public void permute(List<Integer> nums,
                        List<Integer> prefix,
                        List<List<Integer>> result) {
        if (nums.isEmpty()) {
            result.add(prefix);
        }

        for (int i = 0; i < nums.size(); i++) {
            Integer nextItem = nums.get(i);

            List<Integer> newPrefix = new ArrayList<>(prefix);
            newPrefix.add(nextItem);

            List<Integer> initList = new ArrayList<>(nums);
            initList.remove(nextItem);
            permute(initList, newPrefix, result);
        }
    }

}
