package ml.pevgen.algo.stepik;

import java.util.Arrays;

import static java.lang.System.out;

public class SimpleQuickSort {
    public static void main(String[] args) {
        int[] numbers = {4, 6, 2, 9, 0, 12, 3};
        out.println(Arrays.toString(myQuickSort(numbers, 0, numbers.length - 1))); // [0, 2, 3, 4, 6, 9, 12]
    }

    private static int[] myQuickSort(int[] numbers, int start, int end) {
        if (start >= end) {
            return numbers;
        }
        int divIndex = partition(numbers, start, end);
        myQuickSort(numbers, start, divIndex);
        myQuickSort(numbers, divIndex + 1, end);
        return numbers;
    }

    private static int partition(int[] numbers, int start, int end) {
        int j = start;
        for (int i = start + 1; i <= end; i++) {
            if (numbers[i] <= numbers[start]) {
                j++;
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
        int temp = numbers[start];
        numbers[start] = numbers[j];
        numbers[j] = temp;
        return j;
    }

}
