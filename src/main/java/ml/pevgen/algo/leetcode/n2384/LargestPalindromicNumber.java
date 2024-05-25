package ml.pevgen.algo.leetcode.n2384;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.com/problems/largest-palindromic-number/">
 * https://leetcode.com/problems/largest-palindromic-number/</a>
 */
public class LargestPalindromicNumber {

    public String largestPalindromic(String num) {
        List<String> halfCharsList = new ArrayList<>();
        TreeMap<Character, Integer> charsMap = new TreeMap<>(Comparator.reverseOrder());
        char[] chars = num.toCharArray();
        for (char aChar : chars) {
            charsMap.merge(aChar, 1, Integer::sum);
        }

        if (!charsMap.isEmpty() && charsMap.firstEntry().getKey() == '0') {
            return "0";
        }

        Character maxChar = null;
        boolean hasDuplicates = false;
        for (Map.Entry<Character, Integer> entry : charsMap.entrySet()) {
            int reminder = entry.getValue() % 2;

            if (reminder == 1) {
                if (maxChar == null) {
                    maxChar = entry.getKey();
                }
                if (entry.getValue() - 1 > 0) {
                    for (int i = 0; i < (entry.getValue() - 1) / 2; i++) {
                        halfCharsList.add(String.valueOf(entry.getKey()));
                        if (entry.getKey() != '0') {
                            hasDuplicates = true;
                        }
                    }
                }
            }

            if (reminder == 0 && entry.getKey() != '0') {
                for (int i = 0; i < entry.getValue() / 2; i++) {
                    halfCharsList.add(String.valueOf(entry.getKey()));
                    hasDuplicates = true;
                }
            }

            if (reminder == 0 && entry.getKey() == '0' && !halfCharsList.isEmpty()) {
                for (int i = 0; i < entry.getValue() / 2; i++) {
                    halfCharsList.add(String.valueOf(entry.getKey()));
                }
            }
        }

        if (!hasDuplicates) {
            return String.valueOf(maxChar);
        }

        String result = String.join("", halfCharsList);

        if (maxChar != null) {
            result = result + maxChar;
        }

        String reverseString = halfCharsList.stream().sorted().collect(Collectors.joining());
        return result + reverseString;
    }

}
