package ml.pevgen.algo.others;

import java.util.*;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> num1Map = new HashMap<>();
        for (int n1 : nums1) {
            num1Map.put(n1, num1Map.getOrDefault(n1, 0) + 1);
        }

        List<Integer> resultList = new ArrayList<>();
        for (int n2 : nums2) {
            if (num1Map.containsKey(n2)) {
                resultList.add(n2);
                int cnt = num1Map.get(n2) - 1;
                if (cnt == 0) {
                    num1Map.remove(n2);
                } else {
                    num1Map.put(n2, cnt);
                }
            }
        }

        return Arrays.stream(resultList.toArray(new Integer[0])).mapToInt(i -> i).toArray();
    }
}
