package ml.pevgen.algo.others;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfThreeTest {

    private PowerOfThree powerOfThree;

    @BeforeEach
    void setUp() {
        powerOfThree = new PowerOfThree();
    }

    @Test
    void isPowerOfThree_positiveTests() {
        // Test powers of 3
        assertTrue(powerOfThree.isPowerOfThree(1));    // 3^0
        assertTrue(powerOfThree.isPowerOfThree(3));    // 3^1
        assertTrue(powerOfThree.isPowerOfThree(9));    // 3^2
        assertTrue(powerOfThree.isPowerOfThree(27));   // 3^3
        assertTrue(powerOfThree.isPowerOfThree(81));   // 3^4
        assertTrue(powerOfThree.isPowerOfThree(243));  // 3^5
    }

    @Test
    void isPowerOfThree_negativeTests() {
        // Test non-powers of 3
        assertFalse(powerOfThree.isPowerOfThree(0));
        assertFalse(powerOfThree.isPowerOfThree(2));
        assertFalse(powerOfThree.isPowerOfThree(4));
        assertFalse(powerOfThree.isPowerOfThree(10));
        assertFalse(powerOfThree.isPowerOfThree(45));
    }

    @Test
    void isPowerOfThree_negativeNumbers() {
        // Negative numbers cannot be powers of 3
        assertFalse(powerOfThree.isPowerOfThree(-1));
        assertFalse(powerOfThree.isPowerOfThree(-3));
        assertFalse(powerOfThree.isPowerOfThree(-9));
    }


}