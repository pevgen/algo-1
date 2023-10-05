package ml.pevgen.algo.leetcode.n150;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvaluateReversePolishNotationTest {

    private EvaluateReversePolishNotation solution;

    @BeforeEach
    void setUp() {
        solution = new EvaluateReversePolishNotation();
    }

    @Test
    void should_eval_simple() {
        assertEquals(3, solution.evalRPN(new String[]{"2", "1", "+"}));
    }

    @Test
    void should_eval_example_1() {
        assertEquals(9, solution.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }

    @Test
    void should_eval_example_2() {
        assertEquals(6, solution.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }

    @Test
    void should_eval_example_3() {
        assertEquals(22, solution.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }
}