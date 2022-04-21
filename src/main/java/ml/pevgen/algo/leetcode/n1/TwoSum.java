package ml.pevgen.algo.leetcode.n1;

import java.util.Arrays;
import java.util.HashMap;

import static java.lang.System.out;

public class TwoSum {

    public static int[] twoSumBrute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] twoSumHashMap(int[] nums, int target) {
        // [value, index]
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff) && map.get(diff) != i) {
                return new int[]{i, map.get(diff)};  // i - first index, map.get(diff) - second index
            }
        }
        return new int[]{};
    }

    public static int[] twoSumHashMapBackward(int[] nums, int target) {
        // [value, index]
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i}; // map.get(diff) - first index, i - second index
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        out.println(Arrays.toString(twoSumBrute(new int[]{2, 7, 11, 15}, 9)));  // 0,1
        out.println(Arrays.toString(twoSumHashMap(new int[]{2, 7, 11, 15}, 9))); // 0,1
        out.println(Arrays.toString(twoSumHashMap(new int[]{3, 2, 4}, 6))); // 1,2
        out.println(Arrays.toString(twoSumHashMap(new int[]{7, 3, 3}, 6))); // 1,2
        out.println(Arrays.toString(twoSumHashMapBackward(new int[]{3, 3}, 6))); // 0,1
        out.println(Arrays.toString(twoSumHashMapBackward(new int[]{3, 2, 4}, 6))); // 1,2
        out.println(Arrays.toString(twoSumHashMapBackward(new int[]{2, 7, 11, 15}, 9))); // 0,1
    }

}
