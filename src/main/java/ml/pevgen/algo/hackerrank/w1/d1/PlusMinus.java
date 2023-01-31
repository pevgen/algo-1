package ml.pevgen.algo.hackerrank.w1.d1;

import java.util.List;

/**
 * <a href="https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus">
 * https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus</a>
 */
public class PlusMinus {

    public void plusMinus(List<Integer> arr) {

        int size = arr.size();
        double zeroCount = 0;
        double negativeCount = 0;
        double positiveCount = 0;

        for (int num : arr) {
            if (num < 0)
                negativeCount++;
            else if (num > 0)
                positiveCount++;
            else zeroCount++;
        }

        System.out.printf("%1.6f\n", positiveCount/size);
        System.out.printf("%1.6f\n", negativeCount/size);
        System.out.printf("%1.6f\n", zeroCount/size);
    }

}
