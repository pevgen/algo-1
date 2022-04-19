package ml.pevgen.algo.leetcode.n125;

import static java.lang.Character.isLetterOrDigit;
import static java.lang.Character.toLowerCase;

/**
 * Method of two pointers
 * <a href="https://leetcode.com/problems/valid-palindrome/">https://leetcode.com/problems/valid-palindrome/</a>
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char cLeft = s.charAt(left);
            char cRight = s.charAt(right);

            if (isLetterOrDigit(cLeft) && isLetterOrDigit(cRight)) {
                char cLeftLower = toLowerCase(cLeft);
                char cRightLower = toLowerCase(cRight);

                if (cLeftLower != cRightLower) {
                    return false;
                }
                left++;
                right--;
            }

            if (!isLetterOrDigit(cLeft)) {
                left++;
            }
            if (!isLetterOrDigit(cRight)) {
                right--;
            }
        }
        return true;
    }
}
