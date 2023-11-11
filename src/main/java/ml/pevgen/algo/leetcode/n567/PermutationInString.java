package ml.pevgen.algo.leetcode.n567;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/permutation-in-string/description/">
 * https://leetcode.com/problems/permutation-in-string/description/</a>
 */
public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {

        HashMap<Character, Integer> charFreqMapS1 = new HashMap<>(); // char frequencies in permutation string
        for (char ch : s1.toCharArray()) {
            charFreqMapS1.merge(ch, 1, Integer::sum);
        }

        int startIndex = 0;
        int endIndex = s1.length() - 1;
        char[] chars = s2.toCharArray();
        while (endIndex < chars.length) {

            // compare frequencies in s1 and substring of s2
            if (checkCharFrequenciesInSubstr(charFreqMapS1, chars, startIndex, endIndex)) {
                return true;
            }

            startIndex++;
            endIndex++;
        }

        return false;
    }

    private boolean checkCharFrequenciesInSubstr(HashMap<Character, Integer> charFreqMapS1, char[] chars, int startIndex, int endIndex) {
        HashMap<Character, Integer> substrFreqMapS2 = new HashMap<>();
        for (int i = startIndex; i <= endIndex; i++) {
            substrFreqMapS2.merge(chars[i], 1, Integer::sum);
        }

        for (Map.Entry<Character, Integer> entry : charFreqMapS1.entrySet()) {
            Integer sum = substrFreqMapS2.get(entry.getKey());
            if ((sum == null) || (!sum.equals(entry.getValue()))) {
                return false;
            }
        }
        return true;
    }
}
