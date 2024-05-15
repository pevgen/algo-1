package ml.pevgen.algo.leetcode.n55;


/**
 * <a href="https://leetcode.com/problems/jump-game/">
 * https://leetcode.com/problems/jump-game/</a>
 */
public class JumpGame {


    public boolean canJump(int[] nums) {
        //Greedy approach
        int furthest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > furthest) {
                return false;
            }
            furthest = Math.max(furthest, nums[i] + i);
        }
        return true;
    }

    public boolean canJump_old(int[] nums) {
        if (nums.length == 1) {
            return true;
        }

        int i = 0;
        while (true) {
            int nextPossibleJump = i + nums[i];
            if (nextPossibleJump + 1 >= nums.length) {
                return true;
            }
            int nextMaxJumpIndex = -1;
            int currentJump = -1;
            for (int j = i + 1; j <= nextPossibleJump; j++) {
                if (j >= nums.length) {
                    return true;
                }
                if (j + nums[j] > nextPossibleJump && j + nums[j] > currentJump) {
                    currentJump = j + nums[j];
                    nextMaxJumpIndex = j;
                }
            }
            if (currentJump == -1) {
                return false;
            }
            i = nextMaxJumpIndex;
        }
    }
}
