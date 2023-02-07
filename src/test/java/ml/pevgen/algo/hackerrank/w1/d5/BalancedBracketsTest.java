package ml.pevgen.algo.hackerrank.w1.d5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BalancedBracketsTest {

    private BalancedBrackets balancedBrackets;

    @BeforeEach
    void setUp() {
        balancedBrackets = new BalancedBrackets();
    }

    @Test
    void isBalanced() {
        assertEquals("NO", balancedBrackets.isBalanced("{{[]"));
        assertEquals("NO", balancedBrackets.isBalanced("])[])[]}"));
        assertEquals("YES", balancedBrackets.isBalanced("{(([])[])[]}"));
        assertEquals("NO", balancedBrackets.isBalanced("{{)[](}}"));
        assertEquals("NO", balancedBrackets.isBalanced(null));
        assertEquals("NO", balancedBrackets.isBalanced(""));
        assertEquals("NO", balancedBrackets.isBalanced("("));
        assertEquals("YES", balancedBrackets.isBalanced("{[()]}"));
        assertEquals("NO", balancedBrackets.isBalanced("{[(])}"));
        assertEquals("YES", balancedBrackets.isBalanced("{{[[(())]]}}"));
    }

}