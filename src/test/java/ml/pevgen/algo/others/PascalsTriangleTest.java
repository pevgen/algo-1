package ml.pevgen.algo.others;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleTest {

    private final PascalsTriangle pascalsTriangle = new PascalsTriangle();

    @Test
    void should_generate_simple_results() {
        List<List<Integer>> result = pascalsTriangle.generate(1);
        assertEquals(1, result.size());

        result = pascalsTriangle.generate(2);
        assertEquals(2, result.size());
        assertEquals(1, result.get(0).getFirst());
        assertEquals(2, result.get(1).size());
        assertEquals(1, result.get(1).get(0));
        assertEquals(1, result.get(1).get(1));
    }

    @Test
    void should_generate_results() {

        List<List<Integer>> result = pascalsTriangle.generate(5);
        assertEquals(5, result.size());
        assertEquals(1, result.get(0).getFirst());

        assertEquals(2, result.get(1).size());
        assertEquals(1, result.get(1).get(0));
        assertEquals(1, result.get(1).get(1));

        assertEquals(3, result.get(2).size());
        assertEquals(1, result.get(2).get(0));
        assertEquals(2, result.get(2).get(1));
        assertEquals(1, result.get(2).get(2));


        assertEquals(4, result.get(3).size());
        assertEquals(1, result.get(3).get(0));
        assertEquals(3, result.get(3).get(1));
        assertEquals(3, result.get(3).get(2));
        assertEquals(1, result.get(3).get(3));

        assertEquals(5, result.get(4).size());
        assertEquals(1, result.get(4).get(0));
        assertEquals(4, result.get(4).get(1));
        assertEquals(6, result.get(4).get(2));
        assertEquals(4, result.get(4).get(3));
        assertEquals(1, result.get(4).get(4));
    }

}