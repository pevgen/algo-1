package ml.pevgen.algo.leetcode.n49;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    private GroupAnagrams solution;

    @BeforeEach
    void setUp() {
        solution = new GroupAnagrams();
    }

    @Test
    void should_return_one_list_for_one_empty_string() {
        List<List<String>> result = solution.groupAnagrams(new String[]{""});
        assertEquals(1, result.size());
        assertEquals("", result.get(0).get(0));
    }

    @Test
    void should_return_one_list_for_one_string() {
        List<List<String>> result = solution.groupAnagrams(new String[]{"a"});
        assertEquals(1, result.size());
        assertEquals("a", result.get(0).get(0));
    }

    @Test
    void should_return_anagram_list() {
        List<List<String>> result = solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        assertEquals(3, result.size());

        for (List<String> l : result) {
            switch (l.size()) {
                case 1:
                    assertEquals("bat", l.get(0));
                    break;
                case 2:
                    assertTrue(l.contains("nat") && l.contains("tan"));
                    break;
                case 3:
                    assertTrue(l.contains("ate") && l.contains("eat") && l.contains("tea"));
                    break;
                default:
                    fail();
            }
        }
    }

}