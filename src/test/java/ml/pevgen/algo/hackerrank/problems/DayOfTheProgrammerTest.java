package ml.pevgen.algo.hackerrank.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayOfTheProgrammerTest {

    private DayOfTheProgrammer dayOfTheProgrammer = new DayOfTheProgrammer();

    @BeforeEach
    void setUp() {
        dayOfTheProgrammer = new DayOfTheProgrammer();
    }

    @Test
    void should_return_correct_year() {
        assertEquals("12.09.1984", dayOfTheProgrammer.dayOfProgrammer(1984));
        assertEquals("13.09.2017", dayOfTheProgrammer.dayOfProgrammer(2017));
        assertEquals("12.09.1800", dayOfTheProgrammer.dayOfProgrammer(1800));
        assertEquals("26.09.1918", dayOfTheProgrammer.dayOfProgrammer(1918));


    }
}