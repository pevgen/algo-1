package ml.pevgen.algo.algo1.fewmaxvalues;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FewMaxFinderByPriorityQueueTest {

    @Test
    void should_return_few_max_values() {
        FewMaxFinderByPriorityQueue finder = new FewMaxFinderByPriorityQueue();
        int[] result = finder.selectFewMaxValues(new int[]{7, 34, 5, 22, 8, 23, 1, 12}, 3);
        assertArrayEquals(new int[]{22, 23, 34}, result);
        Arrays.stream(result).forEach(System.out::println);
    }

}