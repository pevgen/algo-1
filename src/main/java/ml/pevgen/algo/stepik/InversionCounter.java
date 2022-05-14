package ml.pevgen.algo.stepik;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

/**
 *
 *<a href="https://stepik.org/lesson/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0-%D1%81%D0%BB%D0%B8%D1%8F%D0%BD%D0%B8%D0%B5%D0%BC-13248/step/5">Задача на программирование: число инверсий</a>
 *
 * examples
 * 5
 * 2 3 9 2 9
 * result = 2  (2-9, 2-3)
 *
 * 7
 * 7 6 5 4 3 2 1
 * result = 21
 *
 * 5
 * 1 2 3 5 4
 * result = 1
 */
public class InversionCounter {

    private static long resultCounter = 0;

    public static void main(String[] args) {

        Scanner s = new Scanner(in);
        int numberSize = s.nextInt();
        int[] numbers = new int[numberSize];
        for (int i = 0; i < numberSize; i++) {
            numbers[i] = s.nextInt();
        }

//        int[] numbers = new int[]{2, 3, 9, 2, 9};

        mergeSort(numbers);
        out.println(resultCounter);
    }

    private static int[] mergeSort(int[] array) {
        if (array.length == 1) {
            return array;
        }
        int middleIndex = array.length / 2;

        var leftArray = Arrays.copyOfRange(array, 0, middleIndex);
        var rightArray = Arrays.copyOfRange(array, middleIndex, array.length);

        return merge(mergeSort(leftArray), mergeSort(rightArray));

    }

    private static int[] merge(int[] leftPart, int[] rightPart) {
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        int[] result = new int[leftPart.length + rightPart.length];

        while (leftIndex < leftPart.length && rightIndex < rightPart.length) {
            if ((leftPart[leftIndex] <= rightPart[rightIndex])) {
                result[resultIndex] = leftPart[leftIndex];
                leftIndex++;
            } else {
                result[resultIndex] = rightPart[rightIndex];
                rightIndex++;
                resultCounter++;
                // и все остальные элементы в левом массиве образуют инверсию с данным элементом правого
                // т.к. элементы в левом отсортированы
                // пример [3,4,6] и [2,7,8] ->
                //   1. сравниваем 3 и 2 - +1 инверсия
                //   2. соответственно, т.к. левый массив отсоритрован по возрастанию,
                //      то и все остальные его элементы (4,6) дают дополительно +2 инверсии
                resultCounter += leftPart.length - (leftIndex + 1);
            }
            resultIndex++;
        }

        if (leftIndex >= leftPart.length) {
            for (int i = rightIndex; i < rightPart.length; i++) {
                result[resultIndex] = rightPart[i];
                resultIndex++;
            }
        }

        if (rightIndex >= rightPart.length) {
            for (int i = leftIndex; i < leftPart.length; i++) {
                result[resultIndex] = leftPart[i];
                resultIndex++;
            }
        }

        return result;
    }

}
