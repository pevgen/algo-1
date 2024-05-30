package ml.pevgen.algo.leetcode.n73;

/**
 * <a href="https://leetcode.com/problems/set-matrix-zeroes/description/">
 * https://leetcode.com/problems/set-matrix-zeroes/description/</a>
 */
public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;

        boolean needOrow = false;
        boolean needOcol = false;
        for (int i = 0; i < colSize; i++) {
            if (matrix[0][i] == 0) {
                needOrow = true;
                break;
            }
        }
        for (int[] ints : matrix) {
            if (ints[0] == 0) {
                needOcol = true;
                break;
            }
        }

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {

                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < colSize; i++) {
            if (matrix[0][i] == 0) {
                for (int j = 1; j < rowSize; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        for (int i = 1; i < rowSize; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < colSize; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (needOrow) {
            for (int i = 1; i < colSize; i++) {
                matrix[0][i] = 0;
            }
        }

        if (needOcol) {
            for (int i = 1; i < rowSize; i++) {
                matrix[i][0] = 0;
            }
        }

    }
}
