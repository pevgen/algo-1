package ml.pevgen.algo.leetcode.n344;

/**
 * <a href="https://leetcode.com/problems/reverse-string/description/">
 * https://leetcode.com/problems/reverse-string/description/</a>
 */
public class ReverseString {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char tempChar = s[right];
            s[right] = s[left];
            s[left] = tempChar;
            left++;
            right--;
        }
    }
}
