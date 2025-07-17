package ml.pevgen.algo.others;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindSmallestLetterGreaterThanTargetTest {

    private FindSmallestLetterGreaterThanTarget solution;

    @BeforeEach
    void setUp() {
        solution = new FindSmallestLetterGreaterThanTarget();
    }

    @Test
    void should_return_the_first_letter() {
        assertEquals('c', solution.nextGreatestLetter(new char[]{'c', 'd'}, 'a'));
        assertEquals('c', solution.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a'));
        assertEquals('c', solution.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'j'));
    }

    @Test
    void should_return_the_first_letter_greater_than_that_if_has_target() {
        assertEquals('e', solution.nextGreatestLetter(new char[]{'c', 'e', 'f'}, 'c'));
        assertEquals('f', solution.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c'));
        assertEquals('x', solution.nextGreatestLetter(new char[]{'x', 'x', 'y', 'y'}, 'z'));
        assertEquals('e', solution.nextGreatestLetter(new char[]{'e', 'e', 'g', 'g'}, 'g'));
        assertEquals('g', solution.nextGreatestLetter(new char[]{'e', 'e', 'g', 'g'}, 'e'));
    }

    @Test
    void should_return_the_first_letter_greater_than_that_if_has_not_target() {
        assertEquals('j', solution.nextGreatestLetter(new char[]{'c', 'd', 'e', 'j', 'k', 'l'}, 'f'));
        assertEquals('e', solution.nextGreatestLetter(new char[]{'c', 'e', 'f'}, 'd'));
    }
}