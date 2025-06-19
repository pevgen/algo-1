package ml.pevgen.algo.others;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
        if (s == null || s.isEmpty()) {
            return -1;
        }

        LinkedHashMap<Character, Integer> charCountByIndex = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCountByIndex.put(c, charCountByIndex.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountByIndex.sequencedEntrySet()) {
            if (entry.getValue() == 1) {
                return s.indexOf(entry.getKey());
            }
        }

        return -1;
    }
}
