package ml.pevgen.algo.leetcode.n67;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddBinaryTest {

    private AddBinary solution;

    @BeforeEach
    void setUp() {
        solution = new AddBinary();
    }

    @Test
    void should_add_with_0() {
        assertEquals("1101", solution.addBinary("0", "1101"));
        assertEquals("1101", solution.addBinary("1101", "0"));
    }

    @Test
    void should_add_example_1() {
        assertEquals("100", solution.addBinary("11", "1"));
    }

    @Test
    void should_add_example_2() {
        assertEquals("10101", solution.addBinary("1010", "1011"));
    }

}