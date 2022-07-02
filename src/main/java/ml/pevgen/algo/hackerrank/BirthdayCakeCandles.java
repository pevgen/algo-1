package ml.pevgen.algo.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(4);
        list.add(1);
        list.add(3);

        Collections.sort(list, Collections.reverseOrder());
        Integer maxCandleValue = list.get(0);
        int count = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(maxCandleValue)) {
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
