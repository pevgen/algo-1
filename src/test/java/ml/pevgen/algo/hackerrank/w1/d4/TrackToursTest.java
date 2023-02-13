package ml.pevgen.algo.hackerrank.w1.d4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class TrackToursTest {

    private TrackTours trackTours;

    @BeforeEach
    void setUp() {
        trackTours = new TrackTours();
    }

    @Test
    void test_exaple_1() {

        Assertions.assertEquals(1,
                trackTours.truckTour(
                        List.of(
                                List.of(1, 5),
                                List.of(10, 3),
                                List.of(3, 4))));

    }

    @Test
    void test_example_2() {

        Assertions.assertEquals(2,
                trackTours.truckTour(
                        List.of(
                                List.of(2, 10),
                                List.of(3, 8),
                                List.of(6, 6),
                                List.of(4, 4),
                                List.of(15, 2))));

    }

    @Test
    void test_example_3() {

        Assertions.assertEquals(4,
                trackTours.truckTour(
                        List.of(
                                List.of(2, 10),
                                List.of(3, 8),
                                List.of(6, 6),
                                List.of(3, 4),
                                List.of(16, 2))));

    }

}