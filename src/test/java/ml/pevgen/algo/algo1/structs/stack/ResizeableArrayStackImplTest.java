package ml.pevgen.algo.algo1.structs.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static ml.pevgen.algo.algo1.structs.stack.ResizeableArrayStackImpl.INITIAL_SIZE;
import static org.junit.jupiter.api.Assertions.*;

class ResizeableArrayStackImplTest {

    private ResizeableArrayStackImpl<String> resizeableStack;

    @BeforeEach
    public void setUp() {
        resizeableStack = new ResizeableArrayStackImpl<>();
    }

    @Test()
    void should_throw_exception_if_no_items() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> resizeableStack.pop());
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> resizeableStack.pop());
        assertEquals(0, resizeableStack.size());
    }

    @Test
    void should_push_and_pop() {
        resizeableStack.push("item 1");
        assertEquals(1, resizeableStack.size());
        resizeableStack.push("item 2");
        assertEquals(2, resizeableStack.size());
        assertEquals("item 2", resizeableStack.pop());
        assertEquals(1, resizeableStack.size());
    }

    @Test
    void should_push_more_than_limit() {
        var bigSize = INITIAL_SIZE + 100;
        for (int i = 0; i < bigSize; i++) {
            resizeableStack.push("item " + i);
        }
        assertEquals(bigSize, resizeableStack.size());
        assertEquals("item " + (bigSize - 1), resizeableStack.pop());
    }

    @Test
    void should_iterate_from_head_to_tail() {
        resizeableStack.push("item 1");
        resizeableStack.push("item 2");
        resizeableStack.push("item 3");
        Iterator<String> iterator = resizeableStack.iterator();
        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
        assertEquals("item 1", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("item 2", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("item 3", iterator.next());
        assertFalse(iterator.hasNext());
    }
}