package ml.pevgen.algo.leetcode.n5;


/**
 * <a href="https://leetcode.com/problems/longest-palindromic-substring/">
 * https://leetcode.com/problems/longest-palindromic-substring/</a>
 */
public class LongestPalindromicSubstring {

    /**
     * Expand around center solution
     */
    public String longestPalindrome(String s) {

        if (s == null) {
            return null;
        }
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String palindrome = getPalindromeFromCenter(s, i, i);
            if (palindrome.length() > result.length()) {
                result = palindrome;
            }
            palindrome = getPalindromeFromCenter(s, i, i + 1);
            if (palindrome.length() > result.length()) {
                result = palindrome;
            }

        }

        return result;
    }

    String getPalindromeFromCenter(String str, int centerOne, int centerTwo) {

        int start = centerOne;
        int end = centerTwo;

        while ((start >= 0) && (end < str.length()) && (str.charAt(start) == str.charAt(end))) {
            start--;
            end++;
        }
        // previous equal values
        start++;
        end--;

        if (start <= end) {
            return str.substring(start, end + 1);
        } else {
            return "";
        }
    }


    /**
     * Brute force solution
     */
    public String longestPalindromeBrute(String s) {

        if (s == null) {
            return null;
        }
        if (s.length() <= 1) {
            return s;
        }
        int len = s.length();

        String result = s.substring(0, 1);
        for (int start = 0; start < len; start++) {
            for (int end = start + 1; end < len; end++) {
                String subString = s.substring(start, end + 1);
                if (isPalindrome(subString) && subString.length() > result.length()) {
                    result = subString;
                }
            }
        }
        return result;
    }

    private boolean isPalindrome(String subString) {
        for (int i = 0, j = subString.length() - 1; i <= j; i++, j--) {
            if (subString.charAt(i) != subString.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}
