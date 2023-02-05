package ml.pevgen.algo.hackerrank.w1.d4;

import java.util.Arrays;

public class RecursiveDigitSum {

    public int superDigit1(String n, int k) {

        long result = Arrays.stream(n.split(""))
                .mapToLong(Long::parseLong)
                .sum();

        while (result > 9) {
            String tempString = Long.toString(result);
            result = Arrays.stream(tempString.split(""))
                    .mapToInt(Integer::parseInt)
                    .sum();
        }

        result = result * k;
        if (result > 9) {
            String tempString = Long.toString(result);
            result = Arrays.stream(tempString.split(""))
                    .mapToInt(Integer::parseInt)
                    .sum();
        }
        return (int)result;
    }


    public int superDigit(String n, int k) {

        long result = oneSum(Long.parseLong(n))*k;

        if (result>9) {
            result = oneSum(result);
        }
        return (int)result;
    }


    long oneSum(long result) {

        if (result< 10) {
            return result;
        }

        String tempString = Long.toString(result);
        result = Arrays.stream(tempString.split(""))
                .mapToLong(Long::parseLong)
                .sum();
        return oneSum(result);
    }
}
