package ml.pevgen.algo.leetcode.n48;

/**
 * <a href="https://leetcode.com/problems/rotate-image/description/">
 * https://leetcode.com/problems/rotate-image/description/</a>
 */
public class RotateImage {

    public void rotate(int[][] matrix) {

        int middle = matrix.length / 2 + matrix.length % 2;
        for (int circle = 0; circle < middle; circle++) {

            for (int shift = circle; shift < matrix.length - circle - 1; shift++) {

                int r1 = shift;
                int c1 = circle;

                int r2 = matrix.length - circle - 1;
                int c2 = shift;

                int r3 = matrix.length - shift - 1;
                int c3 = matrix.length - circle - 1;

                int r4 = circle;
                int c4 = matrix.length - shift - 1;


                int temp = matrix[r1][c1];
                matrix[r1][c1] = matrix[r2][c2];
                matrix[r2][c2] = matrix[r3][c3];
                matrix[r3][c3] = matrix[r4][c4];
                matrix[r4][c4] = temp;
            }
        }
    }
}
