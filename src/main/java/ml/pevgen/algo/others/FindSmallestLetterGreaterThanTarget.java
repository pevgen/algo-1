package ml.pevgen.algo.others;

public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        if (letters[letters.length - 1] <= target || letters[0] > target) {
            return letters[0];
        }

        int ind1 = 0;
        int ind2 = letters.length - 1;

        while (ind1 <= ind2) {
            int midInd = ind1 + (ind2 - ind1) / 2;

            if (letters[midInd] <= target) {
                ind1 = midInd + 1;
            } else {
                ind2 = midInd - 1;
            }

        }

        return letters[ind1];
    }
}
