package ml.pevgen.algo.leetcode.n424;

/**
 * <a href="https://leetcode.com/problems/longest-repeating-character-replacement/">
 * https://leetcode.com/problems/longest-repeating-character-replacement/</a>
 */
public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int result = -1;
        for (int i = 0; i < s.length(); i++) {
            int currentLength = seqLength(s, i, k);
            if (currentLength > result) {
                result = currentLength;
            }
        }
        return result;
    }

    int seqLength(String inputString, int currentIndex, int k) {
        char[] chars = inputString.toCharArray();
        char currentChar = chars[currentIndex];
        int currentLength = 1;
        int changedChars = 0;

        // go to the left
        int i = currentIndex - 1;
        while (i >= 0) {

            if (chars[i] != currentChar && changedChars == k) {
                break;
            }

            if (chars[i] != currentChar) {
                changedChars++;
            }
            currentLength++;
            i--;
        }
        // go to the right
        i = currentIndex + 1;
        while (i < chars.length) {

            if (chars[i] != currentChar && changedChars == k) {
                break;
            }

            if (chars[i] != currentChar) {
                changedChars++;
            }
            currentLength++;
            i++;
        }

        return currentLength;
    }

}
