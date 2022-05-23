package ml.pevgen.algo.stepik;

import java.util.Scanner;

/**
 * Counting sort (сортировка подсчётом)
 *
 * <a href="https://stepik.org/lesson/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B8-%D0%BE%D1%81%D0%BD%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B5-%D0%BD%D0%B5-%D0%BD%D0%B0-%D1%81%D1%80%D0%B0%D0%B2%D0%BD%D0%B5%D0%BD%D0%B8%D1%8F%D1%85-13252/step/3">https://stepik.org/lesson/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B8-%D0%BE%D1%81%D0%BD%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B5-%D0%BD%D0%B5-%D0%BD%D0%B0-%D1%81%D1%80%D0%B0%D0%B2%D0%BD%D0%B5%D0%BD%D0%B8%D1%8F%D1%85-13252/step/3</a>
 *
 */
public class CountingSort {

    private static final int MAX_RANGE = 10;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int numberSize = s.nextInt();
        int[] numbers = new int[numberSize];
        for (int i = 0; i < numberSize; i++) {
            numbers[i] = s.nextInt();
        }

        int[] resultArray = new int[MAX_RANGE + 1];
        for (int number : numbers) {
            resultArray[number]++;
        }

        for (int i = 0; i < resultArray.length; i++) {
            int num = resultArray[i];
            if (num > 0) {
                for (int j = 1; j <= num; j++) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
