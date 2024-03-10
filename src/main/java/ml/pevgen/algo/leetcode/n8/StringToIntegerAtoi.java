package ml.pevgen.algo.leetcode.n8;

/**
 * <a href="https://leetcode.com/problems/string-to-integer-atoi/description/">
 * https://leetcode.com/problems/string-to-integer-atoi/description/</a>
 */
public class StringToIntegerAtoi {

    public int myAtoi(String s) {

        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        int index = 0;
        // negative or positive
        int negative = 1;
        if (s.charAt(0) == '-') {
            index++;
            negative = -1;
        } else if (s.charAt(0) == '+') {
            index++;
        }

        // ignore leading zeroes
        while (index < s.length() && s.charAt(index) == '0') {
            index++;
        }

        // reading first digits
        String resultAsString = "";
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            resultAsString = resultAsString + s.charAt(index);
            index++;
        }

        // no digits
        if (resultAsString.isEmpty()) {
            return 0;
        }

        // int-range rude evaluation
        if (resultAsString.length() > 10) {
            return negative == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        // counting by digits of a number
        long resultAsLong = 0;
        for (int i = 0; i < resultAsString.length(); i++) {
            int digitValue = Integer.parseInt("" + resultAsString.charAt(i));
            resultAsLong = resultAsLong + (long) Math.pow(10, resultAsString.length() - i - 1) * digitValue;

            if (resultAsLong * negative < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            if (resultAsLong * negative > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }

        // cast to int
        return negative * (int) resultAsLong;
    }

}
