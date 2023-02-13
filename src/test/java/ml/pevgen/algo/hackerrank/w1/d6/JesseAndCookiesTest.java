package ml.pevgen.algo.hackerrank.w1.d6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JesseAndCookiesTest {

    private JesseAndCookies jesseAndCookies;

    @BeforeEach
    void setUp() {
        jesseAndCookies = new JesseAndCookies();
    }

    @Test
    void test_example_1() {
        assertEquals(1, jesseAndCookies.cookies(1, List.of(1, 2, 3)));
    }

    @Test
    void test_example_2() {
        assertEquals(4, jesseAndCookies.cookies(9, List.of(2, 7, 3, 6, 4, 6)));
    }

}