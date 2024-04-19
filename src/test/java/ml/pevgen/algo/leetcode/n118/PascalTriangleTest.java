package ml.pevgen.algo.leetcode.n118;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PascalTriangleTest {

    private PascalTriangle solution;

    @BeforeEach
    void setUp() {
        solution = new PascalTriangle();
    }

    @Test
    void should_generate_simple_triangle() {
        List<List<Integer>> result = solution.generate(1);
        assertEquals(1, result.size());
        assertEquals(1, result.get(0).size());
        assertEquals(1, result.get(0).get(0));

        List<List<Integer>> result2 = solution.generate(2);
        assertEquals(2, result2.size());
        assertEquals(1, result2.get(0).size());
        assertEquals(1, result2.get(0).get(0));
        assertEquals(2, result2.get(1).size());
    }


    @Test
    void should_generate_triangle_3() {
        List<List<Integer>> result = solution.generate(3);
        assertEquals(3, result.size());
        assertEquals(1, result.get(2).get(0));
        assertEquals(2, result.get(2).get(1));
        assertEquals(1, result.get(2).get(2));
    }

    @Test
    void should_generate_triangle_4() {
        List<List<Integer>> result = solution.generate(4);
        assertEquals(4, result.size());
        assertEquals(1, result.get(2).get(0));
        assertEquals(2, result.get(2).get(1));
        assertEquals(1, result.get(2).get(2));

        assertEquals(1, result.get(3).get(0));
        assertEquals(3, result.get(3).get(1));
        assertEquals(3, result.get(3).get(2));
        assertEquals(1, result.get(3).get(3));
    }

}