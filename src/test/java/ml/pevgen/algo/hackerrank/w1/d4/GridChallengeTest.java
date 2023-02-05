package ml.pevgen.algo.hackerrank.w1.d4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GridChallengeTest {

    private GridChallenge gridChallenge;

    @BeforeEach
    void setUp() {
        gridChallenge = new GridChallenge();
    }

    @Test
    void should_return_yes_for_one_char() {
        assertEquals("YES", gridChallenge.gridChallenge(List.of("1")));
    }

    @Test
    void should_return_yes_for_example() {
        assertEquals("YES", gridChallenge.gridChallenge(List.of("ebacd", "fghij", "olmkn", "trpqs", "xywuv")));
        assertEquals("YES", gridChallenge.gridChallenge(List.of("ppp", "ypp", "wyw")));
    }

    @Test
    void should_return_yes_for_another_example() {
        assertEquals("NO", gridChallenge.gridChallenge(List.of("fghij", "ebacd", "olmkn", "trpqs", "xywuv")));
    }

}