package ml.pevgen.algo.hackerrank.w1.d2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LonelyIntegerTest {


    LonelyInteger lonelyInteger;

    @BeforeEach
    void setUp() {
        lonelyInteger = new LonelyInteger();
    }

    @Test
    void should_return_one() {
        assertEquals(1, lonelyInteger.lonelyInteger(List.of(1)));
    }

    @Test
    void should_return_from_example() {
        assertEquals(4, lonelyInteger.lonelyInteger(List.of(1 ,2, 3, 4, 3, 2, 1)));
    }

}