package ml.pevgen.algo.hackerrank.w1.d6;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTextEditorTest {

    private SimpleTextEditor editor;

    @BeforeEach
    void setUp() {
        editor = new SimpleTextEditor();
    }



    @Test
    void should_run_all_no_undo() {
//0       abcde   1 fg        append fg
//1       abcdefg 3 6         print the 6th letter - f
//2       abcdefg 2 5         delete the last 5 letters
//1       abcdefg 3 6         print the 6th letter - f

        editor.append("abcde");
        assertEquals("a", editor.print(1));
        assertEquals("e", editor.print(5));

        editor.append("fg");
        assertEquals("f", editor.print(6));
        editor.delete(5);
        assertEquals("b", editor.print(editor.length()));
    }

    @Test
    void should_run_all_with_undo_delete() {
        editor.append("abcdefg");
        editor.delete(5);
        assertEquals("b", editor.print(editor.length()));
        editor.undo();
        assertEquals("g", editor.print(editor.length()));
    }

    @Test
    void should_run_all_with_undo_append() {
        editor.append("ab");
        assertEquals("b", editor.print(editor.length()));
        editor.append("cdefg");
        assertEquals("g", editor.print(editor.length()));
        editor.undo();
        assertEquals("b", editor.print(editor.length()));
    }

    @Test
    void should_do_two_undo() {
//     * 8       Q = 8
//     * 1 abc   ops[0] = '1 abc'
//     * 3 3     ops[1] = '3 3'
//     * 2 3     ...
//     * 1 xy
//     * 3 2
//     * 4
//     * 4
//     * 3 1

        editor.append("abc");
        assertEquals("c", editor.print(3));
        editor.delete(3);
        editor.append("xy");
        assertEquals("y", editor.print(2));
        editor.undo();
        editor.undo();
        assertEquals("a", editor.print(1));

    }

}