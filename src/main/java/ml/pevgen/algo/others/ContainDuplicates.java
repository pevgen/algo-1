package ml.pevgen.algo.others;

import java.util.HashSet;

public class ContainDuplicates {

    public boolean containsDuplicate(int[] nums) {
        var numSet = new HashSet<>();
        for (int n : nums) {
            if (numSet.contains(n)) {
                return true;
            }
            numSet.add(n);
        }
        return false;
    }

}
