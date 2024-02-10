package ml.pevgen.algo.leetcode.n70;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <a href="https://leetcode.com/problems/climbing-stairs/">https://leetcode.com/problems/climbing-stairs/</a>
 */
public class ClimbingStairs {

    int calculateStepsMemoization(int n) {
        if (n <=2) {
            return n;
        }
        int[] stepsMemo = new int[n];
        stepsMemo[0] = 1;
        stepsMemo[1] = 2;
        for(int i = 2; i<n;i++){
            stepsMemo[i] = stepsMemo[i-2] + stepsMemo[i-1];  // step X - just a sum steps x-1 or x-2
        }
        return stepsMemo[n-1];
    }

    // simple recursive solution with very long working time
    int calculateStepsRecursive(int n) {
        if (n == 1) {
            return 1;  // 1
        }
        if (n == 2) {
            return 2; // 1+1, 2
        }
        return calculateStepsRecursive(n - 2) + calculateStepsRecursive(n - 1);
    }

}
