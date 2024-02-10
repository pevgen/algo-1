package ml.pevgen.algo.leetcode.n412;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FizzBuzzTest {

    private FizzBuzz solution;

    @BeforeEach
    void setUp() {
        solution = new FizzBuzz();
    }

    @Test
    void should_return_list_example_1() {
        assertTrue(solution.fizzBuzz(0).isEmpty());
    }

    @Test
    void should_return_list_example_2() {
        assertEquals(1, solution.fizzBuzz(1).size());
        assertEquals("1", solution.fizzBuzz(1).get(0));
    }
    @Test
    void should_return_list_example_3() {
        List<String> result = solution.fizzBuzz(16);
        assertEquals(16, result.size());
        assertEquals("1", result.get(0));
        assertEquals("2", result.get(1));
        assertEquals("Fizz", result.get(2));
        assertEquals("4", result.get(3));
        assertEquals("Buzz", result.get(4));
        assertEquals("Fizz", result.get(5));
        assertEquals("7", result.get(6));
        assertEquals("8", result.get(7));
        assertEquals("Fizz", result.get(8));
        assertEquals("Buzz", result.get(9));
        assertEquals("11", result.get(10));
        assertEquals("Fizz", result.get(11));
        assertEquals("13", result.get(12));
        assertEquals("14", result.get(13));
        assertEquals("FizzBuzz", result.get(14));
        assertEquals("16", result.get(15));
    }
}