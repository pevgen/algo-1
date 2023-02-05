package ml.pevgen.algo.hackerrank.w1.d4;

import java.util.Arrays;
import java.util.List;

public class GridChallenge {

    public String gridChallenge(List<String> grid) {
        char[] prev = grid.get(0).toCharArray();
        Arrays.sort(prev);
        for (int i = 1; i < grid.size(); i++) {
            char[] current = grid.get(i).toCharArray();
            Arrays.sort(current);
            for (int j = 0; j < grid.size(); j++) {
                if (prev[j] > current[j]) {
                    return "NO";
                }
            }
            prev = current;

        }
        return "YES";
    }

}
