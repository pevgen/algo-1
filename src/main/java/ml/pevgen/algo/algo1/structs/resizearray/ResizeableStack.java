package ml.pevgen.algo.algo1.structs.resizearray;

public interface ResizeableStack<T> {

    int size();

    void push(T item);

    T pop();

}
