package ml.pevgen.algo.others;

import java.util.Arrays;

public class EvenNumberSimpleMergeSort {

    public int[] sort(int[] array) {

        if (array.length == 1) {
            return array;
        }
        int mid = array.length / 2;
        int[] ar1 = Arrays.copyOfRange(array, 0, mid);
        int[] ar2 = Arrays.copyOfRange(array, mid, array.length);
        return merge(sort(ar1), sort(ar2));
    }

    int[] merge(int[] ar1, int[] ar2) {
        int[] result = new int[ar1.length + ar2.length];
        int resultIndex = 0;
        int a1Index = 0;
        int a2Index = 0;
        while (a1Index < ar1.length && a2Index < ar2.length) {

            if (ar2[a2Index] > ar1[a1Index]) {
                result[resultIndex++] = ar1[a1Index++];
            } else {
                result[resultIndex++] = ar2[a2Index++];
            }
        }

        if (a1Index == ar1.length) {
            result[resultIndex] = ar2[a2Index];
        } else if (a2Index == ar2.length) {
            result[resultIndex] = ar1[a1Index];
        }

        return result;
    }

}


