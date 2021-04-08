package ml.pevgen.algo.algo1.structs.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class ResizeableLinkedListStackImplTest {
    private ResizeableLinkedListStackImpl<String> linkedListStack;

    @BeforeEach
    public void setUp() {
        linkedListStack = new ResizeableLinkedListStackImpl<>();
    }

    @Test()
    void should_throw_exception_if_no_items() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> linkedListStack.pop());
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> linkedListStack.pop());
        assertEquals(0, linkedListStack.size());
    }

    @Test
    void should_push_and_pop() {
        linkedListStack.push("item 1");
        assertEquals(1, linkedListStack.size());
        linkedListStack.push("item 2");
        assertEquals(2, linkedListStack.size());
        assertEquals("item 2", linkedListStack.pop());
        assertEquals(1, linkedListStack.size());
    }

    @Test
    void should_push_many_items() {
        var bigSize = 100;
        for (int i = 0; i < bigSize; i++) {
            linkedListStack.push("item " + i);
        }
        assertEquals(bigSize, linkedListStack.size());
        assertEquals("item " + (bigSize - 1), linkedListStack.pop());
    }

    @Test
    void should_iterate_as_stack_lifo() {
        linkedListStack.push("item 1");
        linkedListStack.push("item 2");
        linkedListStack.push("item 3");
        Iterator<String> iterator = linkedListStack.iterator();
        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
        assertEquals("item 3", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("item 2", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("item 1", iterator.next());
        assertFalse(iterator.hasNext());
    }
}