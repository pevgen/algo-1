package ml.pevgen.algo.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(256741038);
        list.add(623958417);
        list.add(467905213);
        list.add(714532089);
        list.add(938071625);


        Collections.sort(list);
        long first = list.stream().limit(4).mapToLong(a-> a).sum();
        Collections.sort(list, Collections.reverseOrder());
        long second = list.stream().limit(4).mapToLong(a-> a).sum();
        System.out.println(first + " " + second);
    }
}
