package ml.pevgen.algo.algoslerm.simplehashset;

import org.junit.Test;

import static org.junit.Assert.*;


public class RangeHashSetTest {

    @Test
    public void should_return_zero_sizes() {
        RangeHashSet set = new RangeHashSet();
        assertEquals(0, set.getSize());
    }

    @Test(expected = NullPointerException.class)
    public void should_throw_for_null_key() {
        RangeHashSet set = new RangeHashSet();
        set.put(null);
    }

    @Test
    public void should_return_real_sizes_after_put() {
        RangeHashSet set = new RangeHashSet();
        set.put(1);
        set.put(1_001);
        assertEquals(2, set.getSize());
    }

    @Test
    public void should_return_real_sizes_after_put_and_remove() {
        RangeHashSet set = new RangeHashSet();
        set.put(1);
        set.put(1_002);
        set.put(27);
        assertEquals(3, set.getSize());
        set.remove(1_002);
        assertEquals(2, set.getSize());
    }


    @Test
    public void should_return_real_sizes_after_put_and_remove_the_same_hash() {
        RangeHashSet set = new RangeHashSet();
        set.put(1);
        set.put(1_001);
        set.put(13);
        assertEquals(3, set.getSize());
    }

    @Test
    public void should_check_contains() {
        RangeHashSet set = new RangeHashSet();
        set.put(1);
        set.put(1_001);
        set.put(17);
        assertEquals(3, set.getSize());
        assertTrue(set.contains(1));
        assertTrue(set.contains(1_001));
        assertTrue(set.contains(17));
        assertFalse(set.contains(2));
    }


}