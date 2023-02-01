package ml.pevgen.algo.hackerrank.w1.d2;

import java.util.List;

public class DiagonalDifference {

    public int diagonalDifference(List<List<Integer>> arr) {
        int matrixSize = arr.size();
        int diagonalSum1 = 0;
        int diagonalSum2 = 0;
        for (int i = 0; i < matrixSize; i++) {
            diagonalSum1 = diagonalSum1 + arr.get(i).get(i);
            diagonalSum2 = diagonalSum2 + arr.get(i).get(matrixSize - i - 1);
        }
        return Math.abs(diagonalSum1 - diagonalSum2);
    }
}
