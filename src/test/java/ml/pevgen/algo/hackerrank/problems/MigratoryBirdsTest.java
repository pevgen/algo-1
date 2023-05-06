package ml.pevgen.algo.hackerrank.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class MigratoryBirdsTest {

    private MigratoryBirds migratoryBirds;

    @BeforeEach
    void setUp() {
        migratoryBirds = new MigratoryBirds();
    }

    @Test
    void should_return_min_most_frequently_id() {
        Assertions.assertEquals(4, migratoryBirds.migratoryBirds(List.of(1, 4, 4, 4, 5, 5)));
    }
}