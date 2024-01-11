package ml.pevgen.algo.leetcode.n680;

/**
 * <a href="https://leetcode.com/problems/valid-palindrome-ii/">
 * https://leetcode.com/problems/valid-palindrome-ii/</a>
 */
public class ValidPalindromeII {

    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {

            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
                continue;
            }

            if ((left + 1 < s.length()) && (s.charAt(left + 1) == s.charAt(right))
                    && isPalindrome(s.substring(left + 1, right + 1))) {
                return true;
            }

            if ((right - 1 >= 0) && (s.charAt(left) == s.charAt(right - 1))
                    && isPalindrome(s.substring(left, (right - 1) + 1))) {
                return true;
            }

            return false;
        }

        return true;
    }

    private boolean isPalindrome(String substring) {
        int left = 0;
        int right = substring.length() - 1;
        while (left <= right) {
            if (substring.charAt(left) != substring.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
