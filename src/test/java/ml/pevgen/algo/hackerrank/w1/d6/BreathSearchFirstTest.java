package ml.pevgen.algo.hackerrank.w1.d6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class BreathSearchFirstTest {

    private BreathSearchFirst bfs;

    @BeforeEach
    void setUp() {
        bfs = new BreathSearchFirst();
    }

    @Test
    void test_example_1() {

        List<Integer> result = bfs.bfs(1, 1,
                List.of(
                        List.of(5, 6),
                        List.of(3, 5),
                        List.of(2, 4),
                        List.of(2, 3),
                        List.of(3, 7)),
                3);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(-1, result.get(0));
    }

    @Test
    void test_example_2() {

        List<Integer> result = bfs.bfs(1, 1,
                List.of(
                        List.of(4, 2),
                        List.of(1, 2),
                        List.of(1, 3)),
                2);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(6, result.get(0));
    }

    /**
     * 1
     * 10 6
     * 3 1
     * 10 1
     * 10 1
     * 3 1
     * 1 8
     * 5 2
     * 3
     * <p>
     * <p>
     * expected 6 -1 -1 -1 -1 -1 12 -1 12
     */
    @Test
    void test_example_3() {

        List<Integer> result = bfs.bfs(10, 6,
                List.of(
                        List.of(3, 1),
                        List.of(10, 1),
                        List.of(10, 1),
                        List.of(3, 1),
                        List.of(1, 8),
                        List.of(5, 2)),
                3);
        assertNotNull(result);
        assertEquals(9, result.size());
        assertEquals(6, result.get(0));
        assertEquals(-1, result.get(1));
        assertEquals(-1, result.get(2));
        assertEquals(-1, result.get(3));
        assertEquals(-1, result.get(4));
        assertEquals(-1, result.get(5));
        assertEquals(12, result.get(6));
        assertEquals(-1, result.get(7));
        assertEquals(12, result.get(8));

    }


}