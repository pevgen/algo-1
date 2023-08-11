package ml.pevgen.algo.leetcode.n49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/group-anagrams/">
 * https://leetcode.com/problems/group-anagrams/</a>
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> sortedStringMap = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            sortedStringMap.computeIfAbsent(sortedWord, key -> new ArrayList<>());
            sortedStringMap.get(sortedWord).add(s);
        }

        return new ArrayList<>(sortedStringMap.values());
    }
}
