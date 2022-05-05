package ml.pevgen.algo.book.ch1;

import java.util.Arrays;

import static java.lang.System.out;

public class Point17 {

    static final int MATRIX_SIZE = 6;

    public static void main(String[] args) {
        int[][] matrix = new int[MATRIX_SIZE][MATRIX_SIZE];
        int value = 1;
        for (int i = 0; i < MATRIX_SIZE; i++) {
            for (int j = 0; j < MATRIX_SIZE; j++) {
                matrix[i][j] = value++;
            }
        }

        var result = matrixRotation90Degrees(matrix);

        out.println("\n\n Result : ");
        printTwoDimensionalArray(result);
    }

    private static void printTwoDimensionalArray(int[][] result) {
        out.println(" --- ");
        for (int i = 0; i < MATRIX_SIZE; i++) {
            out.println(Arrays.toString(result[i]));
        }
    }

    private static int[][] matrixRotation90Degrees(int[][] matrix) {
        for (int layer = 0; layer < MATRIX_SIZE / 2; layer++) {
            int firstIndex = layer;
            int lastIndex = MATRIX_SIZE - firstIndex - 1;

            out.println("firstIndex = " + firstIndex + "; lastIndex = " + lastIndex);

            // for each element in a row
            for (int index = firstIndex; index < lastIndex; index++) {

                int offset = index - firstIndex;

                int firstElement = matrix[firstIndex][offset];

                // left to top
                matrix[firstIndex][offset] = matrix[lastIndex - (offset - firstIndex)][firstIndex];

                // bottom to left
                matrix[lastIndex - (offset - firstIndex)][firstIndex] = matrix[lastIndex][lastIndex - (offset - firstIndex)];

                // right to bottom
                matrix[lastIndex][lastIndex - (offset - firstIndex)] = matrix[offset][lastIndex];

                // top to right
                matrix[offset][lastIndex] = firstElement;
            }

            printTwoDimensionalArray(matrix);


        }


        return matrix;
    }

}
