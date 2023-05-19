package ml.pevgen.algo.hackerrank.problems;

/**
 * <a href="https://www.hackerrank.com/challenges/drawing-book/problem">
 * https://www.hackerrank.com/challenges/drawing-book/problem</a>
 */
public class DrawingBook {

    public int pageCount(int numberOfPages, int desiredPageNumber) {
        if (desiredPageNumber == 1 || numberOfPages == desiredPageNumber) {
            return 0;
        }
        int leftFlip = desiredPageNumber / 2;
        int rightFlip = (numberOfPages - desiredPageNumber) / 2;

        if (numberOfPages % 2 == 0  && desiredPageNumber % 2 != 0) {
           rightFlip++;
        }
        return Math.min(leftFlip, rightFlip);
    }

}
