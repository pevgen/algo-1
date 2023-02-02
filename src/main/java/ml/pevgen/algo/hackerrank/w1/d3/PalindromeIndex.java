package ml.pevgen.algo.hackerrank.w1.d3;

public class PalindromeIndex {

    public int palindromeIndex(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {

                if (isPalindrome(s.substring(left + 1, right + 1))){
                    return left;
                }

                if (isPalindrome(s.substring(left, right))){
                    return right;
                }

            }
            left++;
            right--;
        }
        return -1;
    }

    boolean isPalindrome(String ss) {
        int left = 0;
        int right = ss.length() - 1;

        while (left <= right) {
            if (ss.charAt(left) != ss.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
