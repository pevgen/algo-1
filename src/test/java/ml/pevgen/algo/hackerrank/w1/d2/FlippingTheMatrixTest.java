package ml.pevgen.algo.hackerrank.w1.d2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlippingTheMatrixTest {

    private FlippingTheMatrix flippingTheMatrix;

    @BeforeEach
    void setUp() {
        flippingTheMatrix = new FlippingTheMatrix();
    }

    @Test
    void flippingMatrix() {

        assertEquals(4,
                flippingTheMatrix.flippingMatrix(
                        List.of(
                                List.of(1, 2),
                                List.of(3, 4))));
    }
}