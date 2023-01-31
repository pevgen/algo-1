package ml.pevgen.algo.hackerrank.w1.d1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FindMedianTest {

    private FindMedian findMedian;

    @BeforeEach
    void setUp() {
        findMedian = new FindMedian();
    }

    @Test
    void should_find_median() {
        Assertions.assertEquals(5, findMedian.findMedian(new ArrayList<>(List.of(1, 3, 5, 7, 9))));
    }
}