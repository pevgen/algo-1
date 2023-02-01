package ml.pevgen.algo.hackerrank.w1.d2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiagonalDifferenceTest {

    private DiagonalDifference diagonalDifference;

    @BeforeEach
    void setUp() {
        diagonalDifference = new DiagonalDifference();
    }

    @Test
    void should_return_zero() {
        assertEquals(0, diagonalDifference.diagonalDifference(List.of(List.of(1))));
    }

    @Test
    void should_return_example_1() {
        assertEquals(2,
                diagonalDifference.diagonalDifference(
                        List.of(
                                List.of(1, 2, 3),
                                List.of(4, 5, 6),
                                List.of(9, 8, 9))));
    }

    @Test
    void should_return_example_2() {
        assertEquals(15,
                diagonalDifference.diagonalDifference(
                        List.of(
                                List.of(11, 2, 4),
                                List.of(4, 5, 6),
                                List.of(10, 8, -12))));
    }

}