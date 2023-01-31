package ml.pevgen.algo.hackerrank.w1.d1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class PlusMinusTest {

    private PlusMinus plusMinus;

    @BeforeEach
    void setUp() {
        plusMinus = new PlusMinus();
    }

    @Test
    void should_print_0() {
        plusMinus.plusMinus(List.of(0));
    }

    @Test
    void should_print_1() {
        plusMinus.plusMinus(List.of(1));
    }

    @Test
    void should_print_minus_1() {
        plusMinus.plusMinus(List.of(-1));
    }

    @Test
    void should_print_example() {
        plusMinus.plusMinus(List.of(-4, 3, -9, 0, 4, 1));
    }



}