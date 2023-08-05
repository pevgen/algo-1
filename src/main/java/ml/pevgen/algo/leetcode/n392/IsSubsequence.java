package ml.pevgen.algo.leetcode.n392;

/**
 * <a href="https://leetcode.com/problems/is-subsequence/description/">
 * https://leetcode.com/problems/is-subsequence/description/</a>
 */
public class IsSubsequence {
    public boolean isSubsequence(String subStr, String mainStr) {
        if (subStr.isEmpty()) {
            return true;
        }

        if (mainStr.isEmpty()) {
            return false;
        }


        int mainStrPointer = 0;
        int subStrPointer = 0;
        while (subStrPointer < subStr.length() && mainStrPointer < mainStr.length()) {
            char substrCh = subStr.charAt(subStrPointer);
            char mainStrCh = mainStr.charAt(mainStrPointer);
            if (mainStrCh == substrCh) {
                subStrPointer++;
            }
            mainStrPointer++;
        }

        // main string finished earlier
        if (subStrPointer < subStr.length()) {
            return false;
        }

        char substrCh = subStr.charAt(subStr.length() - 1);
        char mainStrCh = mainStr.charAt(mainStr.length() - 1);

        // last char fom main and sub strings the same
        if (mainStrPointer == mainStr.length() && subStrPointer == subStr.length() && substrCh != mainStrCh) {
            return false;
        }

        return true;
    }
}
