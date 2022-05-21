package ml.pevgen.algo.stepik;

import org.junit.Test;

import static ml.pevgen.algo.stepik.PointsAndSegments.minusPoints;
import static ml.pevgen.algo.stepik.PointsAndSegments.plusPoints;
import static org.junit.Assert.assertEquals;

public class PointsAndSegmentsTest {


    @Test
    public void test_plus_empty_array() {
        int[] in = new int[]{};
        assertEquals(0, plusPoints(in, 1));
    }

    @Test
    public void test_plus_same_digit_array() {
        var in = new int[]{1, 1, 1};
        assertEquals(3, plusPoints(in, 1));

        in = new int[]{1, 1, 1};
        assertEquals(0, plusPoints(in, -1));

        in = new int[]{1, 1, 1};
        assertEquals(3, plusPoints(in, 2));
    }


    @Test
    public void test_plus_before_digit_array() {
        var in = new int[]{0, 1, 1, 1};
        assertEquals(4, plusPoints(in, 1));

        in = new int[]{0, 1, 1, 1};
        assertEquals(0, plusPoints(in, -1));

        in = new int[]{0, 1, 1, 1};
        assertEquals(4, plusPoints(in, 2));

        in = new int[]{-3, 1, 1, 1};
        assertEquals(0, plusPoints(in, -4));

        in = new int[]{-3, -2, 1, 1, 1};
        assertEquals(2, plusPoints(in, -1));
    }

    @Test
    public void test_plus_before_and_after_digit_array() {
        var in = new int[]{0, 1, 1, 1, 2};
        assertEquals(4, plusPoints(in, 1));

        in = new int[]{0, 0, 1, 1, 1, 2, 2};
        assertEquals(0, plusPoints(in, -1));

        in = new int[]{0, 1, 1, 1, 2, 2, 3, 3, 5};
        assertEquals(6, plusPoints(in, 2));

        in = new int[]{-3, 1, 1, 1, 2, 2, 7};
        assertEquals(0, plusPoints(in, -4));

        in = new int[]{-3, -3, -2, -2, 1, 1, 1,};
        assertEquals(4, plusPoints(in, -1));
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void test_minus_empty_array() {
        int[] in = new int[]{};
        assertEquals(0, minusPoints(in, 1));
    }

    @Test
    public void test_minus_same_digit_array() {
        var in = new int[]{1, 1, 1};
        assertEquals(0, minusPoints(in, 1));

        in = new int[]{1, 1, 1};
        assertEquals(0, minusPoints(in, -1));

        in = new int[]{1, 1, 1};
        assertEquals(3, minusPoints(in, 2));
    }

    @Test
    public void test_minus_before_digit_array() {
        var in = new int[]{0, 1, 1, 1};
        assertEquals(1, minusPoints(in, 1));

        in = new int[]{0, 1, 1, 1};
        assertEquals(0, minusPoints(in, -1));

        in = new int[]{0, 1, 1, 1};
        assertEquals(4, minusPoints(in, 2));

        in = new int[]{-3, 1, 1, 1};
        assertEquals(0, minusPoints(in, -4));

        in = new int[]{-3, -2, 1, 1, 1};
        assertEquals(2, minusPoints(in, -1));
    }

    @Test
    public void test_minus_before_and_after_digit_array() {
        var in = new int[]{0, 1, 1, 1, 2};
        assertEquals(1, minusPoints(in, 1));

        in = new int[]{0, 0, 1, 1, 1, 2, 2};
        assertEquals(0, minusPoints(in, -1));

        in = new int[]{0, 1, 1, 1, 2, 2, 3, 3, 5};
        assertEquals(4, minusPoints(in, 2));

        in = new int[]{-3, 1, 1, 1, 2, 2, 7};
        assertEquals(0, minusPoints(in, -4));

        in = new int[]{-3, -3, -2, -2, 1, 1, 1,};
        assertEquals(4, minusPoints(in, -1));
    }


}