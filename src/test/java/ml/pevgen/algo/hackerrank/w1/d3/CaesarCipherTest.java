package ml.pevgen.algo.hackerrank.w1.d3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CaesarCipherTest {

    private CaesarCipher caesarCipher;

    @BeforeEach
    void setUp() {
        caesarCipher = new CaesarCipher();
    }

    @Test
    void should_encrypt_example() {
        assertEquals("b", caesarCipher.caesarCipher("z", 2));
        assertEquals("Eokffng-Qwvb", caesarCipher.caesarCipher("Cmiddle-Outz", 2));
    }

    @Test
    void should_encrypt_shift_26() {
        assertEquals("Ciphering.", caesarCipher.caesarCipher("Ciphering.", 26));
    }

    @Test
    void should_encrypt_shift_0() {
        assertEquals("Ciphering.", caesarCipher.caesarCipher("Ciphering.", 0));
    }

    @Test
    void should_encrypt_shift_more_than_26() {
        assertEquals("fff.jkl.gh.", caesarCipher.caesarCipher("www.abc.xy.", 87));
    }



}