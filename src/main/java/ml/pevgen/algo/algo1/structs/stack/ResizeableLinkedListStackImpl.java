package ml.pevgen.algo.algo1.structs.stack;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class ResizeableLinkedListStackImpl<T> implements ResizeableStack<T>, Iterable<T>  {

    private int itemsCount = 0;
    private Node<T> first;

    @Override
    public int size() {
        return itemsCount;
    }

    @Override
    public void push(T item) {
        itemsCount++;
        Node<T> oldFirst = first;
        first = new Node<>(item, oldFirst);
    }

    @Override
    public T pop() {
        if (first == null) {
            throw new ArrayIndexOutOfBoundsException();
        }
        T currentFirstValue = first.item;
        first = first.next;
        itemsCount--;
        return currentFirstValue;
    }

    @Override
    public Iterator<T> iterator() {
        return new FromTailToHeadIterator();
    }

    /**
     * Iterate as a stack (LIFO)
     */
    private class FromTailToHeadIterator implements Iterator<T> {

        private Node<T> currentNode = first;

        @Override
        public boolean hasNext() {
            return Objects.nonNull(currentNode);
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T currentItem = currentNode.item;
            currentNode = currentNode.next;
            return currentItem;
        }

    }


    private static class Node<T> {

        Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }

        T item;
        Node<T> next;
    }

}
