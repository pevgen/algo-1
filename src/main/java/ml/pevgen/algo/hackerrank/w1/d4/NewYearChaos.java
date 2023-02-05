package ml.pevgen.algo.hackerrank.w1.d4;

import java.util.Collections;
import java.util.List;

public class NewYearChaos {

    public int minimumBribes(List<Integer> arr) {

        int len = arr.size();
        int bribeCount = 0;
        for (int i = len - 1; i >= 0; i--) {
            int currentValue = i + 1;
            if (arr.get(i) != currentValue) {

                if (arr.get(i - 1) == currentValue) {
                    Collections.swap(arr, i - 1, i);
                    bribeCount++;
                } else if (arr.get(i - 2) == currentValue) {
                    Collections.swap(arr, i - 2, i - 1);
                    bribeCount++;
                    Collections.swap(arr, i - 1, i);
                    bribeCount++;
                } else {
                    System.out.println("Too chaotic");
                    return -1;
                }
            }

        }

        System.out.println(bribeCount);
        return bribeCount;
    }
}
