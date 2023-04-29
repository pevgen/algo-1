package ml.pevgen.algo.hackerrank.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubarrayDivisionTest {

    private SubarrayDivision subarrayDivision;

    @BeforeEach
    public void init() {
        subarrayDivision = new SubarrayDivision();
    }

    @Test
    void should_find_correct_way_numbers() {
        assertEquals(2, subarrayDivision.birthday(List.of(1, 2, 1, 3, 2), 3, 2));
        assertEquals(0, subarrayDivision.birthday(List.of(1, 1, 1, 1, 1, 1), 3, 2));
        assertEquals(1, subarrayDivision.birthday(List.of(4, 1), 4, 1));
    }
}