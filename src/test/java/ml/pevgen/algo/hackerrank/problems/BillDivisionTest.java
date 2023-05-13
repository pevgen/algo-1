package ml.pevgen.algo.hackerrank.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BillDivisionTest {


    private BillDivision billDivision;

    @BeforeEach
    void setUp() {
        billDivision = new BillDivision();
    }

    @Test
    void should_return_bon_appetit_if_calculation_correct() {
        assertEquals("Bon Appetit", billDivision.bonAppetit(List.of(3, 10, 2, 9), 1, 7));
    }

    @Test
    void should_return_number_if_calculation_incorrect() {
        assertEquals("5", billDivision.bonAppetit(List.of(3, 10, 2, 9), 1, 12));
    }

}