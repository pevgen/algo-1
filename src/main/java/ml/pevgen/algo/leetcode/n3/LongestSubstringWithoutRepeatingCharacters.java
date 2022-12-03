package ml.pevgen.algo.leetcode.n3;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/</a>
 */
public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * Solution using "sliding window"
     */
    public int lengthOfLongestSubstring(String inputString) {
        Map<Character, Integer> chars = new HashMap<>();

        int left = 0;
        int right = 0;
        int result = 0;

        while (right < inputString.length()) {
            char ch = inputString.charAt(right);

            while (chars.get(ch) != null) { // check repeatable
                chars.remove(inputString.charAt(left)); // remove left
                left++;  // shift left border
            }
            chars.put(ch, right++);  // // shift right border
            result = Math.max(result, right - left);  //
        }

        result = Math.max(result, right - left);

        return result;
    }

    /**
     * Solution 1
     */
    public int lengthOfLongestSubstring1(String inputString) {
        Map<Character, Integer> chars = new HashMap<>();

        int maxLength = 0;
        int currentLength = 0;

        for (int i = 0; i < inputString.length(); i++) {

            char ch = inputString.charAt(i);

            if (chars.containsKey(ch)) {  // already have the char 'ch'

                // длина неповторяющегося участка
                currentLength = chars.size();
                if (maxLength == 0) {
                    maxLength = chars.size();
                }
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }

                Integer repeatIndex = chars.get(ch);

                // fill all after repeated character
                chars = new HashMap<>();
                for (int j = repeatIndex + 1; j <= i; j++) {
                    chars.put(inputString.charAt(j), j);
                }
            } else {
                chars.put(ch, i);
            }

        }

        if (chars.size() > maxLength) {
            maxLength = chars.size();
        }

        return maxLength;
    }


}
