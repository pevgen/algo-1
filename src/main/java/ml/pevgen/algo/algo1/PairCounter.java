package ml.pevgen.algo.algo1;

import java.util.HashSet;
import java.util.Set;

public class PairCounter {

    /**
     * Write java function which calculates number of pairs in array. Pair is when two numbers added together,
     * result is zero.
     * Please consider only the first occurrence of each pair
     * array = {1,2,3,4,-1,-1,1,-2,2,-1,-2,2,3,4} ==> 2
     *
     * @param args
     */

    public static void main(String[] args) {

        int array[] = new int[]{1, 2, 3, 4, -1, -1, 1, -2, 2, -1, -2, 2, 3, 4};
        Set<Integer> ss = new HashSet<>();
        for (int num : array) {                 // time  = O(N)
            if (num < 0) {
                ss.add(num);
            }
        }

        int counter = 0;
        for (int num : array) {                  // time  = O(N)
            int addition = -num;
            if ((num > 0) && (ss.contains(addition))) {
                counter++;
                ss.remove(addition);
            }
        }

        // full complexity = O(N)

        System.out.println(counter);
    }
}
