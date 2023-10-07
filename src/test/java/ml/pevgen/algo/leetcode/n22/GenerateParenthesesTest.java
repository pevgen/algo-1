package ml.pevgen.algo.leetcode.n22;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenerateParenthesesTest {

    private GenerateParentheses solution;

    @BeforeEach
    void setUp() {
        solution = new GenerateParentheses();
    }

    @Test
    void should_generate_parenthesis_example_1() {
        List<String> result = solution.generateParenthesis(1);
        assertEquals(1, result.size());
        assertEquals("()", result.get(0));
    }

    @Test
    void should_generate_parenthesis_example_2() {
        List<String> result = solution.generateParenthesis(2);
        assertEquals(2, result.size());
        assertEquals("(())", result.get(0));
        assertEquals("()()", result.get(1));
    }

    @Test
    void should_generate_parenthesis_example_3() {
        List<String> result = solution.generateParenthesis(3);
        assertEquals(5, result.size());
        assertEquals("((()))", result.get(0));
        assertEquals("()()()", result.get(4));
    }

}