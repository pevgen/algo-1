package ml.pevgen.algo.leetcode.n66;

/**
 * <a href="https://leetcode.com/problems/plus-one/description/">
 * https://leetcode.com/problems/plus-one/description/</a>
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1]++;
            return digits;
        }


        digits[digits.length - 1] = 0;
        int over = 1;
        for (int i = digits.length - 2; i >= 0; i--) {
            digits[i] = digits[i] + over;
            if (digits[i] > 9) {
                digits[i] = 0;
            } else {
                return digits;
            }
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        for (int i = 1; i < result.length; i++) {
            result[i] = digits[i - 1];
        }

        return result;
    }
}
