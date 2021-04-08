package ml.pevgen.algo.algo1.structs.stack;

public interface ResizeableStack<T> {

    int size();

    void push(T item);

    T pop();

}
