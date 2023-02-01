package ml.pevgen.algo.hackerrank.w1.d2;

import java.util.Arrays;
import java.util.List;

public class CountingSort1 {

    public List<Integer> countingSort(List<Integer> arr) {

        Integer[] array = new Integer[100];
        Arrays.fill(array, 0);

        for (Integer num : arr) {
            array[num] = array[num] + 1;
        }
        return Arrays.asList(array);

    }
}
