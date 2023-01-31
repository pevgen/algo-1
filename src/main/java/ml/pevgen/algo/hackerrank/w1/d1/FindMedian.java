package ml.pevgen.algo.hackerrank.w1.d1;

import java.util.Collections;
import java.util.List;

public class FindMedian {

    public int  findMedian(List<Integer> arr) {
        Collections.sort(arr);
        int index = arr.size()/2;
        return arr.get(index);
    }
}
