package ml.pevgen.algo.leetcode.n70;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * <a href="https://leetcode.com/problems/climbing-stairs/">https://leetcode.com/problems/climbing-stairs/</a>
 */
public class ClimbingStairs {

    public static void main(String[] args) {

        System.out.println("1 steps. result(expected 1) = " + calculateStepsMemoization(1));
        System.out.println("2 steps. result(expected 2) = " + calculateStepsMemoization(2));
        System.out.println("3 steps. result(expected 3) = " + calculateStepsMemoization(3));
        System.out.println("4 steps. result(expected 5) = " + calculateStepsMemoization(4));
        System.out.println("5 steps. result(expected 8) = " + calculateStepsMemoization(5));
    }


    private static int calculateStepsMemoization(int n) {
        if (n <=2) {
            return n;
        }
        int[] stepsMemo = new int[n];
        stepsMemo[0] = 1;
        stepsMemo[1] = 2;
        for(int i = 2; i<n;i++){
            stepsMemo[i] = stepsMemo[i-2] + stepsMemo[i-1];
        }
        return stepsMemo[n-1];
    }

    // simple recursive solution with very long working time
    static int calculateStepsRecursive(int n) {
        if (n == 1) {
            return 1;  // 1
        }
        if (n == 2) {
            return 2; // 1+1, 2
        }
        return calculateStepsRecursive(n - 2) + calculateStepsRecursive(n - 1);
    }

}
