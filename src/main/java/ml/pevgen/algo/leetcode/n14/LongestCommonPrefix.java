package ml.pevgen.algo.leetcode.n14;

/**
 * <a href="https://leetcode.com/problems/longest-common-prefix/">
 * https://leetcode.com/problems/longest-common-prefix/</a>
 */
public class LongestCommonPrefix {

    private static final int MAX_INDEX = 200;

    public String longestCommonPrefix(String[] strs) {

        StringBuilder result = new StringBuilder();
        boolean isResult = false;
        for (int index = 0; index <= MAX_INDEX; index++) {
            char currentChar = 0;

            for (String currentStr : strs) {
                if ((currentStr.length() - 1 < index)
                        || ((currentChar != 0) && (currentChar != currentStr.charAt(index)))) {
                    isResult = true;
                    break;
                }
                currentChar = currentStr.charAt(index);
            }

            if (isResult) {
                break;
            }
            result.append(currentChar);
        }

        return result.toString();
    }
}
