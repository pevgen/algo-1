package ml.pevgen.algo.hackerrank.w1.d4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NewYearChaosTest {

    private NewYearChaos newYearChaos;

    @BeforeEach
    void setUp() {
        newYearChaos = new NewYearChaos();
    }

    @Test
    void should_find_one_bribe_one_element() {
        assertEquals(1, newYearChaos.minimumBribes(
                new ArrayList<>(List.of(1, 2, 3, 5, 4, 6, 7, 8))));
        assertEquals(1, newYearChaos.minimumBribes(
                new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 8, 7))));
        assertEquals(1, newYearChaos.minimumBribes(
                new ArrayList<>(List.of(2, 1, 3, 4, 5, 6, 7, 8))));
    }

    @Test
    void should_find_two_bribes() {
        assertEquals(2, newYearChaos.minimumBribes(
                new ArrayList<>(List.of(1, 2, 5, 3, 4, 6, 7, 8))));
        assertEquals(2, newYearChaos.minimumBribes(
                new ArrayList<>(List.of(1, 2, 3, 4, 5, 8, 6, 7))));
        assertEquals(2, newYearChaos.minimumBribes(
                new ArrayList<>(List.of(3, 1, 2, 4, 5, 6, 7, 8))));
    }

    @Test
    void should_find_three_bribes() {
        assertEquals(3, newYearChaos.minimumBribes(
                new ArrayList<>(List.of(2, 1, 5, 3, 4))));
    }

    @Test
    void should_find_four_bribes() {
        assertEquals(4, newYearChaos.minimumBribes(
                new ArrayList<>(List.of(1, 2, 5, 3, 4, 7, 8, 6))));
    }

    @Test
    void should_find_too_chaotic() {
        assertEquals(-1, newYearChaos.minimumBribes(
                new ArrayList<>(List.of(1, 5, 2, 3, 4, 7, 8, 6))));
    }


}