package ml.pevgen.algo.leetcode.n859;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static java.util.Objects.isNull;

/**
 * <a href="https://leetcode.com/problems/buddy-strings/description/">
 * https://leetcode.com/problems/buddy-strings/description/</a>
 */
public class BuddyStrings {
    public boolean buddyStrings(String s, String goal) {
        if (isNull(s) || isNull(goal) || s.length() < 2 || s.length() != goal.length()) {
            return false;
        }

        // check duplicates chars in the same strings  O(1)
        if (s.equals(goal)) {
            HashSet<Character> countCharSet = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                if (countCharSet.contains(s.charAt(i))) {
                    return true;
                }
                countCharSet.add(s.charAt(i));
            }
            return false;
        }

        // check indexes of different chars
        List<Integer> diffIndexes = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                diffIndexes.add(i);
            }
        }
        //  If more or less than 2 diff indexes, than swap 2 chars can't help -> false
        if (diffIndexes.size() != 2) {
            return false;
        }
        // swap and compare
        return goal.equals(swapChars(s, diffIndexes.get(0), diffIndexes.get(1)));
    }

    public boolean buddyStrings_bruteforce(String s, String goal) {
        if (isNull(s) || isNull(goal) || s.length() < 2 || s.length() != goal.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == goal.charAt(i)
                        && goal.equals(swapChars(s, i, j))) {
                    return true;
                }
            }
        }
        return false;
    }

    private String swapChars(String s, int i, int j) {
        char[] sChars = s.toCharArray();
        sChars[i] = s.charAt(j);
        sChars[j] = s.charAt(i);
        return new String(sChars);
    }
}
