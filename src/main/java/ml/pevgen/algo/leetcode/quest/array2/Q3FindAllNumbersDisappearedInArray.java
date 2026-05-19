package ml.pevgen.algo.leetcode.quest.array2;

import java.util.ArrayList;
import java.util.List;

public class Q3FindAllNumbersDisappearedInArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int ind = Math.abs(nums[i]) - 1;
            nums[ind] = -Math.abs(nums[ind]);  // mark as negative
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
