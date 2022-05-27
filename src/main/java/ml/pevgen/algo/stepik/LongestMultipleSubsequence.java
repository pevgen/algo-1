package ml.pevgen.algo.stepik;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * наибольшая последовательнократная подпоследовательность
 *
 * <a href="https://stepik.org/lesson/13257/step/5?unit=3442">https://stepik.org/lesson/13257/step/5?unit=3442</a>
 */
public class LongestMultipleSubsequence {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int arraySize = s.nextInt();
        int[] input = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            input[i] = s.nextInt();
        }
        out.println(calcSequenceCount(input));
    }

    private static int calcSequenceCount(int[] input) {
        Integer[] distance = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            calcSequenceCount(input, distance, i);
        }
        List<Integer> lst = Arrays.asList(distance);
        return Collections.max(lst);
    }


    private static void calcSequenceCount(int[] input, Integer[] distance, int index) {
        if (index == 0) {
            distance[index] = 1;
        } else {
            int k = -1;
            int l = -1;
            for (int i = 0; i < index; i++) {
                if ((input[index] % input[i] == 0) && (distance[i] > k)) {
                    k = distance[i];
                    l = i;
                }
            }
            if (l >= 0) {
                distance[index] = distance[l] + 1;
            } else {
                distance[index] = 1;
            }
        }
    }

}
