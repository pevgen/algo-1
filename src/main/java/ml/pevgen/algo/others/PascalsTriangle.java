package ml.pevgen.algo.others;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();

        resultList.add(List.of(1));
        if (numRows > 1) {
            resultList.add(List.of(1,1));
        }
        for (int i = 2; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            int prevRowIndex = i-1;
            List<Integer> prevRow = resultList.get(prevRowIndex);
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }
            row.add(1);
            resultList.add(row);
        }

        return resultList;
    }
}
