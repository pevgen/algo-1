package ml.pevgen.algo.others;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int counter = 0;
        int el = 0;

        for (var n : nums) {

            if (counter == 0) {
                el = n;
                counter++;
            } else if (n == el) {
                counter++;
            } else {
                counter--;
            }
        }

        return el;
    }
}
