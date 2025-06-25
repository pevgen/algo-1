package ml.pevgen.algo.others;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int n : nums){
            result = result ^ n;
        }
        return result;
    }
}
