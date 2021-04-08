package ml.pevgen.algo.algo1.structs.stack;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ResizeableArrayStackImpl<T> implements ResizeableStack<T>, Iterable<T> {

    public static final int INITIAL_SIZE = 16;

    private int itemsCount = 0;

    @SuppressWarnings("unchecked")
    private T[] array = (T[]) new Object[INITIAL_SIZE];


    @Override
    public int size() {
        return this.itemsCount;
    }

    @Override
    public T pop() {
        if (itemsCount == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        itemsCount--;

        T value = array[itemsCount];
        array[itemsCount] = null;
        return value;
    }

    @Override
    public void push(T item) {
        array[itemsCount++] = item;
        if (array.length == itemsCount) {
            resize(2 * array.length);
        }
    }

    @SuppressWarnings("unchecked")
    private void resize(int newLength) {
        T[] newArray = (T[]) new Object[newLength];
        if (array.length - 1 >= 0) {
            System.arraycopy(array, 0, newArray, 0, array.length - 1);
        }
        array = newArray;
    }

    @Override
    public Iterator<T> iterator() {
        return new FromHeadToTailIterator();
    }


    private class FromHeadToTailIterator implements Iterator<T> {

        private int iteratorIndex = 0;

        @Override
        public boolean hasNext() {
            return iteratorIndex < itemsCount;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return array[iteratorIndex++];
        }

    }
}
