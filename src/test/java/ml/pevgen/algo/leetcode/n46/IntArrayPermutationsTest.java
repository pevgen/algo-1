package ml.pevgen.algo.leetcode.n46;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class IntArrayPermutationsTest {

    IntArrayPermutations solution = new IntArrayPermutations();

    @Test
    void should_return_one_list() {
        assertIterableEquals(
                Arrays.asList(1),
                solution.permute(new int[]{1}).get(0));
    }

    @Test
    void should_return_two_list() {

        List<List<Integer>> result = permute(new int[]{0, 1});

        assertEquals(2, result.size());

        assertIterableEquals(
                Arrays.asList(0, 1),
                result.get(0));
        assertIterableEquals(
                Arrays.asList(1, 0),
                result.get(1));

    }

    private List<List<Integer>> permute(int[] ints) {

        List<Integer> intsList = Arrays.stream(ints).boxed().collect(Collectors.toList());

        List<List<Integer>> result = new ArrayList<>();
        permute2(intsList, new ArrayList<>(), result);
        return result;
    }

    private void permute2(List<Integer> currentList, List<Integer> prefix, List<List<Integer>> result) {
        if (currentList.isEmpty()) {
            result.add(prefix);
            return;
        }

        for (int i = 0; i < currentList.size(); i++) {

            Integer next = currentList.get(i);

            List<Integer> newPrefix = new ArrayList<>(prefix);
            newPrefix.add(next);

            ArrayList<Integer> copyNoElement = new ArrayList<>(currentList);
            copyNoElement.remove(next);
            permute2(copyNoElement, newPrefix, result);
        }


    }

    @Test

    void should_long_return() {
        assertEquals("as",longestCommonPrefix(new String[]{"asm", "asfgrt", "asfr"}));
    }

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        int minLen = strs[0].length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < minLen; i++) {
            char ch = strs[0].charAt(i);
            for (String ss : strs) {
                if (ss.charAt(i) != ch) {
                    return sb.toString();
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }

}