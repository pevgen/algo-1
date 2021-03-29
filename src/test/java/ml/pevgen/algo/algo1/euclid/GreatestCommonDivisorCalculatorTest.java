package ml.pevgen.algo.algo1.euclid;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GreatestCommonDivisorCalculatorTest {

    private GreatestCommonDivisorCalculator calc;

    @BeforeEach
    void setUp() {
        calc = new GreatestCommonDivisorCalculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void should_find_greatest_common_divisor() {
        assertEquals(5, calc.calculate(15, 10));
        assertEquals(1, calc.calculate(17, 1));
    }

    @Test
    void should_throw_exception_if_the_first_parameter_less_than_the_second() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.calculate(1, 2));
        assertEquals("The first parameter should be greater than the second parameter", exception.getMessage());

    }

    @Test
    void should_throw_exception_if_the_second_parameter_is_0() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.calculate(123, 0));
        assertEquals("The divisor must not be less or equal to 0", exception.getMessage());

    }

    @Test
    void should_throw_exception_if_the_second_parameter_less_than_0() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.calculate(123, -1));
        assertEquals("The divisor must not be less or equal to 0", exception.getMessage());

    }

}