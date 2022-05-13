package ml.pevgen.algo.stepik;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * <a href="https://stepik.org/lesson/13246/step/4?unit=3431">https://stepik.org/lesson/13246/step/4?unit=3431</a>
 *
 * 5 1 5 8 12 13
 * 5 8 1 23 1 11
 *
 * result
 * 3 1 -1 1 -1
 */
public class SimpleBinarySearch {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int numberSize = s.nextInt();
        int[] numbers = new int[numberSize];
        for (int i = 0; i < numberSize; i++) {
            numbers[i] = s.nextInt();
        }

        int checkNumberSize = s.nextInt();
        int[] checkNumbers = new int[checkNumberSize];
        for (int i = 0; i < checkNumberSize; i++) {
            checkNumbers[i] = s.nextInt();
        }

//        int[] numbers = new int[]{1, 5, 8, 12, 13};
//        int[] checkNumbers = new int[]{8, 1, 23, 1, 11};

        out.println(findAndPrint(numbers, checkNumbers));

    }

    private static String findAndPrint(int[] nums, int[] checkNumbers) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int checkNumber : checkNumbers) {
            int index = findAndPrint(checkNumber, nums, 0, nums.length - 1);
            if (index >= 0) {
                stringBuilder.append(++index).append(" ");  // ++ - need index from 1 (array index starts from 0)
            } else {
                stringBuilder.append("-1 ");
            }

        }
        return stringBuilder.toString();
    }

    private static int findAndPrint(int checkNumber, int[] nums, int leftIndex, int rightIndex) {
        int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;
        if (rightIndex == (leftIndex + 1)) {
            if (nums[leftIndex] == checkNumber) {
                return leftIndex;
            }
            if (nums[rightIndex] == checkNumber) {
                return rightIndex;
            }
            return -1;
        }

        if (nums[middleIndex] > checkNumber) {
            return findAndPrint(checkNumber, nums, leftIndex, middleIndex);
        } else if (nums[middleIndex] < checkNumber) {
            return findAndPrint(checkNumber, nums, middleIndex, rightIndex);
        }

        return middleIndex;
    }

}
