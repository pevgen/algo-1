package ml.pevgen.algo.leetcode.n844;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BackspaceStringCompareTest {

    private BackspaceStringCompare solution;

    @BeforeEach
    void setUp() {
        solution = new BackspaceStringCompare();
    }

    @Test
    void should_return_false() {
        assertFalse(solution.backspaceCompare("a#c", "b"));
    }

    @Test
    void should_return_true_example_1() {
        assertTrue(solution.backspaceCompare("ab#c", "ad#c"));
    }

    @Test
    void should_return_true_example_2() {
        assertTrue(solution.backspaceCompare("ab##", "c#d#"));
    }

    @Test
    void should_return_true_example_3() {
        assertTrue(solution.backspaceCompare("bxaj##", "bxao#j##"));
    }

    @Test
    void should_return_false_example_4() {
        assertFalse(solution.backspaceCompare("rmp", "rm#p"));
    }

    @Test
    void should_return_false_example_5() {
        assertFalse(solution.backspaceCompare("bxj##tw", "bxj###tw"));
    }



}