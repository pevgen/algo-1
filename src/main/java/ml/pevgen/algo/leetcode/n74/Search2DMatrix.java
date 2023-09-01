package ml.pevgen.algo.leetcode.n74;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/search-a-2d-matrix/">
 * https://leetcode.com/problems/search-a-2d-matrix/</a>
 */
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        // binary search in 0-th column
        int start = 0;
        int end = matrix.length - 1;
        while (start <= end) {

            int middle = start + (end - start) / 2;
            if (matrix[middle][0] == target) {
                return true;
            }

            if (matrix[middle][0] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }

        }
        int rowIndex = start - 1;

        if (rowIndex < 0) {
            return false;
        }

        // binary search in rowIndex row
        int colIndex = Arrays.binarySearch(matrix[rowIndex], target);
        return colIndex >= 0;
    }
}
