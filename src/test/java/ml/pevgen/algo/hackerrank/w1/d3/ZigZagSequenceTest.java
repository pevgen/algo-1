package ml.pevgen.algo.hackerrank.w1.d3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ZigZagSequenceTest {

    private ZigZagSequence zigZagSequence;

    @BeforeEach
    void setUp() {
        zigZagSequence = new ZigZagSequence();
    }

    @Test
    void should_print_correct_zigzag() {
        zigZagSequence.findZigZagSequence(new int[]{1, 2, 3}, 3);
        zigZagSequence.findZigZagSequence(new int[]{1, 2, 3, 4, 5}, 5);
        zigZagSequence.findZigZagSequence(new int[]{1, 2, 3, 4, 5, 6, 7}, 7);
        zigZagSequence.findZigZagSequence(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 9);
        zigZagSequence.findZigZagSequence(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}, 11);
    }
}