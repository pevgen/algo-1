package ml.pevgen.algo.leetcode.n387;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/first-unique-character-in-a-string/description/">
 * https://leetcode.com/problems/first-unique-character-in-a-string/description/</a>
 */
public class FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
        Map<Character, Integer> counts = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            counts.merge(s.charAt(i), 1, (k, v) -> v + 1);
//            Integer cnt = counts.get(s.charAt(i));
//            if (cnt == null) {
//                counts.put(s.charAt(i), 1);
//            } else {
//                counts.put(s.charAt(i), cnt + 1);
//            }
        }

        for (int i = 0; i < s.length(); i++) {
            Integer cnt = counts.get(s.charAt(i));
            if (cnt == 1) {
                return i;
            }
        }
        return -1;
    }
}
