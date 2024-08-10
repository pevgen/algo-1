package ml.pevgen.algo.leetcode.n171;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExcelSheetColumnNumberTest {

    private ExcelSheetColumnNumber solution;

    @BeforeEach
    void setUp() {
        solution = new ExcelSheetColumnNumber();
    }

    @Test
    void should_return_column_number_example_1() {
        assertEquals(1, solution.titleToNumber("A"));
    }

    @Test
    void should_return_column_number_example_2() {
        assertEquals(28, solution.titleToNumber("AB"));
    }

    @Test
    void should_return_column_number_example_3() {
        assertEquals(701, solution.titleToNumber("ZY"));
    }

}