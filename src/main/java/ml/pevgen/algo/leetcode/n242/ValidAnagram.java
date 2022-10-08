package ml.pevgen.algo.leetcode.n242;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Valid Anagram
 *
 * <a href="https://leetcode.com/problems/valid-anagram/">https://leetcode.com/problems/valid-anagram/</a>
 */
public class ValidAnagram {

    public static void main(String[] args) {

        System.out.println(" (expected: false) : " + new ValidAnagram().isAnagram(null, null));
        System.out.println(" (expected: false) : " + new ValidAnagram().isAnagram(null, ""));
        System.out.println(" (expected: false) : " + new ValidAnagram().isAnagram("", null));
        System.out.println(" (expected: false) : " + new ValidAnagram().isAnagram("ab", "ba "));
        System.out.println(" (expected: true) : " + new ValidAnagram().isAnagram(" ", " "));
        System.out.println(" (expected: true) : " + new ValidAnagram().isAnagram("aba", "baa"));
        System.out.println(" (expected: true) : " + new ValidAnagram().isAnagram("anagram", "nagaram"));
    }

    public boolean isAnagramV1(String s, String t) {
        if ((s == null) || (t == null)) {
            return false;
        }

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> lettersMap1 = new HashMap<>();
        Map<Character, Integer> lettersMap2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lettersMap1.merge(s.charAt(i), 1, (a, b) -> a + 1);
            lettersMap2.merge(t.charAt(i), 1, (a, b) -> a + 1);
        }

        return lettersMap1.entrySet().stream()
                .allMatch(e -> e.getValue().equals(lettersMap2.get(e.getKey())));

    }

    public boolean isAnagram(String s, String t) {

        if ((s == null) || (t == null)) {
            return false;
        }

        if (s.length() != t.length()) {
            return false;
        }

        char[] lettersArray1 = s.toCharArray();
        Arrays.sort(lettersArray1);

        char[] lettersArray2 = t.toCharArray();
        Arrays.sort(lettersArray2);

        return Arrays.compare(lettersArray1, lettersArray2) == 0;

    }

}
