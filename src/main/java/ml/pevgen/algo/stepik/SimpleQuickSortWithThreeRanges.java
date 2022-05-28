package ml.pevgen.algo.stepik;

import java.util.Arrays;

import static java.lang.System.out;

/**
 * Quick sort - трёхчастное разделение
 * Алгоритм Дейкстры
 * <a href="https://www.youtube.com/watch?v=Bp35SUE6MDU">https://www.youtube.com/watch?v=Bp35SUE6MDU</a>
 */
public class SimpleQuickSortWithThreeRanges {
    public static void main(String[] args) {
//        int[] numbers = {4, 6, 2, 9, 0, 12, 6, 9, 3, 9};
        int[] numbers = {4, 7, 3, 5, 2, 4, 6, 4, 3, 2, 1};
//        int[] numbers = {4, 2, 4, 7, 4};
//        int[] numbers = {4, 2, 4};
//        int[] numbers = {0, 5, -2, 0, 3};
//        int[] numbers = {4, 6, 2 , 9, 0, 12};
        out.println(Arrays.toString(myQuickSort(numbers, 0, numbers.length - 1))); // [0, 2, 3, 4, 6, 9, 12]
    }

    private static int[] myQuickSort(int[] numbers, int start, int end) {
        if (start >= end) {
            return numbers;
        }
        Range divIndex = partition(numbers, start, end);
        out.println(divIndex);
        myQuickSort(numbers, start, divIndex.lowRange -1);
        myQuickSort(numbers, divIndex.upperRange + 1, end);
        return numbers;
    }

    private static Range partition(int[] numbers, int start, int end) {
        int left = start;
        int right = end;
        int i = start + 1;
        int supportElement = numbers[start];
        while (i <= right) {
            if (numbers[i] < supportElement) {
                swap(numbers, i, left);
                left++;
                i++;
            } else if (numbers[i] > supportElement) {
                swap(numbers, i, right);
                right--;
            } else if (numbers[i] == supportElement) {
                i++;
            }
        }
        return new Range(left, right);
    }

    private static void swap(int[] numbers, int k, int i) {
        int temp = numbers[i];
        numbers[i] = numbers[k];
        numbers[k] = temp;
    }

    private static class Range {
        int lowRange;
        int upperRange;

        public Range(int lowRange, int upperRange) {
            this.lowRange = lowRange;
            this.upperRange = upperRange;
        }

        @Override
        public String toString() {
            return "Range{" +
                    "lowRange=" + lowRange +
                    ", upperRange=" + upperRange +
                    '}';
        }
    }

}
