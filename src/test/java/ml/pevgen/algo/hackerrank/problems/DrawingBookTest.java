package ml.pevgen.algo.hackerrank.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DrawingBookTest {

    private DrawingBook drawingBook;

    @BeforeEach
    void setUp() {
        drawingBook = new DrawingBook();
    }

    @Test
    void should_return_page_count() {
        assertEquals(1, drawingBook.pageCount(5, 2));
        assertEquals(0, drawingBook.pageCount(5, 4));
        assertEquals(0, drawingBook.pageCount(5, 5));
        assertEquals(0, drawingBook.pageCount(5, 1));
        assertEquals(1, drawingBook.pageCount(6, 2));
        assertEquals(1, drawingBook.pageCount(6, 5));
        assertEquals(1, drawingBook.pageCount(6, 4));
        assertEquals(0, drawingBook.pageCount(4, 4));
    }
}