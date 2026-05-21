package ml.pevgen.algo.leetcode.quest.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q2EvaluateReversePolishNotationTest {

    private final Q2EvaluateReversePolishNotation solution = new Q2EvaluateReversePolishNotation();

    @Test
    void evalRPN() {

        assertEquals(1, solution.evalRPN(new String[]{"4","3","-"}));
        assertEquals(9, solution.evalRPN(new String[]{"2","1","+","3","*"}));
        assertEquals(6, solution.evalRPN(new String[]{"4","13","5","/","+"}));
        assertEquals(22, solution.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}