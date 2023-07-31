package ml.pevgen.algo.leetcode.n2022;

/**
 * <a href="https://leetcode.com/problems/convert-1d-array-into-2d-array/description/">
 * https://leetcode.com/problems/convert-1d-array-into-2d-array/description/</a>
 */
public class Convert1DArrayInto2DArray {

    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[][]{};
        }

        int[][] result = new int[m][n];
        int row = 0;
        int col = 0;
        for (int elem : original) {
            if (col == n) {
                col = 0;
                row++;
            }
            result[row][col] = elem;
            col++;
        }
        return result;
    }
}
