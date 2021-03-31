package ml.pevgen.algo.algo1.twostackdijkstra;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DijkstraTwoStackSimplifiedImplementationTest {

    private DijkstraTwoStackSimplifiedImplementation impl;

    @BeforeEach
    void setUp() {
        impl = new DijkstraTwoStackSimplifiedImplementation();
    }

    @Test
    void should_return_result_of_plus() {
        assertEquals(9, impl.calculate("( 6 + ( 1 + 2 ) )"));
    }

    @Test
    void should_return_result_of_minus() {
        assertEquals(5, impl.calculate("( 6 - ( 2 - 1 ) )"));
    }

    @Test
    void should_return_result_of_multi() {
        assertEquals(24, impl.calculate("( 6 * ( 2 * 2 ) )"));
    }

    @Test
    void should_return_result_of_divide() {
        assertEquals(3, impl.calculate("( 6 : ( 4 : 2 ) )"));
    }

    @Test
    void should_return_result_of_complex_calc() {
        assertEquals(15, impl.calculate("( ( 6 * ( 4 : 2 ) ) + ( 9 : 3 ) )"));
    }

}