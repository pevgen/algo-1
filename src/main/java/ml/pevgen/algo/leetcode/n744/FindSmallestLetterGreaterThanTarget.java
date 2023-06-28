package ml.pevgen.algo.leetcode.n744;

/**
 * <a href="https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/">
 *     https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/</a>
 */
public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int leftIndex = 0;
        int rightIndex = letters.length - 1;
        int resultIndex = -1;

        if ((target > letters[rightIndex]) || (target < letters[leftIndex])) {
            return letters[0];
        }

        while (rightIndex - leftIndex > 1) {
            int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;
            if (letters[middleIndex] == target) {
                if (middleIndex < letters.length - 1) {
                    resultIndex = middleIndex + 1;
                    break;
                }
            } else if (letters[middleIndex] <= target) {
                leftIndex = middleIndex;
            } else {
                rightIndex = middleIndex;
            }
        }

        if ((letters[leftIndex] == target)) {
            resultIndex = leftIndex + 1;
        } else if (letters[rightIndex] == target) {
            if (rightIndex < letters.length - 1) {
                resultIndex = rightIndex + 1;
            } else {
                resultIndex = 0;
            }
        } else if (resultIndex == -1) {
            resultIndex = rightIndex;
        }

        while (letters[resultIndex] == target) {
            resultIndex++;
        }

        return letters[resultIndex];
    }
}
