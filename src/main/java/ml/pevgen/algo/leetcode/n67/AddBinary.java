package ml.pevgen.algo.leetcode.n67;

/**
 * <a href="https://leetcode.com/problems/add-binary/">
 * https://leetcode.com/problems/add-binary/</a>
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        if ("0".equals(a)) {
            return b;
        }
        if ("0".equals(b)) {
            return a;
        }


        StringBuilder result = new StringBuilder();
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        int carry = 0;
        int charZeroIntVal = '0'; // '0' - 48, '1' - 49

        while ((aIndex >= 0 || bIndex >= 0 || carry == 1)) {
            if (aIndex >= 0) {
                carry = carry + (a.charAt(aIndex) - charZeroIntVal); // carry from prev step + 0/1
            }
            if (bIndex >= 0) {
                carry = carry + (b.charAt(bIndex) - charZeroIntVal); // carry from prev step + 0/1
            }

            // here carry: 0,1,2,3
            // carry % 2  = 0/1
            result.insert(0, carry % 2);

            // carry for the next stage
            carry = carry / 2;

            aIndex--;
            bIndex--;
        }


        return result.toString();
    }
}
