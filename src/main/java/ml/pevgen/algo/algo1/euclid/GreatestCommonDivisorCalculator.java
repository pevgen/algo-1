package ml.pevgen.algo.algo1.euclid;

/**
 * The Euclidean Algorithm for finding GCD (Greatest Common Divisor) for two numbers
 */
public class GreatestCommonDivisorCalculator {

    public int calculate(int first, int second) {

        if (second <= 0) {
            throw new IllegalArgumentException("The divisor must not be less or equal to 0");
        }

        if (first < second) {
            throw new IllegalArgumentException("The first parameter should be greater than the second parameter");
        }

        int remainderOfDivision = first % second;

        while (remainderOfDivision > 0) {
            first = second;
            second = remainderOfDivision;
            remainderOfDivision = first % second;
        }

        return second;
    }

}
