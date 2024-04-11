package ml.pevgen.algo.leetcode.n28;

/**
 * <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/">
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/</a>
 */
public class FindTheIndexOfTheFirstOccurrenceInAString {

    public int strStr(String haystack, String needle) {
        if (haystack.isEmpty() || haystack.length() < needle.length()) {
            return -1;
        }

        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();

        int result = -1;
        for (int i = 0; i < haystackChars.length; i++) {
            if (haystackChars[i] == needleChars[0]) {
                int start = i;
                boolean found = true;
                for (char needleChar : needleChars) {
                    if (start >= haystackChars.length || haystackChars[start] != needleChar) {
                        found = false;
                    }
                    start++;
                }
                if (found) {
                    result = i;
                    break;
                }
            }
        }

        return result;
    }
}
