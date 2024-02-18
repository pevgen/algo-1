package ml.pevgen.algo.leetcode.n7;

/**
 * <a href="https://leetcode.com/problems/reverse-integer">
 * https://leetcode.com/problems/reverse-integer</a>
 */
public class ReverseInteger {

    public int reverse(int x) {

        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);

        long result = 0;
        while (x > 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }

        return result > Integer.MAX_VALUE ? 0 : (int) result * sign;
    }

    @SuppressWarnings("java:S100")
    public int reverse_with_chars(int x) {

        if (x == 0) {
            return 0;
        }
        // check negative number
        char[] inputCharArray = String.valueOf(x).toCharArray();
        int startIndex = '-' == inputCharArray[0] ? 1 : 0;

        // trim trailing zeroes
        int endIndex = inputCharArray.length - 1;
        int zeroes = 0;
        while (inputCharArray[endIndex] == '0') {
            endIndex--;
            zeroes++;
        }

        // reverse unsigned number
        char[] resultCharArray = new char[inputCharArray.length - zeroes - startIndex];
        int resultIndex = 0;
        while (startIndex <= endIndex) {
            resultCharArray[resultIndex++] = inputCharArray[endIndex];
            endIndex--;
        }

        // check range unsigned number (int or more ?)
        long unsignedResult = Long.parseLong(new String(resultCharArray));
        if (unsignedResult > Integer.MAX_VALUE) {
            return 0;
        }

        // return value with sign
        return startIndex == 1 ? -1 * (int) unsignedResult : (int) unsignedResult;
    }
}
