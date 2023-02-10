package ml.pevgen.algo.hackerrank;

import java.util.List;

public class SumOfAllSubArrays {

    // O(N) = N2

    // in: [1, 3, 5]
    // 1 + [1 + 3] + [1 + 3 + 5]
    // 3 + [3 + 5]
    // 5

    public long sum(List<Integer> array) {
        int size = array.size();

        long sum = 0;
        for (int i = 0; i < size; i++) {  //  N

            long sum1 = 0;
            for (int j = i; j < size; j++) {  // N

                sum1 = sum1 + array.get(j);  //  sum array between current(i) and ending(size-1)

                sum = sum + sum1;  //
            }
        }


        return sum;
    }

}
