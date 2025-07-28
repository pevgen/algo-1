package ml.pevgen.algo.others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionTest {

    @Test
    void firstBadVersion_badVersionInMiddle_returnsCorrectVersion() {
        FirstBadVersion solution = new FirstBadVersion(4);
        assertEquals(4, solution.firstBadVersion(10));
    }

    @Test
    void firstBadVersion_firstVersionIsBad_returnsOne() {
        FirstBadVersion solution = new FirstBadVersion(1);
        assertEquals(1, solution.firstBadVersion(10));
    }

    @Test
    void firstBadVersion_lastVersionIsBad_returnsLastVersion() {
        FirstBadVersion solution = new FirstBadVersion(10);
        assertEquals(10, solution.firstBadVersion(10));
    }

    @Test
    void firstBadVersion_singleVersion_returnsOneIfBad() {
        FirstBadVersion solution = new FirstBadVersion(1);
        assertEquals(1, solution.firstBadVersion(1));
    }

    @Test
    void firstBadVersion_noBadVersion_returnsZero() {
        FirstBadVersion solution = new FirstBadVersion(11);
        assertEquals(10, solution.firstBadVersion(10));
    }
}