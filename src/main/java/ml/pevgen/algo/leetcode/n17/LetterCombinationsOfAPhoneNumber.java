package ml.pevgen.algo.leetcode.n17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/">
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/</a>
 */
public class LetterCombinationsOfAPhoneNumber {

    private static final Map<String, String> NUMBERS_AS_LETTERS = Map.of(
            "2", "abc",
            "3", "def",
            "4", "ghi",
            "5", "jkl",
            "6", "mno",
            "7", "pqrs",
            "8", "tuv",
            "9", "wxyz"
    );

    public List<String> letterCombinations(String digits) {

        if (digits.isEmpty()) {
            return List.of();
        }

        List<String> result = new ArrayList<>();
        List<String> digitsAsList =
                Arrays.stream(digits.split(""))
                        .map(NUMBERS_AS_LETTERS::get)
                        .collect(Collectors.toList());
        permuteLetters("", digitsAsList, result);

        return result;
    }


    private void permuteLetters(String prefix, List<String> letterList, List<String> result) {
        if (letterList.size() == 1) {
            for (String letter : letterList.get(0).split("")) {
                result.add(prefix + letter);
            }
            return;
        }

        List<String> newLetterList = new ArrayList<>(letterList);
        newLetterList.remove(0);
        for (String letter : letterList.get(0).split("")) {
            permuteLetters(prefix + letter, newLetterList, result);
        }
    }
}
