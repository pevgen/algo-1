package ml.pevgen.algo.others;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(var i = 0; i<nums.length; i++) {
            var ind = Math.abs(nums[i]) - 1;
            nums[ind] = -1*Math.abs(nums[ind]);
        }

        List<Integer> result = new ArrayList<>();
        for(var i = 0; i<nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i+1);
            }
        }
        return result;
    }
}
