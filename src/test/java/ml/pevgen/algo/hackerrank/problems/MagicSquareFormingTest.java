package ml.pevgen.algo.hackerrank.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class MagicSquareFormingTest {

    private MagicSquareForming solution;

    @BeforeEach
    void setUp() {
        solution = new MagicSquareForming();
    }

    @Test
    void should_calc_min_cost() {
        Assertions.assertEquals(7, solution.formingMagicSquare(
                List.of(
                        List.of(5, 3, 4),
                        List.of(1, 5, 8),
                        List.of(6, 4, 2))));
    }
}