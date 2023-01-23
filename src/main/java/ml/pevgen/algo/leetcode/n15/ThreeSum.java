package ml.pevgen.algo.leetcode.n15;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.com/problems/3sum/">https://leetcode.com/problems/3sum/</a>
 */
public class ThreeSum {


    public List<List<Integer>> threeSum(int[] nums) {

        if ((nums == null) || nums.length < 3) {
            return new ArrayList<>();
        }

        List<Integer> sortedInputList = Arrays.stream(nums).boxed().sorted().collect(Collectors.toList());
        Set<String> cache = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int index = 0; index < sortedInputList.size(); index++) {

            // not check repeated numbers
            if (isRepeated(sortedInputList, index)) {
                continue;
            }

            List<Integer> tempList = new ArrayList<>(sortedInputList);  // copy input list for step changing
            tempList.remove(index);
            List<List<Integer>> twoSumPairList = twoSum(tempList, -sortedInputList.get(index));

            for (List<Integer> twoSumPair : twoSumPairList) {
                if (!twoSumPairList.isEmpty()) {
                    // create triple: 2pair + current element
                    twoSumPair.add(sortedInputList.get(index));
                    Collections.sort(twoSumPair);
                    // check duplicates
                    String key = "" + twoSumPair.get(0) + twoSumPair.get(1) + twoSumPair.get(2);
                    if (cache.add(key)) {
                        result.add(twoSumPair);
                    }
                }
            }
        }

        return result;
    }

    private static boolean isRepeated(List<Integer> sortedInputList, int index) {
        return (index + 1 < sortedInputList.size())
                && (sortedInputList.get(index).equals(sortedInputList.get(index + 1)));
    }


    /**
     * return list of possible pairs
     */
    public static List<List<Integer>> twoSum(List<Integer> nums, int target) {


        List<List<Integer>> result = new ArrayList<>();
        // [value, index]
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.size(); i++) {
            int diff = target - nums.get(i);
            if (map.containsKey(diff)) {
                result.add(new ArrayList<>(Arrays.asList(diff, nums.get(i)))); // map.get(diff) - first index, i - second index
            }
            map.put(nums.get(i), i);
        }
        return result;
    }
}
