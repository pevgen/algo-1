package ml.pevgen.algo.hackerrank.w1.d2;

import java.util.List;

import static java.lang.Math.max;

/**
 * Good explanation with a picture :
 * <a href="https://www.blogoncode.com/2022/08/flipping-matrix-solution-in-java.html">
 * https://www.blogoncode.com/2022/08/flipping-matrix-solution-in-java.html</a>
 * My schema/drawing: <a href="https://disk.yandex.ru/i/QnJV3BxlIaqWFA">https://disk.yandex.ru/i/QnJV3BxlIaqWFA</a>
 */
public class FlippingTheMatrix {


    public int flippingMatrix(List<List<Integer>> matrix) {
        int matrixSize = matrix.size();
        int optimalMatrixSize = matrix.size() / 2;
        int sum = 0;
        for (int i = 0; i < optimalMatrixSize; i++) {
            for (int j = 0; j < optimalMatrixSize; j++) {
                Integer current = matrix.get(i).get(j);
                Integer variant2 = matrix.get(i).get(matrixSize - j - 1);
                Integer variant3 = matrix.get(matrixSize - i - 1).get(j);
                Integer variant4 = matrix.get(matrixSize - i - 1).get(matrixSize - j - 1);
                sum = sum + max(current, max(variant2, max(variant3, variant4)));
            }
        }
        return sum;
    }

}
