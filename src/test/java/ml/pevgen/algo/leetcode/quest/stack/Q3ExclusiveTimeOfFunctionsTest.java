package ml.pevgen.algo.leetcode.quest.stack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Q3ExclusiveTimeOfFunctionsTest {

    private final Q3ExclusiveTimeOfFunctions solution = new Q3ExclusiveTimeOfFunctions();

    @Test
    void exclusiveTime() {
        assertArrayEquals(new int[]{16}, solution.exclusiveTime(1, List.of("0:start:0", "0:end:15")));
        assertArrayEquals(new int[]{3, 4}, solution.exclusiveTime(2, List.of("0:start:0", "1:start:2", "1:end:5", "0:end:6")));
        assertArrayEquals(new int[]{8}, solution.exclusiveTime(1, List.of("0:start:0", "0:start:2", "0:end:5", "0:start:6", "0:end:6", "0:end:7")));
        assertArrayEquals(new int[]{7, 1}, solution.exclusiveTime(2, List.of("0:start:0", "0:start:2", "0:end:5", "1:start:6", "1:end:6", "0:end:7")));
        assertArrayEquals(new int[]{8, 1}, solution.exclusiveTime(2, List.of("0:start:0","0:start:2","0:end:5","1:start:7","1:end:7","0:end:8")));



    }
}