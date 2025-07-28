package ml.pevgen.algo.others;

public class PlusOne {
    public int[] plusOne(int[] digits) {

        if (digits[digits.length-1] < 9) {
            digits[digits.length-1] = digits[digits.length-1] + 1;
            return digits;
        }

        int carry = 1;
        for (int i = digits.length - 1; i >=0; i--) {
            int current = digits[i] + carry;
            digits[i] = current%10;
            if (current > 9) {
                carry = 1;
            } else {
                carry = 0;
            }
        }
        if (carry ==0) {
            return digits;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        for (int i = 0; i < digits.length; i++) {
            result[i+1] = digits[i];
        }
        return result;
    }
}
