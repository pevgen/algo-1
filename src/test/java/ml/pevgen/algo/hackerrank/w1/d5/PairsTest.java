package ml.pevgen.algo.hackerrank.w1.d5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PairsTest {

    private Pairs pairs;

    @BeforeEach
    void setUp() {
        pairs = new Pairs();
    }

    @Test
    void should_() {
        assertEquals(3, pairs.pairs(1, List.of(1,2,3,4 )));
    }
}