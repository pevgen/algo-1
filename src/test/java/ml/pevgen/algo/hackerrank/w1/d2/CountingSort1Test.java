package ml.pevgen.algo.hackerrank.w1.d2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountingSort1Test {

    private CountingSort1 countingSort1;

    @BeforeEach
    void setUp() {
        countingSort1 = new CountingSort1();
    }

    @Test
    void should_return_zero() {
        assertEquals(1, countingSort1.countingSort(List.of(0)).get(0));
        assertEquals(0, countingSort1.countingSort(List.of(0)).get(1));
        assertEquals(100, countingSort1.countingSort(List.of(0)).size());
    }
}