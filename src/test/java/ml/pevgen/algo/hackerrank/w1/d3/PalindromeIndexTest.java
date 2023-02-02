package ml.pevgen.algo.hackerrank.w1.d3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeIndexTest {

    PalindromeIndex palindromeIndex;

    @BeforeEach
    void setUp() {
        palindromeIndex = new PalindromeIndex();
    }

    @Test
    void palindromeIndex() {
//        assertEquals(0,palindromeIndex.palindromeIndex("fcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcwf"));

        Assertions.assertEquals(0,palindromeIndex.palindromeIndex("hgygsvlfcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcwflvsgygh"));
        Assertions.assertEquals(0,palindromeIndex.palindromeIndex("bcbc"));
        Assertions.assertEquals(4,palindromeIndex.palindromeIndex("ababca"));
        Assertions.assertEquals(-1,palindromeIndex.palindromeIndex("aba"));

    }
}