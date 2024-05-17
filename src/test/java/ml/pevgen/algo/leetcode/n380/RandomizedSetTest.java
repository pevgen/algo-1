package ml.pevgen.algo.leetcode.n380;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomizedSetTest {

    private RandomizedSet solution;

    @BeforeEach
    void setUp() {
        solution = new RandomizedSet();
    }

    @Test
    void should_get_random_after_consequence_of_actions_example_1() {
        assertTrue(solution.insert(1)); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
        assertFalse(solution.remove(2)); // Returns false as 2 does not exist in the set.
        assertTrue(solution.insert(2)); // Inserts 2 to the set, returns true. Set now contains [1,2].
        solution.getRandom(); // getRandom() should return either 1 or 2 randomly.
        assertTrue(solution.remove(1)); // Removes 1 from the set, returns true. Set now contains [2].
        assertFalse(solution.insert(2)); // 2 was already in the set, so return false.
        assertEquals(2, solution.getRandom()); // Since 2 is the only number in the set, getRandom() will always return 2.
    }

    @Test
    void should_get_random_after_consequence_of_actions_example_2() {
//        "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"
//                [[],[1],[2],[2],[],[1],[2],[]]

        assertTrue(solution.insert(1)); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
        assertFalse(solution.remove(2)); // Returns false as 2 does not exist in the set.
        assertTrue(solution.insert(2)); // Inserts 2 to the set, returns true. Set now contains [1,2].
        solution.getRandom(); // Since 2 is the only number in the set, getRandom() will always return 2.
        assertTrue(solution.remove(1)); // Removes 1 from the set, returns true. Set now contains [2].
        assertFalse(solution.insert(2)); // 2 was already in the set, so return false.
        assertEquals(2, solution.getRandom()); // Since 2 is the only number in the set, getRandom() will always return 2.
    }
}