package ml.pevgen.algo.leetcode.n217;

import java.util.HashSet;
import java.util.Set;

/**
 * Contains duplicate in array
 */
public class ContainsDuplicate {


    public static void main(String[] args) {

        System.out.println("in: {1,2,3,1}  (expected: true) = " + ContainsDuplicate.containsDuplicateWithSet(new int[]{1, 2, 3, 1}));
        System.out.println("in: {1,2,3,4}  (expected: false) = " + ContainsDuplicate.containsDuplicateWithSet(new int[]{1, 2, 3, 4}));
        System.out.println("in: {1,1,1,3,3,4,3,2,4,2}  (expected: true) = " + ContainsDuplicate.containsDuplicateWithSet(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));

    }

    public static boolean containsDuplicateWithSet(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if (numSet.contains(num)) {
                return true;
            }
            numSet.add(num);
        }
        return false;
    }
}
