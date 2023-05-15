package ml.pevgen.algo.hackerrank.problems;

/**
 * <a href="https://www.hackerrank.com/challenges/the-power-sum/problem">
 * https://www.hackerrank.com/challenges/the-power-sum/problem</a>
 */
public class ThePowerSum {

    public int powerSum(int sum, int power) {
        // Write your code here
        return power(sum, power, 1);

    }

    public int power(int sum, int power, int i) {

        int current = (int) Math.pow(i, power);

        if (sum == current) {
            return 1;
        }

        if (sum < current) {
            return 0;
        }

        i++;
        return power(sum - current, power, i) + power(sum, power, i);

    }
}
