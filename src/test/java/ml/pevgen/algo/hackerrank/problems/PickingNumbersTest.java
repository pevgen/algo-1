package ml.pevgen.algo.hackerrank.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PickingNumbersTest {

    private PickingNumbers solution;

    @BeforeEach
    void setUp() {
        solution = new PickingNumbers();
    }

    @Test
    void should_count_correct_count() {
        assertEquals(3, solution.pickingNumbers(List.of(4, 6, 5, 3, 3, 1)));
        assertEquals(5, solution.pickingNumbers(List.of(66, 66, 66, 66, 66)));
        assertEquals(50, solution.pickingNumbers(List.of(
                4, 97, 5, 97, 97, 4, 97, 4, 97, 97, 97, 97, 4, 4, 5, 5,
                97, 5, 97, 99, 4, 97, 5, 97, 97, 97, 5, 5, 97, 4, 5,
                97, 97, 5, 97, 4, 97, 5, 4, 4, 97, 5, 5, 5, 4, 97, 97,
                4, 97, 5, 4, 4, 97, 97, 97, 5, 5, 97, 4, 97, 97, 5, 4, 97,
                97, 4, 97, 97, 97, 5, 4, 4, 97, 4, 4, 97, 5, 97, 97, 97, 97,
                4, 97, 5, 97, 5, 4, 97, 4, 5, 97, 97, 5, 97, 5, 97, 5, 97, 97, 97)));
    }
}